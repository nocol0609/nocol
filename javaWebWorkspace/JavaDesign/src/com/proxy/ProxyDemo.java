package com.proxy;

/**
 * @author lxp
 *
 * @TODO
 * 
 */
public class ProxyDemo {
	public static void main(String[] args) {
		// 创建电脑代理对象
		ComputerProxy computerProxy = new ComputerProxy("nocol");
		// 代理销售电脑
		computerProxy.sellComputer();
	}
}
