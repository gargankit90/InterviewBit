package com.company;

import java.util.ArrayList;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
//    PrettyPrint prettyPrint = new PrettyPrint();
//    prettyPrint.prettyPrint(6);

//        NumRange numRange = new NumRange();
//        numRange.numRange(new ArrayList<Integer>(Arrays.asList(76, 22, 81, 77, 95, 23, 27, 35, 24, 38, 15, 90, 19, 46, 53, 6, 77, 96, 100, 85, 43, 16, 73, 18, 7, 66)), 6, 8);

//        ListNode node1 = new ListNode(50);
//        ListNode node2 = new ListNode(40);
//        node1.next = node2;
//        ListNode node3 = new ListNode(30);
//        node2.next = node3;
//        ListNode node4 = new ListNode(20);
//        node3.next = node4;
//        ListNode node5 = new ListNode(10);
//        node4.next = node5;
//        node5.next = null;
//        new SubtractList().subtract(node1);

        NextGreater nextGreater = new NextGreater();
//        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(new Integer(4), new Integer(5), new Integer(2), new Integer(10)));
//        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(new Integer(4), new Integer(3), new Integer(2), new Integer(1)));
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(new Integer(4)));
        nextGreater.nextGreater(list);
    }
}
