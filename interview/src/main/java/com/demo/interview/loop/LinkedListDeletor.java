package com.demo.interview.loop;

import com.demo.interview.common.Node;
import com.demo.interview.recursion.LinkedListCreator;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * @Description：
 * @Auther： libo
 * @date： 2018/10/22:09:00
 */
public class LinkedListDeletor {

    public Node deleteIfEquals(Node head, int value) {

        if (head != null && head.getValue() == value) {
            head = head.getNext();
        }

        if (head == null) {
            return null;
        }

        Node prev = head;
        // Loop invariant: list nodes from head up to prev has been processed. (Nodes with values equal to value are deleted.)
        while (prev.getNext() != null) {
            if (prev.getNext().getValue() == value) {
                // delete it
                prev.setNext(prev.getNext().getNext());
            } else {
                prev = prev.getNext();
            }
        }

        return head;
    }

    public static void main(String[] args) {
        LinkedListCreator creator = new LinkedListCreator();
        LinkedListDeletor deletor = new LinkedListDeletor();
        Node.printLinkedList(deletor.deleteIfEquals(
                creator.createLinkedList(Arrays.asList(1, 2, 3, 2, 5)),
                2));
        Node.printLinkedList(deletor.deleteIfEquals(
                creator.createLinkedList(Arrays.asList(1, 2, 3, 2, 2)),
                2));
        Node.printLinkedList(deletor.deleteIfEquals(
                creator.createLinkedList(Arrays.asList(1, 2, 3, 2, 2)),
                1));
        Node.printLinkedList(deletor.deleteIfEquals(
                creator.createLinkedList(Arrays.asList(2, 2, 3, 2, 2)),
                2));
        Node.printLinkedList(deletor.deleteIfEquals(
                creator.createLinkedList(Arrays.asList(2, 2, 2, 2, 2)),
                2));
        Node.printLinkedList(deletor.deleteIfEquals(
                creator.createLinkedList(Arrays.asList(2)),
                2));
        Node.printLinkedList(deletor.deleteIfEquals(
                creator.createLinkedList(Arrays.asList(2)),
                1));
        Node.printLinkedList(deletor.deleteIfEquals(
                creator.createLinkedList(new ArrayList<>()),
                1));

    }
}
