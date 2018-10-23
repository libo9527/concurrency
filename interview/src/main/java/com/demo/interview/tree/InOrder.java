package com.demo.interview.tree;

/**
 * @Description：
 * @Auther： libo
 * @date： 2018/10/23:09:43
 */
public class InOrder {

    public TreeNode2 next(TreeNode2 node) {
        if (node.getRight() != null) {
            return first(node.getRight());
        } else {
            while (node.getParent() != null
                    && node.getParent().getRight() == node) {
                node = node.getParent();
            }
            // node.getParent() == null || node is left child of its parent
            return node.getParent();
        }
    }

    private TreeNode2 first(TreeNode2 root) {
        if (root == null) {
            return null;
        }

        TreeNode2 curNode = root;
        while (curNode.getLeft() != null) {
            curNode = curNode.getLeft();
        }
        return curNode;
    }

    public void traverse(TreeNode2 root) {
        for (TreeNode2 node = first(root); node != null; node = next(node)) {
            System.out.print(node.getValue());
        }
        System.out.println();

    }

    public static void main(String[] args) {
        TreeCreator creator = new TreeCreator();
        InOrder inOrder = new InOrder();

        TreeNode2 sampleTree = creator.createSampleTree2();
        inOrder.traverse(sampleTree);

        inOrder.traverse(creator.createTree2("",""));
        inOrder.traverse(creator.createTree2("A","A"));
        inOrder.traverse(creator.createTree2("AB","BA"));
        inOrder.traverse(creator.createTree2("ABCD","DCBA"));
        inOrder.traverse(creator.createTree2("ABCD","ABCD"));
    }
}
