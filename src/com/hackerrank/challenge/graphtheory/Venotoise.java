package com.hackerrank.challenge.graphtheory;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Venotoise {

    static int whoGetsTheCatch(int n, int x, int[] X, int[] V) {
        int [] catchSeconds = new int[n];
        for(int i = 0; i < n; i++) {
            int distance = 0;
            if(x > X[i]) {
                distance = x - X[i];
            } else {
                distance = X[i] - x;
            }
            catchSeconds[i] = distance / V[i];
        }
        int min = catchSeconds[0];
        int minIndex = 0;
        for(int i = 1; i < catchSeconds.length; i++) {
            if(catchSeconds[i] < min) {
                min = catchSeconds[i];
                minIndex = i;
            }
        }
        for(int i = 0; i < catchSeconds.length; i++) {
            if(minIndex != i && catchSeconds[i] == min) {
                return -1;
            }
        }
        return minIndex;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        //  Return the index of the catcher who gets the catch, or -1 if no one gets the catch.
        int n = in.nextInt();
        int x = in.nextInt();
        int[] X = new int[n];
        for(int X_i=0; X_i < n; X_i++){
            X[X_i] = in.nextInt();
        }
        int[] V = new int[n];
        for(int V_i=0; V_i < n; V_i++){
            V[V_i] = in.nextInt();
        }
        int result = whoGetsTheCatch(n, x, X, V);
        System.out.println(result);
    }
}