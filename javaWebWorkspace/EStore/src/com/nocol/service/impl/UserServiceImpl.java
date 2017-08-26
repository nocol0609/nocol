package com.nocol.service.impl;

import java.util.Properties;
import java.util.UUID;

import javax.mail.Authenticator;
import javax.mail.Message;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;
import javax.mail.internet.MimeMessage.RecipientType;

import com.nocol.bean.User;
import com.nocol.dao.UserDao;
import com.nocol.dao.impl.UserDaoImpl;
import com.nocol.service.UserService;
import com.nocol.utils.DataSourceUtils;

public class UserServiceImpl implements UserService {
	UserDao dao = new UserDaoImpl();

	/**
	 * 调用dao层
	 */
	@Override
	public void regist(User user) {
		// TODO Auto-generated method stub
		try {

			// 开启事务
			DataSourceUtils.startTransaction();

			// 校验用户名是否存在
			if (dao.findUserByName(user.getUsername()) != null) {// 说明已注册
				throw new RuntimeException("该用户已存在");
			}
			// 调用dao方法添加到数据库
			user.setRole("user");
			user.setState(0);
			user.setActivecode(UUID.randomUUID().toString());

			dao.addUser(user);
			System.out.println("添加用户成功");
			User user2 = dao.findUserByName(user.getUsername());
			System.out.println(user2);

			/**
			 * 发送激活邮件
			 */

			Properties props = new Properties();
			// 设置发送的协议
			props.setProperty("mail.transport.protocol", "SMTP");
			// 设置发送邮件的服务器
			props.setProperty("mail.host", "localhost");
			// 指定验证为true
			props.setProperty("mail.smtp.auth", "true");
			// 打印发送过程
			props.setProperty("mail.debug", "true");
			// 创建验证器
			Authenticator auth = new Authenticator() {
				public PasswordAuthentication getPasswordAuthentication() {
					// 设置发送人的帐号和密码
					return new PasswordAuthentication("service", "123");
				}
			};
			// 创建程序到邮件之间的会话
			Session session = Session.getInstance(props, auth);
			// 2.创建一个Message对象，它相当于是邮件内容
			Message message = new MimeMessage(session);
			// 设置发送者
			message.setFrom(new InternetAddress("service@nocol.com"));
			// 设置发送方式与接收者
			message.setRecipient(RecipientType.TO, new InternetAddress(user.getEmail()));
			// 设置邮件主题
			message.setSubject(user.getUsername() + ",来自EStore的激活邮件");
			message.setText("恭喜您成功注册,点击如下连接激活账户,如果不能点击请复制到浏览器地址栏访问:http://127.0.0.1:8088/EStore/active?code="
					+ user.getActivecode());
			// 3.创建 Transport用于将邮件发送
			Transport.send(message);

			// 提交事务
			DataSourceUtils.commitAndClose();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			
			// 回滚事务
			DataSourceUtils.rollbackAndClose();
			
			e.printStackTrace();
		}
	}

	/**
	 * 激活用户
	 */
	@Override
	public void activeUser(String activecode) {
		// TODO Auto-generated method stub

		// 调用dao根据激活码查找用户
		User user = dao.findUserByActiveCode(activecode);

		System.out.println("根据激活码查询的用户：" + user);

		if (user == null) {
			throw new RuntimeException("激活码不正确！");
		}
		// 判断是否已经激活
		if (user.getState() == 1) {
			throw new RuntimeException("该用户已被激活！");
		}
		// 如果没激活但是激活码已经超时,则提示,并删除此用户
		if (System.currentTimeMillis() - user.getUpdatetime().getTime() > 1000 * 3600 * 24) {
			dao.deleteUser(user.getId());
			throw new RuntimeException("激活码已经超时,请重新注册并在24小时内激活!");
		}
		// 5.调用dao中修改用户激活状态的方法
		dao.updateState(user.getId(), 1);
	}

	/**
	 * 根据用户和密码查询用户
	 */
	@Override
	public User findUserByNameAndPwd(String name, String pwd) {
		// TODO Auto-generated method stub
		// 调用dao层方法
		return dao.findUserByNameAndPwd(name, pwd);
	}
}
