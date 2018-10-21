package com.demo.interview.loop;

import com.demo.interview.common.Node;
import com.demo.interview.recursion.LinkedListCreator;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * @Description：
 * @Auther： libo
 * @date： 2018/10/21:22:12
 */
public class LinkedListReverser {

    public Node reverseLinkedList(Node head) {
        Node newHead = null;
        Node curHead = head;
        // Loop invariant:
        // newHead points to the linked list already reversed.
        // curHead points to the linked list not yet reversed.

        // Loop invariant holds
        while (curHead != null) {
            // Loop invariant holds
            Node next = curHead.getNext();
            curHead.setNext(newHead);
            newHead = curHead;
            curHead = next;
            // Loop invariant holds
        }
        // Loop invariant holds
        return newHead;
    }

    public static void main(String[] args) {
        LinkedListCreator creator = new LinkedListCreator();
        LinkedListReverser reverser = new LinkedListReverser();

        Node.printLinkedList(reverser.reverseLinkedList(
                creator.createLinkedList(new ArrayList<>())));
        Node.printLinkedList(reverser.reverseLinkedList(
                creator.createLinkedList(Arrays.asList(1))));
        Node.printLinkedList(reverser.reverseLinkedList(
                creator.createLinkedList(Arrays.asList(1, 2, 3, 4, 5))));

        reverser.reverseLinkedList(creator.createLargeLindedList(1000000));
        System.out.println("done");
    }
}
