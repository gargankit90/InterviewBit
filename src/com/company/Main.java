package com.company;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

import static com.company.BalanceBracket.braces;

public class Main {

//    public static void main(String[] args) {
////    PrettyPrint prettyPrint = new PrettyPrint();
////    prettyPrint.prettyPrint(6);
//
////        NumRange numRange = new NumRange();
////        numRange.numRange(new ArrayList<Integer>(Arrays.asList(76, 22, 81, 77, 95, 23, 27, 35, 24, 38, 15, 90, 19, 46, 53, 6, 77, 96, 100, 85, 43, 16, 73, 18, 7, 66)), 6, 8);
//
////        ListNode node1 = new ListNode(50);
////        ListNode node2 = new ListNode(40);
////        node1.next = node2;
////        ListNode node3 = new ListNode(30);
////        node2.next = node3;
////        ListNode node4 = new ListNode(20);
////        node3.next = node4;
////        ListNode node5 = new ListNode(10);
////        node4.next = node5;
////        node5.next = null;
////        new SubtractList().subtract(node1);
//
////        NextGreater nextGreater = new NextGreater();
////        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(new Integer(4), new Integer(5), new Integer(2), new Integer(10)));
////        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(new Integer(4), new Integer(3), new Integer(2), new Integer(1)));
////        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(new Integer(4)));
////        nextGreater.nextGreater(list);
//
//        RemoveDuplicate removeDuplicate = new RemoveDuplicate();
//        removeDuplicate.removeDuplicates(new int[]{1,1,2});
//    }



    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
//        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int valuesCount = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        String[] values = new String[valuesCount];

        for (int i = 0; i < valuesCount; i++) {
            String valuesItem = scanner.nextLine();
            values[i] = valuesItem;
        }

        String[] res = braces(values);

//        for (int i = 0; i < res.length; i++) {
//            bufferedWriter.write(res[i]);
//
//            if (i != res.length - 1) {
//                bufferedWriter.write("\n");
//            }
//        }
//
//        bufferedWriter.newLine();
//
//        bufferedWriter.close();

        scanner.close();
    }

}
