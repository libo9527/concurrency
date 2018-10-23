package com.demo.interview.tree;

/**
 * @Description：
 * @Auther： libo
 * @date： 2018/10/23:09:20
 */
public class TreeNode2 {
    private final char value;
    private TreeNode2 left;
    private TreeNode2 right;
    private TreeNode2 parent;

    public TreeNode2(char value){
        this.value = value;
        this.left = null;
        this.right = null;
    }

    public char getValue() {
        return value;
    }

    public TreeNode2 getLeft() {
        return left;
    }

    public void setLeft(TreeNode2 left) {
        this.left = left;
        if (left != null) {
            this.left.setParent(this);
        }
    }

    public TreeNode2 getRight() {
        return right;
    }

    public void setRight(TreeNode2 right) {
        this.right = right;
        if (right != null) {
            this.right.setParent(this);
        }
    }

    public TreeNode2 getParent() {
        return parent;
    }

    public void setParent(TreeNode2 parent) {
        this.parent = parent;
    }
}
