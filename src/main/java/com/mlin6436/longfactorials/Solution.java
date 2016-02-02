package com.mlin6436.longfactorials;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();

        System.out.println(BigIntFactorial(BigInteger.ONE, n));
    }

    public static BigInteger BigIntFactorial(BigInteger res, int in) {
        if (in == 0) {
            return res;
        } else {
            return BigIntFactorial(res.multiply(BigInteger.valueOf(in)), in - 1);
        }
    }
}
