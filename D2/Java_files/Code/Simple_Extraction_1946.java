import java.util.Scanner;

public class Simple_Extraction_1946 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		for(int k = 1; k <= t; k++) {
			int n = sc.nextInt();
			String[] s = new String[n];
			int[] num = new int[n];
            int idx = 0, total = 0;
			for(int i = 0; i < n; i++) {
				s[i] = sc.next();
				num[i] = sc.nextInt();
				total += num[i];
			}
			String [] arr = new String[total];
			for(int i = 0; i < n; i++) {
				for(int j = 0; j < num[i]; j++) {
					arr[idx] = s[i];
					idx++;
				}
			}
			System.out.println("#" + k);
			for(int i = 0; i < idx; i++){
				if(i != 0 && i % 10 == 0) {
					System.out.println();
				}
				System.out.print(arr[i]);
			}
            System.out.println();
		}
        sc.close();
	}
}