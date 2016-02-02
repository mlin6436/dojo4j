package com.mlin6436.taumandbday;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();

        List<BigInteger> result = new ArrayList<BigInteger>();
        for(int a0 = 0; a0 < t; a0++){
            BigInteger b = in.nextBigInteger();
            BigInteger w = in.nextBigInteger();
            BigInteger x = in.nextBigInteger();
            BigInteger y = in.nextBigInteger();
            BigInteger z = in.nextBigInteger();

//            System.out.println(b);
//            System.out.println(w);
//            System.out.println(x);
//            System.out.println(y);
//            System.out.println(z);

            result.add(convert(b, w, x, y, z));
        }

        for (BigInteger r : result) {
            System.out.println(r);
        }
    }

    private static BigInteger convert(BigInteger b, BigInteger w, BigInteger cb, BigInteger cw, BigInteger cc) {
//        int ncb = cb;
//        int ncw = cw;
//
//        if (cw > cb + cc) {
//            ncw = cb + cc;
//        }
//
//        if (cb > cw + cc) {
//            ncb = cw + cc;
//        }
//
//        return b * ncb + w * ncw;

        BigInteger allb = b.multiply(cb).add(w.multiply(cb.add(cc)));
        BigInteger allw = b.multiply(cw.add(cc)).add(w.multiply(cw));
        BigInteger norm = b.multiply(cb).add(w.multiply(cw));

        if (allb.compareTo(allw) >= 0) {
            if (norm.compareTo(allw) >= 0) {
                return allw;
            } else {
                return norm;
            }
        } else {
            if (norm.compareTo(allb) >= 0) {
                return allb;
            } else {
                return norm;
            }
        }
    }
}
