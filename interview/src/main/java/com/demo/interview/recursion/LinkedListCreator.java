package com.demo.interview.recursion;

import com.demo.interview.common.Node;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @Description：
 * @Auther： libo
 * @date： 2018/10/21:17:45
 */
public class LinkedListCreator {

    /**
     * Creates a linked list.
     *
     * @param data the data to create the list
     * @return head of the linked list. The returned linked list ends with last node with getNext() == null
     */
    public Node createLinkedList(List<Integer> data) {
        if (data.isEmpty()) {
            return null;
        }

        Node firstNode = new Node(data.get(0));
        Node headOfSublist = createLinkedList(data.subList(1, data.size()));
        firstNode.setNext(headOfSublist);
        return firstNode;
    }

    public static void main(String[] args) {
        LinkedListCreator creator = new LinkedListCreator();

        Node.printLinkedList(
                creator.createLinkedList(new ArrayList<>()));
        Node.printLinkedList(
                creator.createLinkedList(Arrays.asList(1)));
        Node.printLinkedList(
                creator.createLinkedList(Arrays.asList(1, 2, 3, 4, 5)));
    }


    public Node createLargeLindedList(int size) {
        Node prev = null;
        Node head = null;
        for (int i = 1; i <= size; i++){
            Node node = new Node(i);
            if (prev != null){
                prev.setNext(node);
            }else {
                head = node;
            }
            prev = node;
        }
        return head;
    }
}
