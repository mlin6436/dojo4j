package com.mlin6436.cavitymap;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        String grid[] = new String[n];
        for (int grid_i = 0; grid_i < n; grid_i++) {
            grid[grid_i] = in.next();
        }

        String result[][] = new String[n][n];

        if (n == 1 || n == 2) {
            for (int j = 0; j < n; j++) {
                System.out.println(grid[j]);
            }
        }
        if (n > 2) {
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < n; j++) {
//                    System.out.println("Row: " + i + ", Col: " + j);
                    if (i == 0 || j == 0 || i == n - 1 || j == n - 1) {
//                        System.out.println("Row: " + i + ", Col: " + j + ". Skipped.");
                        result[i][j] = String.valueOf(grid[i].charAt(j));
                    } else {
//                        System.out.println("Row: " + i + ", Col: " + j + ". Processing.");

                        String nu = String.valueOf(grid[i - 1].charAt(j));
                        String nd = String.valueOf(grid[i + 1].charAt(j));
                        String nl = String.valueOf(grid[i].charAt(j - 1));
                        String nr = String.valueOf(grid[i].charAt(j + 1));

                        if (nu.equals("X") || nd.equals("X") || nl.equals("X") || nr.equals("X")) {
                            result[i][j] = String.valueOf(grid[i].charAt(j));
                            break;
                        } else {
                            int vnu = Integer.valueOf(nu);
                            int vnd = Integer.valueOf(nd);
                            int vnl = Integer.valueOf(nl);
                            int vnr = Integer.valueOf(nr);
                            int cur = Integer.valueOf(String.valueOf(grid[i].charAt(j)));

//                            System.out.println("Current value: " + cur);

                            if (cur > vnu && cur > vnd && cur > vnl && cur > vnr) {
                                result[i][j] = "X";
                            } else {
                                result[i][j] = String.valueOf(grid[i].charAt(j));
                            }
                        }
                    }
                }
            }
            PrintResult(result, n);
        }
    }

    private static void PrintResult(String[][] grid, int n) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.printf("%s", grid[i][j]);
            }
            System.out.println();
        }
    }
}
