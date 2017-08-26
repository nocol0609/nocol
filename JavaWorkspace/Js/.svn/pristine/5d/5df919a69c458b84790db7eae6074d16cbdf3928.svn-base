package cn.oracle.test;

import java.util.List;

/**
 * 业务层
 * @author Nocol
 *
 */
public class StudentService {
	/**
	 * 根据页号获取当前页展示的内容
	 * 
	 * @param currPageNO
	 *            页号
	 * @return 封装该页需要展示的内容
	 */

	public Page show(int currPageNO) throws Exception {
		StudentDao dao = new StudentDao();
		Page page = new Page();
		
		// 封装当前页号
		page.setAllPageNO(currPageNO);
		
		// 封装总记录数
		int allRecordNO = dao.getRecordNum();
		page.setAllRecordNO(allRecordNO);
		
		// 封装总的页数
	    int allPageNo=0;
		if (page.getAllRecordNO() % page.getPerPageSize() == 0) {
			allPageNo = page.getAllRecordNO() / page.getPerPageSize();
		} else {
			allPageNo = page.getAllRecordNO() / page.getPerPageSize() + 1;
		}
		page.setAllPageNO(allPageNo);
		
		//封装该页要显示的内容
		int start=(currPageNO-1)*page.getPerPageSize()+14;
		Integer end=currPageNO*page.getPerPageSize()+1;
		
		List<Student> list=dao.findAllStudent(start, end);
		page.setList(list);
		return page;
	}

	public static void main(String[] args) throws Exception {
		StudentService service = new StudentService();
		System.out.println("------第一页-------");
		Page page = service.show(1);
		for (Student student : page.getList()) {
			System.out.println(student);
		}
		System.out.println("------第二页-------");
		Page page2 = service.show(2);
		for (Student student : page2.getList()) {
			System.out.println(student);
		}
		System.out.println("------第三页-------");
		Page page3 = service.show(3);
		for (Student student : page3.getList()) {
			System.out.println(student);
		}
		System.out.println("------第四页-------");
		Page page4 = service.show(4);
		for (Student student : page4.getList()) {
			System.out.println(student);
		}
	}
}
