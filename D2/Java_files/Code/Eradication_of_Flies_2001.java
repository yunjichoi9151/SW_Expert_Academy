import java.util.Scanner;

public class Eradication_of_Flies_2001 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for (int i = 0; i < t; i++) {
            int n = sc.nextInt(), m = sc.nextInt(), max = 0;
            int[][] arr = new int[n][n];
            for (int j = 0; j < n; j++) {
                for (int r = 0; r < n; r++)
                    arr[j][r] = sc.nextInt();
            }
            for (int j = 0; j < n - m + 1; j++) {
                for (int r = 0; r < n - m + 1; r++) {
                    int count = 0;
                    for (int x = 0; x < m; x++) {
                        for (int y = 0; y < m; y++)
                            count += arr[j + x][r + y];
                    }
                    if (max < count)
                        max = count;
                }
            }
            System.out.println("#" + (i + 1) + " " + max);
        }
        sc.close();
    }
}
