package com.timer;

import java.io.File;
import java.util.Timer;
import java.util.TimerTask;

/**
* @author lxp
*
* @TODO 
* 
*/
/*
 * 需求：在指定的时间删除我们的指定目录()
 */
//创建任务
class Task extends TimerTask{
	private Timer t;
	
	public Task(Timer t) {
		this.t = t;
	}

	@Override
	public void run() {
		//封装目录
		File srcFoder=new File("deom");
		deleteFolder(srcFoder);
		t.cancel();
	}
    //递归删除文件夹
	private void deleteFolder(File srcFoder) {
		File[] fileArray=srcFoder.listFiles();
		if(fileArray!=null){
			for(File file:fileArray){
				if(file.isDirectory()){
					deleteFolder(file);
				}else {
					System.out.println(file.getName()+"---"+file.delete());
				}
			}
			System.out.println(srcFoder.getName()+"---"+srcFoder.delete());
		}
	}
}
public class TimerTest {
	 public static void main(String[] args) {
		//创建定时器对象
		 Timer t=new Timer();
		 //制定精确时间删除
//		 String s = "2017-1-27 15:45:00";
//		 SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
//		 Date d = sdf.parse(s);//将解析后的字符串转换成Date类型

		 //启动任务
		 t.schedule(new Task(t), 3000); //三秒后删除文件
	}
}
