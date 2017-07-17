package com.hackerrank.challenge.graphtheory;

import java.util.Arrays;
import java.util.stream.IntStream;

/**
 * Created by georgekankava on 17.07.17.
 */
public class Quicksort {

    public static int[] quicksort(int [] arr) {
        IntStream stream = Arrays.stream(arr);
        int pivot = arr[0];
        int left [] = new int [1];
        int middle [] = new int [1];
        int right [] = new int [1];

        for (int a : arr) {
            if(a < arr[0]) {
                int [] temp = left;
                left = new int[left.length + 1];
                System.arraycopy(temp, 0, left, 0, temp.length);
                left[left.length - 1] = a;
            } else if (a == arr[0]) {
                int [] temp = middle;
                middle = new int[middle.length + 1];
                System.arraycopy(temp, 0, middle, 0, temp.length);
                middle[middle.length - 1] = a;
            } else if (a > arr[0]) {
                int [] temp = right;
                right = new int[right.length + 1];
                System.arraycopy(temp, 0, right, 0, temp.length);
                right[right.length - 1] = a;
            }

        }
        int [] result = new int[left.length + middle.length + right.length];
        System.arraycopy(left, 0, result, 0, left.length);
        System.arraycopy(middle, 0, result, left.length - 1, middle.length);
        System.arraycopy(right, 0, result, left.length + middle.length - 2, right.length);
        return result;
    }

    public static void main(String[] args) {
        int result [] = quicksort(new int [] {2, 9, 41, 24, 54, 12, 32, 11});
        System.out.println(Arrays.toString(result));
    }
}
