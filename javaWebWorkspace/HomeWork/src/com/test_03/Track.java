package com.test_03;

/*дTrack�࣬Ҫ�����£�
1.String��������title��Duration��������duration
2.��ÿ�������ṩget��set����
3.toString()����������Ϊreturn "my Track title is: " + title + " duration is: " + duration;*/
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
