package com.demo.interview.tree;

import java.util.TreeMap;

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
}
