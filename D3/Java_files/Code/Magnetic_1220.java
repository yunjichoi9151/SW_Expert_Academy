import java.util.Scanner;

public class Magnetic_1220 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        for (int tc = 1; tc <= 10; tc++) {
            int n = sc.nextInt();
            int[][] table = new int[n][n];
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < n; j++) {
                    table[i][j] = sc.nextInt();
                }
            }
 
            int cnt = 0;
            int prev = 0;
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < n; j++) {
                    if (table[j][i] == 1) {
                        prev = 1;
                    }
                    if (prev == 1 && table[j][i] == 2) {
                        cnt++;
                        prev = 0;
                    }
                }
                prev = 0;
            }
            System.out.println("#" + tc + " " + cnt);
        }
        sc.close();
    }    
}
