import java.util.Scanner;

public class Palindrome_2_1216 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        for(int tc = 1; tc <= 10; tc++) {
            int n = sc.nextInt();
            char[][] arr = new char[100][100];
            for(int i = 0; i < 100; i++) {
                String s = sc.next();
                for(int j = 0; j < 100; j++) {
                    arr[i][j] = s.charAt(j);
                }
            }
            int max = 0, cnt = 0, c1 = 0, c2 = 0, r1 = 0, r2 = 0, k = 1;
            for(int i = 0; i < 100; i++) {
                for(int j = 0; j < 100; j++) {
                    k = 0;
                    cnt = 0;
                    while(true) {
                        c1 = j - k;
                        c2 = j + k + 1;
                        if(c1 >= 0 && c2 >= 0 && c1 < 100 && c2 < 100) {
                            if(arr[i][c1] == arr[i][c2]) {
                                cnt++;
                                k++;
                            }
                            else {
                                break;
                            }
                        }
                        else {
                            break;
                        }
                    }
                    if(max < cnt * 2) {
                        max = cnt * 2;
                    }
                    k = 0;
                    cnt = 0;
                    while(true) {
                        r1 = i - k;
                        r2 = i + k + 1;
                        if(r1 >= 0 && r2 >= 0 && r1 < 100 && r2 < 100) {
                            if(arr[r1][j] == arr[r2][j]) {
                                cnt++;
                                k++;
                            }
                            else {
                                break;
                            }
                        }
                        else {
                            break;
                        }
                    }
                    if(max < cnt * 2) {
                        max = cnt * 2;
                    }
                    k = 1;
                    cnt = 0;
                    while(true) {
                        c1 = j - k;
                        c2 = j + k;
                        if(c1 >= 0 && c2 >= 0 && c1 < 100 && c2 < 100) {
                            if(arr[i][c1] == arr[i][c2]) {
                                cnt++;
                                k++;
                            }
                            else {
                                break;
                            }
                        }
                        else {
                            break;
                        }
                    }
                    if(max < cnt * 2 + 1) {
                        max = cnt * 2 + 1;
                    }
                    k = 1;
                    cnt = 0;
                    while(true) {
                        r1 = i - k;
                        r2 = i + k;
                        if(r1 >= 0 && r2 >= 0 && r1 < 100 && r2 < 100) {
                            if(arr[r1][j] == arr[r2][j]) {
                                cnt++;
                                k++;
                            }
                            else {
                                break;
                            }
                        }
                        else {
                            break;
                        }
                    }
                    if(max < cnt * 2 + 1) {
                        max = cnt * 2 + 1;
                    }
                }
            }
            System.out.println("#" + n + " " + max);
        }
        sc.close();
    }
}
