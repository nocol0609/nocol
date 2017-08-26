package cn.oracle.test;

import java.util.ArrayList;
import java.util.List;

/**
 * ��ҳ��
 * 
 * @author Nocol
 *
 */
public class Page {
	private int currPageNO;// ��ǰҳ��
	private int perPageSize = 3;// ÿҳ��ʾ��¼����Ĭ��Ϊ3����¼
	private int allRecordNO;// �ܼ�¼��
	private int allPageNO;// ��ҳ��
	private List<Student> list = new ArrayList<Student>();// �ñ�ҳ��ʾ������

	public Page() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Page(int currPageNO, int perPageSize, int allRecordNO, int allPageNO, List<Student> list) {
		super();
		this.currPageNO = currPageNO;
		this.perPageSize = perPageSize;
		this.allRecordNO = allRecordNO;
		this.allPageNO = allPageNO;
		this.list = list;
	}

	public int getCurrPageNO() {
		return currPageNO;
	}

	public void setCurrPageNO(int currPageNO) {
		this.currPageNO = currPageNO;
	}

	public int getPerPageSize() {
		return perPageSize;
	}

	public void setPerPageSize(int perPageSize) {
		this.perPageSize = perPageSize;
	}

	public int getAllRecordNO() {
		return allRecordNO;
	}

	public void setAllRecordNO(int allRecordNO) {
		this.allRecordNO = allRecordNO;
	}

	public int getAllPageNO() {
		return allPageNO;
	}

	public void setAllPageNO(int allPageNO) {
		this.allPageNO = allPageNO;
	}

	public List<Student> getList() {
		return list;
	}

	public void setList(List<Student> list) {
		this.list = list;
	}

	@Override
	public String toString() {
		return "Page [currPageNO=" + currPageNO + ", perPageSize=" + perPageSize + ", allRecordNO=" + allRecordNO
				+ ", allPageNO=" + allPageNO + ", list=" + list + "]";
	}

}
