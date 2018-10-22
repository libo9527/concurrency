package com.demo.interview.tree;

import lombok.Data;

/**
 * @Description：
 * @Auther： libo
 * @date： 2018/10/22:21:22
 */
@Data
public class TreeNode {
    private final char value;
    private TreeNode left;
    private TreeNode right;

    public TreeNode(char value){
        this.value = value;
        this.left = null;
        this.right = null;
    }
}
