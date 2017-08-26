package cn.oracle.test;

import java.util.List;

/**
 * ҵ���
 * @author Nocol
 *
 */
public class StudentService {
	/**
	 * ����ҳ�Ż�ȡ��ǰҳչʾ������
	 * 
	 * @param currPageNO
	 *            ҳ��
	 * @return ��װ��ҳ��Ҫչʾ������
	 */

	public Page show(int currPageNO) throws Exception {
		StudentDao dao = new StudentDao();
		Page page = new Page();
		
		// ��װ��ǰҳ��
		page.setAllPageNO(currPageNO);
		
		// ��װ�ܼ�¼��
		int allRecordNO = dao.getRecordNum();
		page.setAllRecordNO(allRecordNO);
		
		// ��װ�ܵ�ҳ��
	    int allPageNo=0;
		if (page.getAllRecordNO() % page.getPerPageSize() == 0) {
			allPageNo = page.getAllRecordNO() / page.getPerPageSize();
		} else {
			allPageNo = page.getAllRecordNO() / page.getPerPageSize() + 1;
		}
		page.setAllPageNO(allPageNo);
		
		//��װ��ҳҪ��ʾ������
		int start=(currPageNO-1)*page.getPerPageSize()+14;
		Integer end=currPageNO*page.getPerPageSize()+1;
		
		List<Student> list=dao.findAllStudent(start, end);
		page.setList(list);
		return page;
	}

	public static void main(String[] args) throws Exception {
		StudentService service = new StudentService();
		System.out.println("------��һҳ-------");
		Page page = service.show(1);
		for (Student student : page.getList()) {
			System.out.println(student);
		}
		System.out.println("------�ڶ�ҳ-------");
		Page page2 = service.show(2);
		for (Student student : page2.getList()) {
			System.out.println(student);
		}
		System.out.println("------����ҳ-------");
		Page page3 = service.show(3);
		for (Student student : page3.getList()) {
			System.out.println(student);
		}
		System.out.println("------����ҳ-------");
		Page page4 = service.show(4);
		for (Student student : page4.getList()) {
			System.out.println(student);
		}
	}
}
