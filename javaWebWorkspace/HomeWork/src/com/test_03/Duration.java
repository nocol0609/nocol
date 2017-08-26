package com.test_03;

/*写Duration类，要求如下：
1.int类型属性hours、minutes、seconds
2.构造器，对hours、minutes、seconds进行初始化
3.构造器，对hours、minutes、seconds进行初始化，参数为总的seconds
4.对每个属性提供get方法
5.getTotalSeconds()方法，用于返回总的seconds
6.toString()方法，代码为return hours + ":" + minutes + ":" + seconds;*/
public class Duration {
	private int hours;
	private int minutes;
	private int seconds;

	public Duration() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Duration(int seconds) {
		this.seconds = seconds;
	}

	public Duration(int hours, int minutes, int seconds) {
		super();
		this.hours = hours;
		this.minutes = minutes;
		this.seconds = seconds;
	}

	public int getHours() {
		return hours;
	}

	public void setHours(int hours) {
		this.hours = hours;
	}

	public int getMinutes() {
		return minutes;
	}

	public void setMinutes(int minutes) {
		this.minutes = minutes;
	}

	public int getSeconds() {
		return seconds;
	}

	public void setSeconds(int seconds) {
		this.seconds = seconds;
	}

	@Override
	public String toString() {
		return hours + ":" + minutes + ":" + seconds;
	}

}
