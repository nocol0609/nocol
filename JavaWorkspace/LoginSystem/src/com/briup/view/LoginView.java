package com.briup.view;

import java.awt.BorderLayout;
import java.awt.Canvas;
import java.awt.Color;
import java.awt.Event;
import java.awt.Graphics;
import java.awt.Insets;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

import com.briup.bean.UserBean;
import com.briup.server.IUserServer;
import com.briup.server.UserServerImpl;

/**
 * 登录界面
 * 
 * @author Administrator
 *
 */

public class LoginView extends JFrame {
	private IUserServer server;
	private UserBean user;
	@Override
    public boolean action(Event evt, Object what) {
	// TODO Auto-generated method stub
	return super.action(evt, what);
}
	
	private static final long serialVersionUID = -6201525576920747599L;
	// North Area
	private Canvas canvas;
	// Center Area
	private JPanel centerPan;
	private JLabel nameLb = new MyLabel(" 姓  名 ");
	private JTextField nameTf = new JTextField(16);
	private JLabel nameTipLb = new JLabel("      ");
	private JLabel pwdLb = new MyLabel(" 密  码 ");
	private JPasswordField pwdTf = new JPasswordField(16);
	private JLabel pwdTipLb = new JLabel("      ");
	// South Area
	private JPanel southPan = new MyPanel();
	private JButton loginBtn = new MyButton("登录");
	private JButton cancelBtn = new MyButton("重置");
	private JButton registerBtn = new MyButton("注册");

	public LoginView() {
		initComponent();
		server=new UserServerImpl();
		user=new UserBean();
		//登入按钮的监听
		loginBtn.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				//获取用户输入的用户名
				String name=nameTf.getText().trim();
				//获取用户输入的密码
				String  passwd=pwdTf.getText().trim();
				if(name.equals("")){
					JOptionPane.showMessageDialog(null, "请输入用户名");
				}else if(passwd.equals("")){
					JOptionPane.showMessageDialog(null, "请输入密码");
				}else{
					String result=server.login(name, passwd);
					JOptionPane.showMessageDialog(null, result);
				}
				//JOptionPane.showMessageDialog(null, "请输入密码");

			}
		});
		//重置按钮的监听
		cancelBtn.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				nameTf.setText("");
				pwdTf.setText("");

			}
		});
		//注册按钮的监听
		registerBtn.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				setVisible(false);
				new RegisterView().setVisible(true);

			}
		});
	}

	private void initComponent() {
		buildNorth();
		buildCenter();
		buildSouth();

		add(BorderLayout.NORTH, canvas);
		add(BorderLayout.CENTER, centerPan);
		add(BorderLayout.SOUTH, southPan);

		setTitle("Estore - 用户登录");
		setResizable(false);
		CommonSetting.initShape(this, 328, 188);
		setVisible(true);   //设置当前界面可见
	}

	private void buildNorth() {
		canvas = new Canvas() {
			@Override
			public void paint(Graphics g) {
				g.drawImage(
						Toolkit.getDefaultToolkit().getImage(
								LoginView.class
										.getResource("/images/login.gif")), 0,
						0, 324, 47, null, this);
			}
		};
		canvas.setSize(324, 47);
	}

	private void buildCenter() {
		JPanel centerPan = new InsetPanel(new Insets(5, 5, 5, 5));
		centerPan.setBorder(BorderFactory.createLineBorder(new Color(0x90,
				0xB9, 0xD7), 1));
		centerPan.setBackground(new Color(0xF1, 0xFA, 0xFF));
		centerPan.add(nameLb);
		centerPan.add(nameTf);
		centerPan.add(nameTipLb);
		centerPan.add(pwdLb);
		centerPan.add(pwdTf);
		centerPan.add(pwdTipLb);

		this.centerPan = new InsetPanel(new Insets(5, 5, 5, 5));
		this.centerPan.setLayout(new BorderLayout());
		this.centerPan.add(centerPan);
	}

	private void buildSouth() {
		southPan.add(registerBtn, SwingConstants.CENTER);
		southPan.add(cancelBtn, SwingConstants.CENTER);
		southPan.add(loginBtn, SwingConstants.CENTER);
	}

	public void setNull() {
		nameTf.setText("");
		pwdTf.setText("");
	}

	public static void main(String[] args) {
		new LoginView();
	}
}
