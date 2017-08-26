package com.nocol.utils;

import java.util.Properties;

import javax.mail.Authenticator;
import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.AddressException;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;
import javax.mail.internet.MimeMessage.RecipientType;

public class MailUtils {

	public static void sendMail(String email, String emailMsg)
			throws AddressException, MessagingException {

		Properties props = new Properties();
		//设置发送的协议
		props.setProperty("mail.transport.protocol", "SMTP");
		//设置发送邮件的服务器
		props.setProperty("mail.host", "localhost");
		// 指定验证为true
		props.setProperty("mail.smtp.auth", "true");
		//打印发送过程
		props.setProperty("mail.debug", "true");

		// 创建验证器
		Authenticator auth = new Authenticator() {
			public PasswordAuthentication getPasswordAuthentication() {
				//设置发送人的帐号和密码
				return new PasswordAuthentication("service", "123");
			}
		};
		
		//创建程序到邮件之间的会话
		Session session = Session.getInstance(props, auth);

		// 2.创建一个Message对象，它相当于是邮件内容
		Message message = new MimeMessage(session);

		//设置发送者
		message.setFrom(new InternetAddress("service@nocol.com"));

		//设置发送方式与接收者
		message.setRecipient(RecipientType.TO, new InternetAddress(email)); 

		//设置邮件主题
		message.setSubject("用户激活");
		// message.setText("这是一封激活邮件，请<a href='#'>点击</a>");
		//message.setText(user.getUsername()+",点击如下连接激活账户,如果不能点击请复制到浏览器地址栏访问:http://www.estore.com/ActiveServlet?activecode="+user.getActivecode());

		//设置邮件内容
		message.setContent(emailMsg, "text/html;charset=utf-8");

		// 3.创建 Transport用于将邮件发送
		Transport.send(message);
	}
}
