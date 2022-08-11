import java.util.Scanner;
import java.util.Arrays;

public class Find_Middle_Median_1984 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for(int tc = 1; tc <= t; tc++) {
            int[] arr = new int[10];
            int sum = 0;
            for(int i = 0; i < 10; i++) {
                arr[i] = sc.nextInt();
                sum += arr[i];
            }
            Arrays.sort(arr);
            System.out.println("#" + tc + " " + Math.round((double)(sum - arr[0] - arr[9]) / 8));
        }
        sc.close();
    }
}
