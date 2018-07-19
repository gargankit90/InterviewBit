package com.company;

import java.util.ArrayList;
import java.util.Stack;

public class NextGreater {

    public ArrayList<Integer> nextGreater(ArrayList<Integer> A) {
        Stack<StackObject> stack = new Stack<StackObject>();
        int inputSize = A.size();
        stack.push(new StackObject(0, A.get(0)));
        for (int i = 1; i < inputSize; i++) {
            while (!stack.isEmpty() && stack.peek().data < A.get(i)) {
                StackObject top = stack.pop();
                A.set(top.position, A.get(i));
            }
            stack.push(new StackObject(i, A.get(i)));
        }

        while (!stack.isEmpty()) {
            StackObject top = stack.pop();
            A.set(top.position, -1);
        }

        return A;
    }



}


class StackObject {
    int data;
    int position;

    StackObject(int position, int data) {
        this.position = position;
        this.data = data;
    }
}
