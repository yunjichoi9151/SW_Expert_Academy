package Java_files.Code;

import java.util.Scanner;

public class Omok_Judgment_11315 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for(int tc = 1; tc <= t; tc++) {
            int n = sc.nextInt();
            int[][] arr = new int[n][n];
            for(int i = 0; i < n; i++) {
                String s = sc.next();
                for(int j = 0; j < n; j++) {
                    arr[i][j] = s.charAt(j);
                }
            }
            String result = "NO";
            outerLoop:
            for(int i = 0; i <= n - 5; i++) {
                for(int j = 0; j <= n - 5; j++) {
                    for(int k = 0; k < 5; k++) {
                        if(arr[i + k][j] == 'o' && arr[i + k][j + 1] == 'o' && arr[i + k][j + 2] == 'o' && arr[i + k][j + 3] == 'o' && arr[i + k][j + 4] == 'o') {
                            result = "YES";
                            break outerLoop;
                        }
                        if(arr[j][i + k] == 'o' && arr[j + 1][i + k] == 'o' && arr[j + 2][i + k] == 'o' && arr[j + 3][i + k] == 'o' && arr[j + 4][i + k] == 'o') {
                            result = "YES";
                            break outerLoop;
                        }
                    }
                    if(arr[i][j] == 'o' && arr[i + 1][j + 1] == 'o' && arr[i + 2][j + 2] == 'o' && arr[i + 3][j + 3] == 'o' && arr[i + 4][j + 4] == 'o') {
                        result = "YES";
                        break outerLoop;
                    }
                    if(arr[i][j + 4] == 'o' && arr[i + 1][j + 3] == 'o' && arr[i + 2][j + 2] == 'o' && arr[i + 3][j + 1] == 'o' && arr[i + 4][j] == 'o') {
                        result = "YES";
                        break outerLoop;
                    }
                }
            }
            System.out.println("#" + tc + " " + result);
        }
    }
}
