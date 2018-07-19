package com.company;

import java.util.ArrayList;
import java.util.Arrays;

public class PrettyPrint {

    public ArrayList<ArrayList<Integer>> prettyPrint(int A) {
        ArrayList<ArrayList<Integer>> outer = new ArrayList<ArrayList<Integer>>();
        ArrayList<Integer> inner = new ArrayList<Integer>();
        int[][] matrix = new int[(2 * A - 1)][(2 * A - 1)];
        int printNumber, repeat;
        // Get one forth matrix in there ...
        for (int i = A - 1; i >= 0; i--) {
            printNumber = A - i;
            repeat = A - i;
            for (int j = A - 1; j >= 0; j--) {
                if (repeat > 0) {
                    matrix[i][j] = printNumber;
                } else {
                    matrix[i][j] = ++printNumber;
                }
                repeat--;
            }
        }

        // replicate the one fourth matrix to right side to make it half matrix
        int copyColumn;
        for (int i = 0; i < A; i++) {
            copyColumn = A - 2;
            for (int j = A; j < (2 * A - 1); j++) {
                matrix[i][j] = matrix[i][copyColumn--];
            }
        }

        // replicate half of the matrix again
        int copyRow = A - 2;
        for (int i = A; i < (2 * A - 1); i++) {
            for (int j = 0; j < (2 * A - 1); j++) {
                matrix[i][j] = matrix[copyRow][j];
            }
            copyRow--;
        }

        // Print the matrix ....
//        for (int i =0; i < (2*A - 1); i++) {
//            for (int j = 0; j < (2*A - 1); j++) {
//                System.out.print(matrix[i][j]+ " ");
//            }
//            System.out.println("");
//        }

        for (int i = 0; i < (2 * A - 1); i++) {
            for (int j = 0; j < (2 * A - 1); j++) {
                inner.add(j, matrix[i][j]);
            }
            outer.add(i,inner);
            inner = new ArrayList<>();
        }
        return outer;
    }
}
