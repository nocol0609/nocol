package com.test_03;

/*дDuration�࣬Ҫ�����£�
1.int��������hours��minutes��seconds
2.����������hours��minutes��seconds���г�ʼ��
3.����������hours��minutes��seconds���г�ʼ��������Ϊ�ܵ�seconds
4.��ÿ�������ṩget����
5.getTotalSeconds()���������ڷ����ܵ�seconds
6.toString()����������Ϊreturn hours + ":" + minutes + ":" + seconds;*/
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
