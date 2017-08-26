package com.nocol.send;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.List;
import java.util.Properties;

import com.nocol.bean.BIDR;

public class DBImpl implements WossModuleInit {
	private static String url;
	private String user;
	private String pwd;
	private static Connection connection;
	private PreparedStatement preStatment;
	// 缓存的大小
	private static int batchSize;

	@Override
	public void init(Properties properties) {
		url = properties.getProperty("url");
		user = properties.getProperty("user");
		pwd = properties.getProperty("pwd");
		batchSize = Integer.parseInt(properties.getProperty("batchSize"));
	}

	public void dbstore(List<BIDR> list) {
		int count = 0;
		try {
			connection = DriverManager.getConnection(url, user, pwd);
			System.out.println("数据库连接成功，开始入库...");
			connection.setAutoCommit(false);// 不自动提交
			int day = 0;
			for (BIDR bidr : list) {
				if (day != bidr.getLogin_date().getDate()) {
					day = bidr.getLogin_date().getDate();
					System.out.println("插入数据天数：" + day);
					if (preStatment != null) {
						preStatment.executeBatch();
						connection.commit();
						preStatment.close();
					}
					String sql = "insert into t_detail_" + day + " values(?,?,?,?,?,?)";
					preStatment = connection.prepareStatement(sql);
				}
				preStatment.setString(1, bidr.getLogin_name());
				preStatment.setString(2, bidr.getLogin_ip());
				preStatment.setString(3, bidr.getNAS_IP());
				preStatment.setTimestamp(4, bidr.getLogin_date());
				preStatment.setTimestamp(5, bidr.getLogout_date());
				preStatment.setInt(6, bidr.getTime_duration());
				preStatment.addBatch();
				count++;
				if (count % batchSize == 0) {
					preStatment.executeBatch();
					connection.commit();
				}
			}
			if (preStatment != null) {
				preStatment.executeBatch();
				connection.commit();
			}

		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("数据插入完成，总共条数是:" + count);
	}
}
