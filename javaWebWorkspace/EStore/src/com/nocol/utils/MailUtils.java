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
		//���÷��͵�Э��
		props.setProperty("mail.transport.protocol", "SMTP");
		//���÷����ʼ��ķ�����
		props.setProperty("mail.host", "localhost");
		// ָ����֤Ϊtrue
		props.setProperty("mail.smtp.auth", "true");
		//��ӡ���͹���
		props.setProperty("mail.debug", "true");

		// ������֤��
		Authenticator auth = new Authenticator() {
			public PasswordAuthentication getPasswordAuthentication() {
				//���÷����˵��ʺź�����
				return new PasswordAuthentication("service", "123");
			}
		};
		
		//���������ʼ�֮��ĻỰ
		Session session = Session.getInstance(props, auth);

		// 2.����һ��Message�������൱�����ʼ�����
		Message message = new MimeMessage(session);

		//���÷�����
		message.setFrom(new InternetAddress("service@nocol.com"));

		//���÷��ͷ�ʽ�������
		message.setRecipient(RecipientType.TO, new InternetAddress(email)); 

		//�����ʼ�����
		message.setSubject("�û�����");
		// message.setText("����һ�⼤���ʼ�����<a href='#'>���</a>");
		//message.setText(user.getUsername()+",����������Ӽ����˻�,������ܵ���븴�Ƶ��������ַ������:http://www.estore.com/ActiveServlet?activecode="+user.getActivecode());

		//�����ʼ�����
		message.setContent(emailMsg, "text/html;charset=utf-8");

		// 3.���� Transport���ڽ��ʼ�����
		Transport.send(message);
	}
}
