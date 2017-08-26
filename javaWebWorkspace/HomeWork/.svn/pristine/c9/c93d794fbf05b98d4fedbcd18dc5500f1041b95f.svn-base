package com.test_13;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;

/*
 * 在*****  ******位置加入新内容，内容为:
　　核心提示：第十二任台湾地区领导人选举今日举行，马萧(马英九、萧万长)竞选总部统计宣称已获得超过700万张选票，自行宣布当选。 

文件a的输入内容如下

　综合港台媒体消息，台湾地区领导人选举正在开票中。上一届台湾地区领导人选举投票率为80.28%，台选务主管机构预估，本届选情不若上届热络，保守估计约七成五。按此换算成选票约是1300万票，即只要任一方获得超过650万票过半门槛，就铁定当选。
*****  ******
　　据中评社消息，下午6时左右，马萧得票破700万，胜谢苏200多万票。国民党主席吴伯雄、秘书长吴敦义已抵马萧总部。吴伯雄自行宣布当选。
 */
public class Test3 {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new FileReader("a.txt"));
		BufferedWriter bw = new BufferedWriter(new FileWriter("a1.txt"));
		String line = null;
		while((line=br.readLine())!=null){
			if("***** ******"!=line){
				bw.write(line);
				bw.newLine();
				bw.flush();
			}else {
				String s = "核心提示：第十二任台湾地区领导人选举今日举行，马萧(马英九、萧万长)竞选总部统计宣称已获得超过700万张选票，自行宣布当选。";
				bw.write(s);
				bw.flush();
			}
		}
		
//		bw.write(line);
//		bw.newLine();
//		String s1 = "核心提示：第十二任台湾地区领导人选举今日举行，马萧(马英九、萧万长)竞选总部统计宣称已获得超过700万张选票，自行宣布当选。";
//		bw.write(s1);
//		String s2 = br.readLine();// ***** ******
//		if ("*****  ******" !=s2) {
//			bw.newLine();
//			bw.write(s2);
//		}
//		String s3 = br.readLine();
//		if ("*****  ******" == s3) {
//			bw.newLine();
//		}else {
//			bw.newLine();
//			bw.write(s3);
//		}
		
		br.close();
		bw.close();
	}
}
