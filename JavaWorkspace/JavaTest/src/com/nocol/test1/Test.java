package com.nocol.test1;

/**
* @author lxp
*
* @TODO 
* 
*/
import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
public class Test extends Frame {
	public static final int GAME_WIDTH = 800;
	public static final int GAME_HEIGH = 600;
	// 坦克圆
	int x = 50, y = 50;
	Image offScreenImage = null;

	public void paint(Graphics g) {

		g.setColor(Color.RED);
		g.fillOval(x, y, 30, 30);
		y += 2;
	}// 重写update方法消除闪烁

	public void update(Graphics g) {
		if (offScreenImage == null) {
			offScreenImage = this.createImage(GAME_WIDTH, GAME_HEIGH);
		}
		Graphics goffScreen = offScreenImage.getGraphics();
		Color c = goffScreen.getColor();
		goffScreen.setColor(Color.GREEN);
		goffScreen.fillRect(0, 0, GAME_WIDTH, GAME_HEIGH);
		paint(goffScreen);
		g.drawImage(offScreenImage, 0, 0, null);
		goffScreen.setColor(c);
	}

	// 窗口设置
	public void lauchFrame() {
		this.setLocation(400, 300);
		this.setSize(GAME_WIDTH, GAME_HEIGH);
		this.addWindowListener(new WindowAdapter() {
			public void WindowClosing(WindowEvent e) {
				System.exit(0);
			}
		});
		this.setResizable(false);
		this.setBackground(Color.GREEN);
		setVisible(true);
		PaintThread p = new PaintThread();
		Thread t = new Thread(p);
		t.start();
	}// 主方法

	public static void main(String[] args) {
		Test tc = new Test();
		tc.lauchFrame();

	}// 启动线程另坦克圆动起来

	private class PaintThread implements Runnable {
		public void run() {
			while (true) {
				repaint();
				try {
					Thread.sleep(100);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
		}
	}

}