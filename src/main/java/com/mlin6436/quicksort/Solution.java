import java.util.*;

public class Solution {

    static void quickSort(int[] ar) {
        if (ar.length == 2) {
            if (ar[0] > ar[1]) {
                int temp = ar[0];
                ar[0] = ar[1];
                ar[1] = temp;
            }
        }
        if (ar.length > 2) {
            int p = ar[0];
            int max = ar.length;
            int greater = 0;
            for (int a : ar) {
                if (a > p) {
                    greater++;
                }
            }

            int[] smaller = new int[max - greater - 1];
            int[] bigger = new int[greater];
            int smaller_count = 0;
            int bigger_count = 0;
            for (int i = 1; i < ar.length; i++) {
                if (ar[i] <= p) {
                    smaller[smaller_count] = ar[i];
                    smaller_count++;
                } else {
                    bigger[bigger_count] = ar[i];
                    bigger_count++;
                }
            }

//            System.out.println("P is: " + p);
//            printArray(smaller);
//            printArray(bigger);

            quickSort(smaller);
            quickSort(bigger);

//            System.out.println("Sorted array: ");
            if (smaller.length > 0) {
                printArray(smaller);
            }
            if (bigger.length > 0) {
                printArray(bigger);
            }

            for (int i = 0; i < smaller_count; i++) {
                ar[i] = smaller[i];
            }
            ar[smaller_count] = p;
            for (int i = 0; i < bigger_count; i++) {
                ar[smaller_count + i + 1] = bigger[i];
            }
        }
    }

    static void printArray(int[] ar) {
        for (int n : ar) {
            System.out.print(n + " ");
        }
        System.out.println("");
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] ar = new int[n];
        for (int i = 0; i < n; i++) {
            ar[i] = in.nextInt();
        }
        quickSort(ar);
        printArray(ar);
    }
}
