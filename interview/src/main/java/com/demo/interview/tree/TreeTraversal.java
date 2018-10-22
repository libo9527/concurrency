package com.demo.interview.tree;

/**
 * @Description：
 * @Auther： libo
 * @date： 2018/10/22:21:27
 */
public class TreeTraversal {
    public void preOrder(TreeNode root) {
        if (root == null) {
            return;
        }
        System.out.print(root.getValue());
        preOrder(root.getLeft());
        preOrder(root.getRight());
    }

    public void inOrder(TreeNode root) {
        if (root == null) {
            return;
        }
        inOrder(root.getLeft());
        System.out.print(root.getValue());
        inOrder(root.getRight());
    }

    public void postOrder(TreeNode root) {
        if (root == null) {
            return;
        }
        postOrder(root.getLeft());
        postOrder(root.getRight());
        System.out.print(root.getValue());
    }

    public static void main(String[] args) {
        TreeCreator creator = new TreeCreator();
        TreeTraversal traversal = new TreeTraversal();

        TreeNode sampleTree = creator.createSampleTree();
        traversal.preOrder(sampleTree);
        System.out.println();
        traversal.inOrder(sampleTree);
        System.out.println();
        traversal.postOrder(sampleTree);
        System.out.println();
    }
}
