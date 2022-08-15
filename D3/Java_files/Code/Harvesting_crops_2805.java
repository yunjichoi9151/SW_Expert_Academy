package Java_files.Code;

import java.util.Scanner;

public class Harvesting_crops_2805 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for (int i = 0; i < t; i++) {
            int n = sc.nextInt(), sum = 0;
            int[][] arr = new int[n][n];
            for (int j = 0; j < n; j++) {
                String s = sc.next();
                for (int r = 0; r < n; r++) {
                    arr[j][r] = s.charAt(r) -'0';
                    if (j == n / 2 || r == n / 2) {
                        sum += arr[j][r];
                    }
                    else if ((Math.abs(j - n / 2)) + Math.abs(r - n / 2) <= n / 2) {
                        sum += arr[j][r];
                    }
                }
            }
            System.out.printf("#%d %d\n", (i + 1), sum);
        }
        sc.close();
    }
}