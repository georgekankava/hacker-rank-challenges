package com.hackerrank.challenge.graphtheory;

import java.util.Scanner;

/**
 * Created by georgekankava on 15.06.17.
 */
public class Libraries {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int q = in.nextInt();
        for(int a0 = 0; a0 < q; a0++){
            int n = in.nextInt(); // cities
            int m = in.nextInt(); // roads
            int x = in.nextInt(); // build
            int y = in.nextInt(); // repair
            int buildPrice = 0;
            if (n > m || m == 0 || x <= y) {
                buildPrice = x * n;
                System.out.println(buildPrice);
                break;
            } else {
                buildPrice += x;
                for (int a1 = 0; a1 < m; a1++) {
                    int city_1 = in.nextInt();
                    int city_2 = in.nextInt();
                    if (city_1 > city_2 && city_1 - city_2 == 1) {
                        buildPrice += y;
                    } else if (city_2 - city_1 == 1) {
                        buildPrice += y;
                    }
                }
                System.out.println(buildPrice);
            }
        }
    }
}
