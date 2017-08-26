package com.briup.view;

import java.awt.BorderLayout;
import java.awt.Canvas;
import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.sql.rowset.serial.SerialArray;
import javax.swing.BorderFactory;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JRadioButton;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

import com.briup.bean.UserBean;
import com.briup.server.IUserServer;
import com.briup.server.UserServerImpl;

/**
 * 注册界面
 * 
 * @author Administrator
 *
 */
public class RegisterView extends JFrame {
	private static int count;
	private IUserServer server;
	private UserBean user;
	
	private boolean flag;
	private boolean fl;
	// North Area
	private Canvas canvas;
	// Center Area
	private JPanel centerPan;
	private GridBagLayout gbl = new GridBagLayout();
	private GridBagConstraints gbc = new GridBagConstraints();
	private JLabel nameLb = new MyLabel("姓  名  ");
	private JTextField nameTf = new JTextField(16);
	private JLabel pwdLb = new MyLabel("密  码  ");
	private JPasswordField pwdTf = new JPasswordField(16);
	private JLabel genderLb = new MyLabel("性  别  ");
	public JRadioButton maleRb = new JRadioButton("男", true);
	public JRadioButton femaleRb = new JRadioButton("女", false);
	private JLabel telLb = new MyLabel("电  话  ");
	private JTextField telTf = new JTextField(16);
	private JLabel addressLb = new MyLabel("地  址  ");
	private JTextArea addressTa = new JTextArea(3, 16);
	// South Area

	private JPanel southPan = new MyPanel();
	private JButton resetBtn = new MyButton("重置");

	private JButton registerBtn = new MyButton("注册");

	public RegisterView() {
        user=new UserBean();
		server=new UserServerImpl();
		initComponent();
	}

	private void initComponent() {
		buildNorth();
		buildCenter();
		buildSouth();

		add(BorderLayout.NORTH, canvas);
		add(BorderLayout.CENTER, centerPan);
		add(BorderLayout.SOUTH, southPan);

		setTitle("Estore - 用户注册");
		setResizable(false);
		setVisible(true);
		CommonSetting.initShape(this, 328, 300);
		//重置监听按钮
		resetBtn.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				setNull();
			}
		});
		//注册监听按钮
		registerBtn.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				String name=nameTf.getText().trim();
				String passwd=pwdTf.getText();
				String tel=telTf.getText();
				String address=addressTa.getText();
				if(name.equals("")){
					JOptionPane.showMessageDialog(null, "用户不能为空");
				}else if(passwd.equals("")){
					JOptionPane.showMessageDialog(null, "密码不能为空");
				}else {
					UserBean userBean=new UserBean(++count,name,passwd,tel,address);
					
					server.register(userBean);
					
					JOptionPane.showMessageDialog(null, "注册成功");
					setVisible(false);
					new LoginView().setVisible(true);
				}
			
			}
		});
	}

	private void buildNorth() {
		canvas = new Canvas() {
			@Override
			public void paint(Graphics g) {
				g.drawImage(
						Toolkit.getDefaultToolkit().getImage(
								RegisterView.class
										.getResource("/images/login.gif")), 0,
						0, 324, 47, null, this);
			}
		};
		canvas.setSize(324, 47);
	}

	private void buildCenter() {
		JPanel centerPan = new InsetPanel(new Insets(5, 5, 5, 5));
		// centerPan.setBorder(BorderFactory.createLineBorder(new
		// Color(0x90,0xB9,0xD7), 1));
		centerPan.setBackground(new Color(0xF1, 0xFA, 0xFF));
		centerPan.setLayout(gbl);
		gbl.setConstraints(nameLb, gbc);
		centerPan.add(nameLb);
		gbc.gridwidth = GridBagConstraints.REMAINDER;
		gbl.setConstraints(nameTf, gbc);
		centerPan.add(nameTf);
		gbc.gridwidth = 1;
		gbl.setConstraints(pwdLb, gbc);
		centerPan.add(pwdLb);
		gbc.gridwidth = GridBagConstraints.REMAINDER;
		gbl.setConstraints(pwdTf, gbc);
		centerPan.add(pwdTf);
		gbc.gridwidth = 1;
		gbl.setConstraints(genderLb, gbc);
		centerPan.add(genderLb);
		maleRb.setFont(new Font("宋体", Font.PLAIN, 12));
		maleRb.setBackground(new Color(0xF1, 0xFA, 0xFF));
		gbl.setConstraints(maleRb, gbc);
		centerPan.add(maleRb);
		gbc.gridwidth = GridBagConstraints.REMAINDER;
		femaleRb.setFont(new Font("宋体", Font.PLAIN, 12));
		femaleRb.setBackground(new Color(0xF1, 0xFA, 0xFF));
		gbl.setConstraints(femaleRb, gbc);
		centerPan.add(femaleRb);
		gbc.gridwidth = 1;
		gbl.setConstraints(telLb, gbc);
		centerPan.add(telLb);
		gbc.gridwidth = GridBagConstraints.REMAINDER;
		gbl.setConstraints(telTf, gbc);
		centerPan.add(telTf);
		gbc.gridwidth = 1;
		gbl.setConstraints(addressLb, gbc);
		centerPan.add(addressLb);
		gbc.gridwidth = GridBagConstraints.REMAINDER;
		gbc.insets.bottom = 0;
		gbl.setConstraints(addressTa, gbc);
		addressTa.setBorder(BorderFactory.createLineBorder(new Color(0x7A,
				0x8A, 0x99)));
		addressTa.setLineWrap(true);
		centerPan.add(addressTa);

		ButtonGroup genderBg = new ButtonGroup();
		genderBg.add(maleRb);
		genderBg.add(femaleRb);

		this.centerPan = new InsetPanel(new Insets(5, 5, 5, 5));
		this.centerPan.setLayout(new BorderLayout());
		this.centerPan.add(centerPan);
	}

	private void buildSouth() {
		southPan.add(resetBtn, SwingConstants.CENTER);
		southPan.add(registerBtn, SwingConstants.CENTER);
	}

	// 给重置以及注册按钮加上事件监听器
	public void addActionListeners(ActionListener[] ls) {
		// cancelBtn.addActionListener(ls[0]);
		registerBtn.addActionListener(ls[1]);

		/*
		 * registerBtn.addActionListener(new ActionListener() {
		 * 
		 * @Override public void actionPerformed(ActionEvent e) {
		 * 
		 * String name=nameTf.getText().trim(); if(name.equals("")){
		 * JOptionPane.showMessageDialog(null, "请输入用户名"); return; }
		 * if(name.contains(" ")){ JOptionPane.showMessageDialog(null,
		 * "用户名包含非法字符"); return; } String pwd=pwdTf.getText().trim();
		 * if(pwd.equals("")){ JOptionPane.showMessageDialog(null, "请输入密码");
		 * return; } if(pwd.contains(" ")){ JOptionPane.showMessageDialog(null,
		 * "密码包含非法字符"); return; } Customer customer=null;
		 * customer.setName(name); customer.setPassword(pwd); String
		 * tel=telTf.getText().trim(); customer.setTelephone(tel); String
		 * address=addressTa.getText().trim(); customer.setAddress(address);
		 * flag=maleRb.isSelected(); if(flag){ customer.setGender("男");
		 * 
		 * } fl=femaleRb.isSelected(); if(fl=false){ customer.setGender("女"); }
		 * try { icustomerImpl.region(customer);
		 * JOptionPane.showMessageDialog(null, "注册成功"); } catch
		 * (CustomerException e1) { e1.printStackTrace();
		 * JOptionPane.showMessageDialog(null, e1.getMessage()); }
		 * 
		 * } }); cancelBtn.addActionListener(new ActionListener() {
		 * 
		 * @Override public void actionPerformed(ActionEvent e) {
		 * nameTf.setText("");
		 * 
		 * } });
		 */

	}

	/*
	 * public Customer getCus(){ Customer customer=new Customer();
	 * customer.setName(nameTf.getText());
	 * customer.setPassword(pwdTf.getText());
	 * customer.setTelephone(telTf.getText());
	 * customer.setAddress(addressTa.getText());
	 */
	/*
	 * flag=maleRb.isSelected(); if(flag){ customer.setGender("男");
	 * 
	 * } fl=femaleRb.isSelected(); if(fl=true){ customer.setGender("女"); }
	 * return customer; }
	 */
	public void setNull() {
		nameTf.setText("");
		pwdTf.setText("");
		telTf.setText("");
		addressTa.setText("");
	}

	public static void main(String[] args) {
		new RegisterView();
	}
}