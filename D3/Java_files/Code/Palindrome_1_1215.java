import java.util.Scanner;

public class Palindrome_1_1215 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        for(int tc = 1; tc <= 10; tc++) {
            int n = sc.nextInt();
            char[][] arr = new char[8][8];
            for(int i = 0; i < 8; i++) {
                String s = sc.next();
                for(int j = 0; j < 8; j++) {
                    arr[i][j] = s.charAt(j);
                }
            }
            int result1 = 0, result2 = 0, cnt = 0;
            for(int i = 0; i < 8; i++) {
                for(int j = 0; j <= 8 - n; j++) {
                    for (int k = 0; k < n / 2; k++) {
                        if ((arr[i][j + k] + "").equals(arr[i][j + n - k - 1] + "")) {
                            result1++;
                        }
                        else {
                            result1 = 0;
                        }
                        if ((arr[j + k][i] + "").equals(arr[j + n - k - 1][i] + "")) {
                            result2++;
                        }
                        else {
                            result2 = 0;
                        }
                    }
                    if(result1 == n / 2) {
                        cnt++;
                    }
                    if(result2 == n / 2) {
                        cnt++;
                    }
                    result1 = 0;
                    result2 = 0;
                }
            }
            System.out.println("#" + tc + " " + cnt);
        }
        sc.close();
    }
}