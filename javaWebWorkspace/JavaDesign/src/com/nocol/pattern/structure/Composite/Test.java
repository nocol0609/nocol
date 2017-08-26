package com.nocol.pattern.structure.Composite;

//测试�?
public class Test{

	public static void main(String[] args) {  
		Tree tree = new Tree("A");  
		TreeNode nodeB = new TreeNode("B");  
		TreeNode nodeC = new TreeNode("C");  
		  
		nodeB.add(nodeC);  
		tree.root.add(nodeB);  
		
	}
}
