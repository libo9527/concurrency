package com.demo.interview.tree;

/**
 * @Description：
 * @Auther： libo
 * @date： 2018/10/22:21:24
 */
public class TreeCreator {
    public TreeNode createSampleTree() {
        TreeNode root = new TreeNode('A');
        root.setLeft(new TreeNode('B'));
        root.getLeft().setLeft(new TreeNode('D'));
        root.getLeft().setRight(new TreeNode('E'));
        root.getLeft().getRight().setLeft(new TreeNode('G'));
        root.setRight(new TreeNode('C'));
        root.getRight().setRight(new TreeNode('F'));
        return root;
    }

    public TreeNode createTree(String preOrder, String inOrder) {
        if (preOrder.isEmpty()) {
            return null;
        }
        char rootValue = preOrder.charAt(0);
        int rootIndex = inOrder.indexOf(rootValue);
        TreeNode root = new TreeNode(rootValue);
        root.setLeft(createTree(preOrder.substring(1, 1 + rootIndex), inOrder.substring(0, rootIndex)));
        root.setRight(createTree(preOrder.substring(1 + rootIndex), inOrder.substring(rootIndex + 1)));
        return root;
    }

    public TreeNode2 createSampleTree2() {
        TreeNode2 root = new TreeNode2('A');
        root.setLeft(new TreeNode2('B'));
        root.getLeft().setLeft(new TreeNode2('D'));
        root.getLeft().setRight(new TreeNode2('E'));
        root.getLeft().getRight().setLeft(new TreeNode2('G'));
        root.setRight(new TreeNode2('C'));
        root.getRight().setRight(new TreeNode2('F'));
        return root;
    }

    public TreeNode2 createTree2(String preOrder, String inOrder) {
        if (preOrder.isEmpty()) {
            return null;
        }
        char rootValue = preOrder.charAt(0);
        int rootIndex = inOrder.indexOf(rootValue);
        TreeNode2 root = new TreeNode2(rootValue);
        root.setLeft(createTree2(preOrder.substring(1, 1 + rootIndex), inOrder.substring(0, rootIndex)));
        root.setRight(createTree2(preOrder.substring(1 + rootIndex), inOrder.substring(rootIndex + 1)));
        return root;
    }
}
