import java.util.Scanner;
import java.util.Arrays;

public class Flatten_1208 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        for(int tc = 1; tc <= 10; tc++) {
            int n = sc.nextInt();
            int[] arr = new int[100];
            for(int i = 0; i < 100; i++) {
                arr[i] = sc.nextInt();
            }
            Arrays.sort(arr);
            for(int i = 0; i < n; i++) {
                arr[99]--;
                arr[0]++;
                Arrays.sort(arr);
            }
            System.out.println("#" + tc + " " + (arr[99] - arr[0]));
        }
        sc.close();
    }    
}
