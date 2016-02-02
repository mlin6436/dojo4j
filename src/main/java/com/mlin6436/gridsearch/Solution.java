package com.mlin6436.gridsearch;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        for(int a0 = 0; a0 < t; a0++){
            int R = in.nextInt();
            int C = in.nextInt();
            String G[] = new String[R];
            for(int G_i=0; G_i < R; G_i++){
                G[G_i] = in.next();
            }
            int r = in.nextInt();
            int c = in.nextInt();
            String P[] = new String[r];
            for(int P_i=0; P_i < r; P_i++){
                P[P_i] = in.next();
            }

            if (R < 1 || R > 1000) {
                System.out.println("NO");
            }
            if (C < 1 || C > 1000) {
                System.out.println("NO");
            }
            if (r < 1 || r > R) {
                System.out.println("NO");
            }
            if (c < 1 || c > C) {
                System.out.println("NO");
            }

            boolean result = false;

            for (int i = 0; i < R - r + 1; i++) {
                if (result == true) {
//                    System.out.println("SIG 1");
                    break;
                }

                for (int j = 0; j + c <= C; j++) {
                    String current = G[i].substring(j, j + c);
//                    System.out.println("Current " + current);
//                    System.out.println("P0 " + P[0]);
                    if (current.equals(P[0])) {
//                        System.out.println("GETIN");
                        for (int k = 0; k < r; k++) {
//                            System.out.println("Moved G: " + G[i + k].substring(j, j + c));
//                            System.out.println("Current P: " + P[k]);
                            if (!G[i + k].substring(j, j + c).equals(P[k])) {
//                                System.out.println("SIG 2");
                                break;
                            }
                            if (k == r - 1) {
//                                System.out.println("SIG 3");
                                result = true;
                            }
                        }
                    }
                }
            }

//            if (G.length == 1) {
//                result = G[0].contains(P[0]);
//            } else {
//                for (int i = 0; i < G.length - P.length + 1; i++) {
//                    if (result == true) {
//                        break;
//                    }
//
//                    if (P.length == 1 && G[i].contains(P[0])) {
//                        result = true;
//                    } else {
//                        if (G[i].contains(P[0])) {
//                            int pos = G[i].indexOf(P[0]);
//                            for (int j = 1; j < P.length; j++) {
//                                if (!G[i + j].contains(P[j]) || G[i + j].indexOf(P[j]) != pos) {
//                                    break;
//                                }
//                                if (j == P.length - 1) {
//                                    result = true;
//                                }
//                            }
//                        }
//                    }
//                }
//            }

            System.out.println(result ? "YES": "NO");
        }
    }
}
