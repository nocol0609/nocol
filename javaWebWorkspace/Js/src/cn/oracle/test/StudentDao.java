package cn.oracle.test;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

/**
 * 持久层
 * @author Nocol
 *
 */
public class StudentDao {
	/**
	 * 获取记录总数
	 * 
	 * @return
	 * @throws Exception
	 */
	public int getRecordNum() throws Exception {

		int count = 0;

		Connection conn = JdbcUtils.getConnection();
		Statement statement = conn.createStatement();
		String sql = "select count(*) num from student";
		ResultSet rs = statement.executeQuery(sql);
		while (rs.next()) {
			count = rs.getInt("num");
		}
		return count;
	};

	/**
	 * 分批查询所有记录
	 * 
	 * @param start
	 *            从第几条记录显示
	 * @param end
	 *            到第几条记录结束
	 * @return start到end记录集合
	 */
	public List<Student> findAllStudent(int start, int end) throws Exception {

		List<Student> list = new ArrayList<Student>();

		Connection conn = JdbcUtils.getConnection();
		Statement statement = conn.createStatement();
		String sql = "Select  a.*  From (select id,name,gender,major,grade from student  where rownum<" + end
				+ ") a Where id>" + start + "";
		ResultSet rs = statement.executeQuery(sql);
		while (rs.next()) {
			int id = rs.getInt("id");
			String name = rs.getString("name");
			String gender = rs.getString("gender");
			String major = rs.getString("major");
			String grade = rs.getString("grade");
			Student student = new Student(id, name, gender, major, grade);
			list.add(student);
		}
		return list;
	};

	public static void main(String[] args) throws Exception {
		StudentDao dao = new StudentDao();
		System.out.println("共有" + dao.getRecordNum() + "记录");
		System.out.println("------第一页--------");
		for (Student student : dao.findAllStudent(14, 4)) {
			System.out.println(student);
		}
		System.out.println("------第二页--------");
		for (Student student : dao.findAllStudent(17, 7)) {
			System.out.println(student);
		}
		System.out.println("------第三页--------");
		for (Student student : dao.findAllStudent(20, 10)) {
			System.out.println(student);
		}
		System.out.println("------第四页--------");
		for (Student student : dao.findAllStudent(23, 13)) {
			System.out.println(student);
		}

	}
}
