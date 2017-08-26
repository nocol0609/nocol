package com.nocol.tree;

/**
 * ������
 * 
 * @author Nocol ����5:05:34
 */
public class Tree {
	// ���ڵ�
	public Node root;

	/**
	 * ����ڵ�
	 */
	public void insert(long value) {

		// ��װ����Ľڵ�
		Node newNode = new Node(value);
		// ���õ�ǰ�ڵ�
		Node current = root;
		// ���ø��ڵ�
		Node parent;
		// �ж�root�Ƿ�Ϊnull������һ�β����ʱ��
		if (root == null) {
			root = newNode;
			return;
		} else {
			while (true) {
				// ��root��Ϊ�գ����õ�ǰ�ڵ�Ϊ���ڵ�
				parent = current;
				// ����²���Ľڵ�ȵ�ǰ�ڵ�С����������
				if (value < current.data) {
					// ��ȡ��ǰ�ڵ�����ӽڵ�
					current = current.leftChild;
					if (current == null) {
						// ����ǰ�ڵ�����ӽڵ�Ϊnull,���²���ľ�Ϊ��ǰ�ڵ�����ӽڵ�
						parent.leftChild = newNode;
						return;
					}
				} else {
					// ��ȡ��ǰ�ڵ���Һ��ӽڵ�
					current = current.rigthChild;
					if (current == null) {
						// ����ǰ�ڵ���Һ��ӽڵ�Ϊnull,���²���ľ�Ϊ��ǰ�ڵ���Һ��ӽڵ�
						parent.rigthChild = newNode;
						return;
					}
				}
			}
		}

	}

	/**
	 * ���ҽڵ�
	 */
	public Node find(long value) {

		// ��ǰ�ڵ������,�Ӹ��ڵ㿪ʼ����
		Node current = root;
		// ֻҪ���ҵĽڵ㲻���ڵ�ǰ�ڵ����������
		while (current.data != value) {

			// ����ǰ�ڵ����Ҫ���ҵĽڵ㣬������߲���
			if (current.data > value) {
				current = current.leftChild;
			} else {
				// ����ǰ�ڵ�С��Ҫ���ҵĽڵ㣬�����ұ߲���
				current = current.rigthChild;
			}
			// �����Ҳ����򷵻ؿ�
			if (current == null) {
				return null;
			}
		}
		return current;
	}

	/**
	 * ɾ���ڵ�
	 */
	public boolean delete(long value) {

		// ���õ�ǰ�ڵ�
		Node current = root;
		// ���õ�ǰ�ڵ�ĸ��ڵ�
		Node parent = root;

		// �Ƿ�Ϊ��ڵ�
		boolean isLeftChild = true;

		// �Ȳ���Ҫɾ���Ľڵ�
		while (current.data != value) {
			// ����ǰ�ڵ���Ϊ���ڵ�
			parent = current;
			if (current.data >= value) { // �������
				// ����ڵ�
				isLeftChild = true;
				if (current.leftChild != null) {
					parent = current;
					current = current.leftChild;
				}
			} else {
				// ���Һ���
				isLeftChild = false;
				if (current.rigthChild != null) {
					parent = current;
					current = current.rigthChild;
				}
			}
			// �����Ҳ���
			if (current == null) {
				return false;
			}
		}

		// ��ɾ������Ҷ�ӽڵ�
		if (current.leftChild == null && current.rigthChild == null) {
			// ��Ҫɾ���Ľڵ�Ϊ���ڵ�
			if (current == root) {
				root = null;
				// ��Ҫɾ���Ľڵ�Ϊ���ӽڵ�
			} else if (isLeftChild) {
				parent.leftChild = null;
				// ��Ҫɾ���Ľڵ�Ϊ�Һ��ӽڵ�
			} else {
				parent.rigthChild = null;
			}
			// �����ɾ���ڵ�ֻ������
		} else if (current.rigthChild == null) {
			// ����ǰ�ڵ�Ϊ���ڵ�
			if (current == root) {
				root = current.leftChild;
				// ��Ҫɾ���Ľڵ�Ϊ���ӽڵ�
			} else if (isLeftChild) {
				// ��Ҫɾ���Ľڵ�Ϊ���ӽڵ�
				parent.leftChild = current.leftChild;
			} else {
				// ��Ҫɾ���Ľڵ�Ϊ�Һ��ӽڵ�
				parent.rigthChild = current.leftChild;
			}
			// �����ɾ���ڵ�ֻ���ҽڵ�
		} else if (current.leftChild == null) {
			if (current == root) {
				root = current.rigthChild;
			} else if (isLeftChild) {
				parent.leftChild = current.rigthChild;
			} else {
				parent.rigthChild = current.rigthChild;
			}
			// ����ɾ���Ľڵ����������ӽڵ�
		} else {
			// ��ȡ�����̽ڵ�  
			Node successor = getSuccessor(current);
			// ������ڵ��뱻ɾ���ĸ��ڵ�������ӣ���������滻����
			if (current == root) {
				root = successor;
			} else if (isLeftChild) {
				parent.leftChild = successor;
			} else {
				parent.rigthChild = successor;
			}
			successor.leftChild = current.leftChild;
		}

		return true;
	}

	/**
	 * ��ȡ�����̽ڵ�
	 * 
	 * @param delNode
	 *            ��ǰҪɾ���Ľڵ�
	 * @return
	 */
	private Node getSuccessor(Node delNode) {

		// ��ǰ��ʼ�����Ľڵ�
		Node current = delNode.rigthChild;
		// Ҫ�ҵĽڵ�
		Node successor = current;
		// Ҫ�ҵĽڵ�ĸ��ڵ�
		Node successorParent = null;

		while (current != null) {
			successorParent = successor;
			successor = current;
			current = current.leftChild;
		}

		if (successor != delNode.rigthChild) {

			// ����̽ڵ���ӽڵ㣨ֻ�������ҽڵ㣩�油����̽ڵ��λ��
			successorParent.leftChild = successor.rigthChild;
			// ����ɾ�����Һ������ӵ���̽ڵ���ҽڵ���
			successor.rigthChild = delNode.rigthChild;
			// ����ɾ�����������ӵ���̽ڵ���ҽڵ��ϣ������ú�̽ڵ��滻����ɾ���Ľڵ㣩
		}

		return successor;
	}

	/**
	 * ǰ�����(����Ϊ���ڵ�/�������ڵ�)
	 */
	public void frontOrder(Node localNode) {
		if (localNode != null) {
			// ���ʸ��ڵ�
			System.out.println(localNode.data);
			// ǰ�����������
			frontOrder(localNode.leftChild); // �������ĸ��ڵ�
			// ǰ�����������
			frontOrder(localNode.rigthChild); // �������ĸ��ڵ�
		}
	}

	/**
	 * �������
	 */
	public void inOrder(Node localNode) {
		if (localNode != null) {

			// �������������
			inOrder(localNode.leftChild);
			// ���ʸ��ڵ�
			System.out.println(localNode.data);
			// �������������
			inOrder(localNode.rigthChild);
		}
	}

	/**
	 * �������
	 */
	public void afterOrder(Node loacalNode) {
		if (loacalNode != null) {

			// �������������
			afterOrder(loacalNode.leftChild);
			// �������������
			afterOrder(loacalNode.rigthChild);

			// ���ʸ��ڵ�
			System.out.println(loacalNode.data);

		}
	}
}