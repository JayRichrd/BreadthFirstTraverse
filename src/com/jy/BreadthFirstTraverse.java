package com.jy;

import java.util.ArrayDeque;

public class BreadthFirstTraverse {

	public static void main(String[] args) {
		// 构建树
		TreeNode treeANode1 = new TreeNode(5, null, null);
		TreeNode treeANode2 = new TreeNode(7, null, null);
		TreeNode treeANode3 = new TreeNode(9, null, null);
		TreeNode treeANode4 = new TreeNode(11, null, null);
		TreeNode treeANode5 = new TreeNode(6, treeANode1, treeANode2);
		TreeNode treeANode6 = new TreeNode(10, treeANode3, treeANode4);
		TreeNode root = new TreeNode(8, treeANode5, treeANode6);

		System.out.print("树的广度优先遍历：");
		breadthFirstTraverse(root);
	}

	/**
	 * 广度优先遍历二叉树
	 * 
	 * @param root
	 *            待遍历树的根节点
	 */
	public static void breadthFirstTraverse(TreeNode root) {
		// 广度优先遍历需要借助一个队列容器
		ArrayDeque<TreeNode> queue = new ArrayDeque<TreeNode>();
		if (root != null)
			// 将根节点加入队列中
			queue.offer(root);
		while (!queue.isEmpty()) {
			// 获取队列的头元素，出队
			TreeNode treeNode = queue.poll();
			System.out.print(treeNode.mValue + " ");
			// 继续将头节点的左右子节点入队
			if (treeNode.mLeft != null)
				queue.offer(treeNode.mLeft);
			if (treeNode.mRight != null)
				queue.offer(treeNode.mRight);
		}
	}

}
