import java.util.Scanner;
import java.lang.Math;

public class Aruem_stone_throw_1285 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for(int i = 0; i < t; i++) {
            int n = sc.nextInt(), min = 100000, count = 0;
            int[] arr = new int[n];
            for(int j = 0; j < n; j++) {
                arr[j] = Math.abs(sc.nextInt());
                if(arr[j] < min)
                    min = arr[j];
            }
            for(int j = 0; j < n; j++) {
                if(arr[j] == min)
                    count++;
            }
            System.out.println("#" + (i + 1) + " " + min + " " + count);
        }
        sc.close();
    }
}
