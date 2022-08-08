import java.util.Scanner;

public class Rotating_Numeric_Array_1961 {
    static int[][] rotate(int arr[][]) {
        int[][] new_arr = new int[arr.length][arr.length];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                new_arr[i][j] = arr[arr.length - 1 - j][i];
            }
        }
        return new_arr;
    }
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for (int i = 1; i <= t; i++) {
            int n = sc.nextInt();
            int arr[][] = new int[n][n];
            for (int j = 0; j < n; j++) {
                for (int r = 0; r < n; r++) {
                    arr[j][r] = sc.nextInt();
                }
            }
            int arr2[][] = rotate(arr);
            int arr3[][] = rotate(arr2);
            int arr4[][] = rotate(arr3);
            System.out.format("#%d\n", i);
            for (int j = 0; j < n; j++) {
                for (int r = 0; r < n; r++)
                    System.out.print(arr2[j][r]);
                System.out.print(" ");
                for (int r = 0; r < n; r++)
                    System.out.print(arr3[j][r]);
                System.out.print(" ");
                for (int r = 0; r < n; r++)
                    System.out.print(arr4[j][r]);
                System.out.println();
            }
        }
        sc.close();
    }
}
