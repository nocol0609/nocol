package com.briup.view;

import java.awt.Color;
import java.awt.Component;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.awt.Toolkit;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.SwingConstants;

/**
 * GUI 公共设置属性以及方法
 * 
 */
public class CommonSetting {
	static Dimension screen = Toolkit.getDefaultToolkit().getScreenSize();

	public static final String DISPLAY_ALL_BOOK = "displayAllBook";
	public static final String DISPLAY_CUSTOMER = "displayCustomer";
	public static final String DISPLAY_CART = "displayCart";
	public static final String CONFIRM_ORDER = "confirmOrder";
	public static final String DISPLAY_ORDER = "displayOrder";

	static void initShape(JFrame frame, int width, int height) {
		int x = (screen.width - width) / 2;
		int y = (screen.height - height) / 2 - 40;

		frame.setLocation(x, y);
		frame.setSize(width, height);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setIconImage(Toolkit.getDefaultToolkit().getImage(
				CommonSetting.class.getResource("/images/flyfox.gif")));
	}

	static void initShape(Container c, int width, int height) {
		int x = (screen.width - width) / 2;
		int y = (screen.height - height) / 2 - 40;

		c.setLocation(x, y);
		c.setSize(width, height);
	}

	// 使用GridBagLayout加入组件
	static void addLayoutComponent(JPanel pan, Component c, GridBagLayout gb,
			GridBagConstraints gbc, int gridwidth) {
		gbc.gridwidth = gridwidth;
		gb.addLayoutComponent(c, gbc);
		pan.add(c);
	}
}

/**
 * 自定义的组件，用来方便生成有特殊背景，颜色以及边距的外观组件
 * 
 * @author TonyDeng
 * @version 1.0 2009-1-24
 *
 */
class MyPanel extends JPanel {
	public MyPanel() {
		super();
		setBackground(new Color(0xE1, 0xF5, 0xFC));
	}
}

class MyLabel extends JLabel {
	public MyLabel(String s) {
		super(s, SwingConstants.RIGHT);
		setFont(new Font("宋体", Font.PLAIN, 12));
		this.setForeground(new Color(0x0D, 0x37, 0x55));
	}
}

class MyLabelPro extends JLabel {
	public MyLabelPro(String s) {
		super(s);
		setFont(new Font("宋体", Font.PLAIN, 14));
	}
}

class MyButton extends JButton {
	public MyButton(String s) {
		super(s);
		setFont(new Font("宋体", Font.PLAIN, 12));
		setForeground(new Color(0x10, 0x41, 0x61));

	}
}

class InsetPanel extends MyPanel {
	Insets i;

	public InsetPanel(Insets i) {
		this.i = i;
	}

	public Insets getInsets() {
		return i;
	}
}

class InsetPanelNoColor extends JPanel {
	Insets i;

	public InsetPanelNoColor(Insets i) {
		this.i = i;
	}

	public Insets getInsets() {
		return i;
	}
}

class MyJRadioButton extends JRadioButton {
	public MyJRadioButton(String title, boolean flag) {
		super(title, flag);
		setFont(new Font("宋体", Font.PLAIN, 12));
	}
}