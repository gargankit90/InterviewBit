package com.company;
import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class BalanceBracket {

    // Complete the braces function below.
    static String[] braces(String[] values) {
        String[] isBalanced = new String[values.length];
        LinkedList<Character> bracketStack = new LinkedList<Character>();
        String currentString = "";
        String currentIsBalanced = "";
        // Iterate for each string that we got in input
        for (int i=0; i < values.length; i++) {
            currentString = values[i];
            bracketStack.clear();
            currentIsBalanced = "";
            for (int j = 0; j < currentString.length(); j++) {
                // Algo for brackets
                // If it is opening bracket push in stack
                Character currCharacter = currentString.charAt(j);
                Character popCharacter;
                if (currCharacter == '{' || currCharacter == '[' || currCharacter == '(' ) {
                    bracketStack.push(currCharacter);
                } else if (currCharacter == '}' || currCharacter == ']' || currCharacter == ')' ) {
                    if (bracketStack.isEmpty()) {
                        currentIsBalanced = "NO";
                        break;
                    }
                    popCharacter = bracketStack.pop();
                    if (currCharacter == '}' && popCharacter == '{') {
                        continue;
                    } else if (currCharacter == ']' && popCharacter == '[') {
                        continue;
                    } else if (currCharacter == ')' && popCharacter == '(') {
                        continue;
                    } else {
                        currentIsBalanced = "NO";
                        break;
                    }
                }
            }
            // If stack is empty then YES
            if (bracketStack.isEmpty() && !currentIsBalanced.equals("NO")){
                currentIsBalanced = "YES";
            }
            isBalanced[i] = currentIsBalanced;
        }

        return isBalanced;
    }


}
