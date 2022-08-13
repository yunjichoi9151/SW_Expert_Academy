import java.util.Scanner;

public class Stoku_Verification_1974 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for (int i = 0; i < t; i++) {
            int[][] arr = new int[9][9];
            int result = 1;
            for (int j = 0; j < 9; j++) {
                for (int r = 0; r < 9; r++)
                    arr[j][r] = sc.nextInt();
            }
            for (int j = 0; j < 9; j++) {
                int sum1 = 0, sum2 = 0;
                for (int r = 0; r < 9; r++) {
                    sum1 += arr[j][r];
                    sum2 += arr[r][j];
                }
                if(!(sum1 == 45 && sum2 == 45)) {
                    result = 0;
                    break;
                }
            }
            for (int j = 0; j < 9; j += 3) {
                for (int r = 0; r < 9; r += 3) {
                    int sum = 0;
                    for (int x = 0; x < 3; x++) {
                        for (int y = 0; y < 3; y++) {
                            sum += arr[j + x][r + y];
                        }
                    }
                    if (sum != 45) {
                        result = 0;
                        break;
                    }
                }
                if (result == 0)
                    break;
            }
            System.out.println("#" + (i + 1) + " " + result);
        }
        sc.close();
    }
}
