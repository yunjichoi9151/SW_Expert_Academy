import java.util.Scanner;

public class Eradication_of_Flies_2001 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		for(int tc = 0; tc < t; tc++) {
			int res = 0;
			int n = sc.nextInt(), m = sc.nextInt();
			int[][] arr = new int[n][n];
			for(int i = 0; i < n; i++)
				for(int j = 0; j < n; j++)
					arr[i][j] = sc.nextInt();
			for(int i = 0; i < n; i++) {
				for(int j = 0; j < n; j++) {
					int sum1 = 0, sum2 = 0;
					for(int x = -(m - 1); x < m; x++) {
						if(i + x >= 0 && j >= 0 && i + x < n && j < n)
							sum1 += arr[i + x][j];
						if(i >= 0 && j + x >= 0 && i < n && j + x < n)
							sum1 += arr[i][j + x];
					}
					sum1 -= arr[i][j];
					for(int x = -(m - 1); x < m; x++) {
						if(i + x >= 0 && j + x >= 0 && i + x < n && j + x < n)
							sum2 += arr[i + x][j + x];
						if(i + x >= 0 && j - x >= 0 && i + x < n && j - x < n)
							sum2 += arr[i + x][j - x];
					}
					sum2 -= arr[i][j];
					res = (sum1 > sum2 ? sum1 : sum2) > res ? (sum1 > sum2 ? sum1 : sum2) : res;
				}
			}
			System.out.println("#" + (tc + 1) + " " + res);
		}
		sc.close();
	}
}