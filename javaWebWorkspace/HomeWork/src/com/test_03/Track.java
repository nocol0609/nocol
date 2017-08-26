package com.test_03;

/*写Track类，要求如下：
1.String类型属性title、Duration类型属性duration
2.对每个属性提供get和set方法
3.toString()方法，代码为return "my Track title is: " + title + " duration is: " + duration;*/
public class Track {
	
	private String title;
	private Duration duration;

	public Track() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Track(String title, Duration duration) {
		super();
		this.title = title;
		this.duration = duration;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public Duration getDuration() {
		return duration;
	}

	public void setDuration(Duration duration) {
		this.duration = duration;
	}

	@Override
	public String toString() {
		return "my Track title is: " + title + " duration is: " + duration;
	}

}
