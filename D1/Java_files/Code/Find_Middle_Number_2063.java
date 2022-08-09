import java.util.Scanner;
import java.util.Arrays;

public class Find_Middle_Number_2063 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int numArr[] = new int[n];
        for (int i = 0; i < n; i++) {
            numArr[i] = sc.nextInt();
        }
        Arrays.sort(numArr);
        System.out.println(numArr[n / 2]);
        sc.close();
    }
}