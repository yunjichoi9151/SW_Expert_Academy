import java.util.Scanner;
import java.lang.Math;

public class Two_Numeric_Columns_1959 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
        for (int i = 0; i < t; i++) {
            int n = sc.nextInt(), m = sc.nextInt();
            int diff = Math.abs(n - m), max = 0;
            int[] a = new int[n], b = new int[m], sum = new int[diff + 1];
            for (int j = 0; j < n; j++)
                a[j] = sc.nextInt();
            for (int j = 0; j < m; j++)
                b[j] = sc.nextInt();
            for (int j = 0; j < diff + 1; j++) {
                for (int k = 0; k < Math.min(a.length, b.length); k++) {
                    if (a.length < b.length)
                        sum[j] += a[k] * b[j + k];
                    else
                        sum[j] += b[k] * a[j + k];
                }
                if (sum[j] > max)
                    max = sum[j];
            }
            System.out.println("#" + (i + 1) + " " + max);
        }
        sc.close();
	}
}