import java.util.Arrays;
import java.util.Scanner;

public class Find_Middle_Number_2063 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numArr[] = new int[200];
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            numArr[i] = sc.nextInt();
        }
        Arrays.sort(numArr);
        System.out.println(numArr[n / 2 + 1]);
        sc.close();
    }
}