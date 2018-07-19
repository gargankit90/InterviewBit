package com.company;

import java.util.ArrayList;

public class NumRange {
    public int numRange(ArrayList<Integer> A, int B, int C) {
        int currentLength = 0, currentSum;

        for (int i = 0; i < A.size(); i++) {
            currentSum = 0;
            for (int j = i; j < A.size(); j++) {
                currentSum = currentSum + A.get(j);
                if(B <= currentSum && currentSum <= C) {
                    currentLength++;
                }
                if (currentSum > C) {
                    break;
                }
            }
        }
        return currentLength;
    }
}
