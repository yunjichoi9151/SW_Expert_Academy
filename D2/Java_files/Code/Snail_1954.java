import java.util.Scanner;

public class Snail_1954 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int tc = 1; tc <= n; tc++) {
            int n1 = sc.nextInt();
            int[][] arr = new int[n1][n1];
            int print = n1, k = 1, right = -1, bottom = 0, top = 1;
            for(int i = n1; i > 0; i--) {
                for(int j = 0; j < print; j++) {
                    right += top;
                    arr[bottom][right] = k;
                    k++;
                }
                print--;
                for(int j = 0; j < print; j++) {
                    bottom += top;
                    arr[bottom][right] = k;
                    k++;
                }
                top = top * (-1);
            }
            System.out.println("#" + tc);
            for(int i = 0; i < arr.length; i++) {
                for(int j = 0; j < arr[i].length; j++) {
                    System.out.print(arr[i][j] + " ");
                }
                System.out.println();
            }
        }
        sc.close();
    }
}
