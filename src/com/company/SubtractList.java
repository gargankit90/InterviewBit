package com.company;

class ListNode {
    public int val;
    public ListNode next;

    ListNode(int x) {
        val = x;
        next = null;
    }
}

public class SubtractList {
    public ListNode subtract(ListNode A) {
        int mid = 0;
        // Find mid node ....
        ListNode midPointer = A, fastPointer = null;
        if (A.next != null) {
            fastPointer = A.next.next;
        }
        while (fastPointer != null) {
            mid++;
            if (fastPointer.next != null) {
                fastPointer = fastPointer.next.next;
            } else {
                midPointer = midPointer.next;
                break;
            }
            midPointer = midPointer.next;
        }
        System.out.println(midPointer.val);

        // reverse second half ...
        ListNode traverseNode = midPointer;
        ListNode nextNode, prevNode = null;
        while (traverseNode != null) {
            nextNode = traverseNode.next;
                traverseNode.next = prevNode;

            prevNode = traverseNode;
            traverseNode = nextNode;
        }
        midPointer = prevNode;
        ListNode updateStartNode = A;
        ListNode updateMidNode = prevNode;
        // Update the List
        while (mid > 0) {
            updateStartNode.val = updateMidNode.val - updateStartNode.val;
            updateMidNode = updateMidNode.next;
            updateStartNode = updateStartNode.next;
            mid--;
        }



        // Change the return variable.....
        return A;
    }
}

