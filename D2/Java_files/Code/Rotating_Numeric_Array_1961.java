import java.util.Scanner;

public class Rotating_Numeric_Array_1961 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for(int tc = 1; tc <= t; tc++) {
            int n = sc.nextInt();
            int[][] arr = new int[n][n];
            for(int i = 0; i < n; i++) {
                for(int j = 0; j < n; j++) {
                    arr[i][j] = sc.nextInt();
                }
            }
            System.out.println("#" + tc);
            for(int i = 0; i < n; i++) {
                for(int k = 0; k < n; k++) {
                    System.out.print(arr[n - 1 - k][i]);
                }
                System.out.print(" ");
                for(int k = 0; k < n; k++) {
                    System.out.print(arr[n - 1 - i][n - 1 - k]);
                }
                System.out.print(" ");
                for(int k = 0; k < n; k++) {
                    System.out.print(arr[k][n - 1 - i]);
                }
                System.out.println();
            }
        }
        sc.close();
    }
}
