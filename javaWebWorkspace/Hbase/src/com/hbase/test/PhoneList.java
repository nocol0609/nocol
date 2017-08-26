package com.hbase.test;

import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Map.Entry;
import java.util.NavigableMap;
import java.util.Random;
import java.util.Set;

import org.apache.hadoop.conf.Configuration;
import org.apache.hadoop.hbase.HColumnDescriptor;
import org.apache.hadoop.hbase.HTableDescriptor;
import org.apache.hadoop.hbase.TableName;
import org.apache.hadoop.hbase.client.Admin;
import org.apache.hadoop.hbase.client.Connection;
import org.apache.hadoop.hbase.client.ConnectionFactory;
import org.apache.hadoop.hbase.client.Put;
import org.apache.hadoop.hbase.client.Result;
import org.apache.hadoop.hbase.client.ResultScanner;
import org.apache.hadoop.hbase.client.Scan;
import org.apache.hadoop.hbase.client.Table;
import org.apache.hadoop.hbase.filter.CompareFilter.CompareOp;
import org.apache.hadoop.hbase.filter.FilterList;
import org.apache.hadoop.hbase.filter.PrefixFilter;
import org.apache.hadoop.hbase.filter.SingleColumnValueFilter;
import org.apache.hadoop.hbase.util.Bytes;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * ʹ��hbase���ݿ�洢�û��ĵ绰�굥
 * 
 * ���Ҳ�ѯ���û��������ͨ���굥
 * 
 * @author ������
 * @date 2017��7��24��
 * @time ����10:00:58
 */
public class PhoneList {

	// ��ȡ����
	private Configuration config;
	// ���Ӷ���
	private Connection conn;
	// ����DDL
	private Admin admin;
	// ����DML
	private Table table;

	/**
	 * ��ȡ���ݿ�����
	 */
	@Before
	public void getConn() {

		try {

			config = new Configuration();
			// ����zookeeper
			config.set("hbase.zookeeper.quorum", "192.168.44.129");
			// ��ȡ����
			conn = ConnectionFactory.createConnection(config);

		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	/**
	 * ������
	 * 
	 * type : ���л��߱������� 0����,1����
	 * 
	 * phone : �Է��ĺ���
	 * 
	 * time : ͨ����ʱ��
	 * 
	 */
	@Test
	public void createtable() {

		try {
			// ��ȡadmin
			admin = conn.getAdmin();

			if (admin != null) {
				// �ж�Ҫ�����ı��Ƿ���ڣ���������ɾ��
				if (admin.tableExists(TableName.valueOf("phonelist"))) {
					// �Ƚ��ñ�
					admin.disableTable(TableName.valueOf("phonelist"));
					// ɾ����
					admin.deleteTable(TableName.valueOf("phonelist"));
				}
			}

			// ��������������
			HTableDescriptor tableDescriptor = new HTableDescriptor(TableName.valueOf("phonelist"));

			// ����������������
			HColumnDescriptor columnDescriptor = new HColumnDescriptor(Bytes.toBytes("cf1"));

			// ����������
			columnDescriptor.setBlockCacheEnabled(true);

			// �Ƿ���ص��ڴ�
			columnDescriptor.setInMemory(true);

			// �������汾������С�汾���Ѿ�ȷ����
			columnDescriptor.setMaxVersions(5);

			// ������������ӽ�����������
			tableDescriptor.addFamily(columnDescriptor);

			// ������
			admin.createTable(tableDescriptor);

			System.out.println("�������ɹ���");

		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	/**
	 * ����в�������
	 * 
	 * ��ʮ���绰����,ÿ���绰100��ͨ���굥
	 * 
	 * @throws Exception
	 */
	@Test
	public void insertData() throws Exception {

		// ��ȡ������
		table = conn.getTable(TableName.valueOf("phonelist"));
		Random random = new Random();

		// �绰����
		String pNum = "";

		// rowkey
		String rowkey = "";

		// ������������
		List<Put> puts = new ArrayList<Put>();
		Put put = null;

		// ����ʱ���ʽ��ģʽ
		SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");

		for (int i = 0; i < 20; i++) {
			// ��ȡ�û��ĵ绰����
			pNum = getPhoneNum("186");

			// Ϊÿ������������Ӧ��������ֵ
			for (int j = 0; j < 100; j++) {

				// �Է�����
				String phone = getPhoneNum("176");
				// ʱ��
				String dateStr = getDate("2016");

				Date date = format.parse(dateStr);

				/**
				 * ����rowkey,��ƺ���Ҫ
				 * 
				 * ����rowkey�����ֵ�����������,����ʹ������longֵ��ȥʱ��ʹ�ò�ѯ�������굥 ����ʱ��Ľ�������
				 * 
				 * ��ѯ�������굥����������ʾ����ǰ��
				 */
				rowkey = pNum + (Long.MAX_VALUE - date.getTime());

				put = new Put(rowkey.getBytes());

				put.addColumn("cf1".getBytes(), "type".getBytes(), (random.nextInt(2) + "").getBytes());
				put.addColumn("cf1".getBytes(), "phone".getBytes(), phone.getBytes());
				put.addColumn("cf1".getBytes(), "time".getBytes(), Bytes.toBytes(dateStr));

				// ���ӽ�list
				puts.add(put);
			}
		}

		// ������������
		table.put(puts);

		System.out.println("�������ݳɹ�!");

	}

	/**
	 * ֱ�Ӹ���rowkey��ѯĳ���û���ͨ���굥
	 * 
	 * @throws ParseException
	 */
	@Test
	public void scan() throws Exception {
		// ��ȡ������
		table = conn.getTable(TableName.valueOf("phonelist"));

		String phoneNum = "18697352170";

		Scan scan = new Scan();

		// ����ʱ���ʽ��ģʽ
		SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");

		// ���ò�ѯ���м�����ʼֵ
		String startRowkey = phoneNum + (Long.MAX_VALUE - format.parse("2016-10-01 00:00:00").getTime());
		scan.setStartRow(startRowkey.getBytes());

		// ���ò�ѯ���м��Ľ���ֵ
		String stopRowkey = phoneNum + (Long.MAX_VALUE - format.parse("2016-05-01 00:00:00").getTime());

		scan.setStopRow(stopRowkey.getBytes());

		// �õ������
		ResultScanner scanner = table.getScanner(scan);

		if (scanner != null) {
			for (Result result : scanner) {
				showValues(result);
			}
			System.out.println("��ȡ���ݳɹ���");
		}else {
			System.out.println("���ҵ����ݲ����ڣ�");
		}

	}

	/**
	 * ��ѯ��ĳ���û������ͨ���굥
	 * 
	 * @throws IOException
	 */
	@Test
	public void scan1() throws IOException {

		// ��ȡ������
		table = conn.getTable(TableName.valueOf("phonelist"));

		// ���ù�������
		FilterList list = new FilterList(FilterList.Operator.MUST_PASS_ALL);

		// ���ò�ѯ�м��Ŀ�ͷ
		PrefixFilter prefixFilter = new PrefixFilter("18697352170".getBytes());
		list.addFilter(prefixFilter);

		// ����typeΪ0�������,��ѯ��ȫ���������굥
		SingleColumnValueFilter singleColumnValueFilter = new SingleColumnValueFilter("cf1".getBytes(),
				"type".getBytes(), CompareOp.EQUAL, (0 + "").getBytes());
		list.addFilter(singleColumnValueFilter);

		Scan scan = new Scan();

		scan.setFilter(list);

		// �õ������
		ResultScanner scanner = table.getScanner(scan);

		// �����������ȡ����
		if (scanner != null) {
			for (Result result : scanner) {
				showValues(result);
			}
			System.out.println("��ȡ���ݳɹ���");
		}else {
			System.out.println("���ҵ����ݲ����ڣ�");
		}
	}

	/**
	 * ��ȡʱ��
	 */
	public String getDate(String year) {

		StringBuilder sb = new StringBuilder();
		Random random = new Random();

		// ���������������ʱ����
		sb.append(year + "-").append((random.nextInt(12) + 1) + "-").append((random.nextInt(29) + 1) + " ")
				.append((random.nextInt(24)) + ":").append((random.nextInt(60)) + ":").append(random.nextInt(60));

		return sb.toString();
	}

	/**
	 * ��ȡ�绰����
	 */
	private String getPhoneNum(String head) {

		Random random = new Random();

		StringBuilder sb = new StringBuilder();
		sb.append(head);

		for (int i = 0; i < 8; i++) {
			sb.append(random.nextInt(10));
		}

		return sb.toString();

	}

	/**
	 * ���������
	 * 
	 * @param result
	 */
	private void showValues(Result result) {
		// TODO Auto-generated method stub

		// һ���������塢�С��汾�ŵ�Ƕ��map
		NavigableMap<byte[], NavigableMap<byte[], NavigableMap<Long, byte[]>>> fqvmap = result.getMap();
		Set<Entry<byte[], NavigableMap<byte[], NavigableMap<Long, byte[]>>>> fqventrys = fqvmap.entrySet();
		for (Entry<byte[], NavigableMap<byte[], NavigableMap<Long, byte[]>>> fqventry : fqventrys) {
			// ��ȡ����
			byte[] family = fqventry.getKey();
			// һ�������У��汾�ŵ�Ƕ��map
			NavigableMap<byte[], NavigableMap<Long, byte[]>> qvmap = fqventry.getValue();
			Set<Entry<byte[], NavigableMap<Long, byte[]>>> qventrys = qvmap.entrySet();
			for (Entry<byte[], NavigableMap<Long, byte[]>> qventry : qventrys) {
				// ��ȡ����
				byte[] qulifier = qventry.getKey();
				// һ��keyΪ�汾�ŵ�map
				NavigableMap<Long, byte[]> vmap = qventry.getValue();
				Set<Entry<Long, byte[]>> ventrys = vmap.entrySet();
				for (Entry<Long, byte[]> ventry : ventrys) {
					// ��ȡ�汾��
					Long version = ventry.getKey();
					// ��ȡ����
					byte[] value = ventry.getValue();
					System.out.println("���壺" + Bytes.toString(family) + " " + "������" + Bytes.toString(qulifier) + " "
							+ "�汾�ţ�" + version + " " + "ֵ��" + Bytes.toString(value));
				}
				
			}
		}
					System.out.println("-----------------------------------------");
	}

	/**
	 * �ͷ���Դ
	 */
	@After
	public void close() {

		if (admin != null) {
			try {
				admin.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

		if (table != null) {
			try {
				table.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

		if (conn != null) {
			try {
				conn.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}

	}
}