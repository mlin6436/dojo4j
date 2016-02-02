package com.mlin6436.matrixrotation;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int row = in.nextInt();
        int col = in.nextInt();
        BigInteger r = in.nextBigInteger();

//        System.out.println(row);
//        System.out.println(col);
//        System.out.println(r);

        int m[][] = new int[row][col];
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                m[i][j] = in.nextInt();
            }
        }

//        for (int i = 0; i < row; i++) {
//            for (int j = 0; j < col; j++) {
//                System.out.print(m[i][j]);
//            }
//            System.out.println();
//        }

//        System.out.println(Math.ceil(Math.sqrt(col)));
        for (int n = 0; n < Math.ceil(Math.sqrt(col)); n++) {
            int max_row = row - n;
            int max_col = col - n;
//            System.out.println("New array size: " + size);
            List<Integer> a = new ArrayList<Integer>();

            for (int i = n; i < max_row - 1; i++) {
                a.add(m[i][n]);
            }
//            for (int i : a) {
//                System.out.print(i);
//            }
//            System.out.println();

            for (int i = n; i < max_col - 1; i++) {
                a.add(m[max_row - 1][i]);
            }
//            for (int i : a) {
//                System.out.print(i);
//            }
//            System.out.println();

            for (int i = max_row - 1; i > n; i--) {
                a.add(m[i][max_col - 1]);
            }
//            for (int i : a) {
//                System.out.print(i);
//            }
//            System.out.println();

            for (int i = max_col - 1; i > n; i--) {
                a.add(m[n][i]);
            }
//            for (int i : a) {
//                System.out.print(i);
//            }
//            System.out.println();

            if (n == max_row - 1) {
                for (int i = n; i < max_col - n; i++) {
                    a.add(m[n][i]);
                }
            }

            for (int i : a) {
                System.out.print(i);
            }
            System.out.println();
        }
    }
}