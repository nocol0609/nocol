package com.nocol.tree;
 
/**
 * �������Ľڵ�
 * 
 * @author Nocol ����5:02:50
 */
public class Node {
	//������
	public long data;
	//���ӽڵ�
	public  Node leftChild;
	//�ҽڵ�
	public  Node rigthChild;

	/**
	 * ���췽��
	 */
	public Node(long data) {
		this.data = data;
	}
}
