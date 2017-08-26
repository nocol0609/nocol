package com.nocol_03;

import java.util.Scanner;

/**
 * @author lxp
 *
 * @TODO
 * 
 */
/*
 * 模拟登录并玩猜数字 游戏,给三次机会,并提示还有几次。
 * 
 * 分析： A:定义用户名和密码。已存在的。 
 *      B:键盘录入用户名和密码。 
 *      C:比较用户名和密码。 如果都相同，则登录成功，这是可玩猜数字有戏，如果有一个不同，则登录失败
 *      D:给三次机会，用循环改进，最好用for循环。
 */
// 定义游戏类
class GuessNumber {
	// 定义无参构造方法
	private GuessNumber() {}

	// 定义游戏方法
	public static void start() {  //定义static静态，调用时不用创对象，类名可直接调
		// 产生随机数
		int GuessNumber = (int) (Math.random() * 100) + 1;
       //循环，猜中为止
		while (true) {
			// 创建Scanner对象
			Scanner sc = new Scanner(System.in);
			System.out.println("请输入你要猜的数（0-100）：");
			int number = sc.nextInt();
			// 判断
			if (GuessNumber > number) {
				System.out.println("你猜的数小了");
			} else if (GuessNumber < number) {
				System.out.println("你猜的数大了");
			} else {
				System.out.println("猜中了！！！");
			}
		}
	}
}
public class StringTest {
	public static void main(String[] args) {
		// 定义用户名和密码
		String userName = "nocol";
		String password = "123";
		// 3次机会
		for (int x = 1; x < 4; x++) {
			// 键盘获取输入的用户名及密码
			Scanner sc = new Scanner(System.in);
			System.out.println("请输入用户名：");
			String name = sc.nextLine();
			System.out.println("请输入密码：");
			String pwd = sc.nextLine();

			// 判断
			if (name.equals(userName) && pwd.equals(password)) {
				System.out.println("登录成功，可以玩猜数有戏了");
					GuessNumber.start();
			} else {
				if ((3 - x) == 0) {
					System.out.println("用户冻结");
				} else {
					System.out.println("登录失败，你还有" + (3 - x) + "次机会");
				}
			}
		}
	}
}
