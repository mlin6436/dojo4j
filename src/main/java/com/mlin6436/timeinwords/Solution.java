package com.mlin6436.timeinwords;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static String[] NUMBERS = {"one", "two", "three", "four", "five", "six", "seven", "eight", "nine", "ten",
            "eleven", "twelve", "thirteen", "fourteen", "fifteen", "sixteen", "seventeen", "eighteen", "nineteen", "twenty"
    };

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int h = in.nextInt();
        int m = in.nextInt();
        System.out.println(convert(h, m));
    }

    public static String convert(int h, int m) {
        if (m == 0) {
            return NUMBERS[h - 1] + " o'clock";
        } else if (m == 1) {
            return "one minute past " + NUMBERS[h - 1];
        } else if (m == 15) {
            return "quarter past " + NUMBERS[h - 1];
        } else if (m == 45) {
            return "quarter to " + NUMBERS[h];
        } else if (m > 1 && m <= 20) {
            return NUMBERS[m - 1] + " minutes past " + NUMBERS[h - 1];
        } else if (m > 20 && m < 30) {
            return "twenty " + NUMBERS[m - 20 - 1] + " minutes past " + NUMBERS[h - 1];
        } else if (m == 30) {
            return "half past " + NUMBERS[h - 1];
        } else if (m > 30 && m < 40) {
            return "twenty " + NUMBERS[60 - m - 20 - 1] + " minutes to " + NUMBERS[h];
        } else if (m >= 40 && m < 59) {
            return NUMBERS[60 - m - 1] + " minutes to " + NUMBERS[h];
        } else if (m == 59) {
            return "one minute to " + NUMBERS[h];
        }
        return "";
    }
}
