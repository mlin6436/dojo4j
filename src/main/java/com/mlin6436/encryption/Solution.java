package com.mlin6436.encryption;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s = in.next();

        int l = s.length();
        Double sqrl = Math.sqrt(l);
        Double low = Math.floor(sqrl);
        Double high = Math.ceil(sqrl);
        int r = 0;
        int c = 0;

        if (low == high) {
            r = low.intValue();
            c = low.intValue();
        } else if (low * high >= l){
            r = low.intValue();
            c = high.intValue();
        } else {
            r = high.intValue();
            c = high.intValue();
        }

//        System.out.println("Row: " + r);
//        System.out.println("Col: " + c);

        StringBuilder sb = new StringBuilder();
        char en[] = s.toCharArray();
        for (int i = 0; i < c; i++) {
            for (int j = 0; j < r; j++) {
                if (j*c + i < l) {
                    sb.append(en[j*c + i]);
                }
            }
            sb.append(" ");
        }

        System.out.println(sb.toString());
    }
}
