package com.briup.gather;

import java.io.BufferedReader;
import java.io.FileReader;
import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Properties;

import com.nocol.bean.BIDR;
import com.nocol.send.WossModuleInit;

/**
 * @author lxp
 *
 * @TODO
 * 
 */

public class Gather implements WossModuleInit {

	private String path;

	@Override
	public void init(Properties properties) {
		// TODO Auto-generated method stub
		path=properties.getProperty("path");
	}

	public Collection<BIDR> gather() throws Exception {

		FileReader reader = new FileReader(path);
		BufferedReader br = new BufferedReader(reader);
		System.out.println("�ɼ����ݿ�ʼ...");
		String len = null;
		String[] str = null;// �洢�ָ����ַ���
		BIDR bidr = null;
		// ������Map���ϣ����û�ipΪ��,BIDR����Ϊֵ�洢
		Map<String, BIDR> map = new HashMap<String, BIDR>();
		List<BIDR> list = new ArrayList<BIDR>();

		while ((len = br.readLine()) != null) {
			str = len.split("[|]");
			if ("7".equals(str[2])) {
				// ���ߵ�ʱ�򴴽�����
				bidr = new BIDR();

				bidr.setLogin_name(str[0]);
				bidr.setNAS_IP(str[1]);
				bidr.setLogin_ip(str[4]);
				Long time = Long.parseLong(str[3]);
				Timestamp login_date = new Timestamp(time * 1000);
				bidr.setLogin_date(login_date);
				map.put(str[4], bidr);
			} else {
				bidr = map.get(str[4]);
				Long time = Long.parseLong(str[3]);
				Timestamp logout_date = new Timestamp(time * 1000);
				bidr.setLogout_date(logout_date);
				int time_duration = (int) (bidr.getLogout_date().getTime() - bidr.getLogin_date().getTime());
				bidr.setTime_duration(time_duration);
				list.add(bidr);
			}
		}
		System.out.println("���ݲɼ����");
		return list;
	}
}
