package com.mlin6436.twostrings;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        if (num < 1 || num > 10) {
            System.out.println("Err");
        }

        String cases[] = new String[2 * num];

        for (int i = 0; i < 2 * num; i++) {
            cases[i] = sc.next();
        }

        for (int i = 0; i < 2 * num; i = i + 2) {
            boolean result = false;
            String s1 = cases[i];
            String s2 = cases[i + 1];

            Set<Character> s1c = new HashSet<Character>();
            for (char c : s1.toCharArray()) {
                s1c.add(c);
            }
            Set<Character> s2c = new HashSet<Character>();
            for (char c : s2.toCharArray()) {
                s2c.add(c);
            }

            for (char c1 : s1c) {
                for (char c2 : s2c) {
                    if (String.valueOf(c1).equals(String.valueOf(c2))) {
                        result = true;
                        break;
                    }
                }
            }

            // S2: not performing enough
//            for (char c : s1.toCharArray()) {
//                if (s2.contains(String.valueOf(c))) {
//                    result = true;
//                    break;
//                }
//            }

            // S1: too complicated
//            for (int begin = 0; begin < s1.length(); begin++) {
//                for (int end = begin + 1; end < s1.length() + 1; end++) {
//                    if (s2.contains(s1.substring(begin, end))) {
//                        result = true;
//                        break;
//                    }
//                }
//            }

            if (result) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }
    }
}