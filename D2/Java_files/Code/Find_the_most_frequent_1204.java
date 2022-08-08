import java.util.Scanner;

public class Find_the_most_frequent_1204 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        
        for (int i = 0; i < t; i++) {
            int[] arr = new int[1000];
            int[] arr2 = new int[101];
            int max = 0, idx = 0;
            int n = sc.nextInt();
            for (int j = 0; j < 1000; j++) {
                arr[j] = sc.nextInt();
                arr2[arr[j]] += 1;
            }
            for (int j = 0; j < 101; j++) {
                if (arr2[j] > max) {
                    max = arr2[j];
                    idx = j;
                }
                else if (arr2[j] == max) {
                    idx = j;
                }
            }
            System.out.println("#" + n + " " + idx);
        }
        sc.close();
    }
}
