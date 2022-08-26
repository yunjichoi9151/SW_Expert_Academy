import java.util.Scanner;

public class Sum_1209 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        for(int tc = 1; tc <= 10; tc++) {
            int n = sc.nextInt();
            int max = 0, sum1 = 0, sum2 = 0, sum3 = 0, sum4= 0;
            int[][] arr = new int[100][100];
            for(int i = 0; i < 100; i++) {
                for(int j = 0; j < 100; j++) {
                    arr[i][j] = sc.nextInt();
                }
            }
            for(int i = 0; i < 100; i++) {
                sum1 = 0;
                sum2 = 0;
                sum3 += arr[i][i];
                sum4 += arr[99 - i][i];
                for(int j = 0; j < 100; j++){
                    sum1 += arr[i][j];
                    sum2 += arr[j][i];
                }
                max = Math.max(max,sum1);
                max = Math.max(max,sum2);
            }
            max = Math.max(max,sum3);
            max = Math.max(max,sum4);
            System.out.println("#" + n + " " + max);
        }
        sc.close();
    }
/*    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        for(int tc = 1; tc <= 1; tc++) {
            int tmp1 = 0, tmp2 = 0, max = 0;
            int[][] arr = new int[100][100];
            int[] arr2 = new int[4];
            for(int i = 0; i < 100; i++) {
                for(int j = 0; j < 100; j++) {
                    arr[i][j] = sc.nextInt();
                }
            }
            for(int i = 0; i < 100; i++) {
                for(int j = 0; j < 100; j++) {
                    tmp1 += arr[i][j];
                    tmp2 += arr[j][i];
                    if(j == 99) {
                        if(arr2[0] < tmp1)
                            arr2[0] = tmp1;
                        if(arr2[1] < tmp2)
                            arr2[1] = tmp2;
                    }
                }
                tmp1 = 0;
                tmp2 = 0;
            }
            for(int i = 0; i < 100; i++) {
                arr2[2] += arr[i][i];
                arr2[3] += arr[99 - i][i];
            }
            for(int i = 0; i < 4; i++) {
                System.out.println("arr2[" + i + "] is " + arr2[i]);
                if(max < arr2[i])
                    max = arr2[i];
                    System.out.println("max change and result is " + max);
            }
            System.out.println("#" + tc + " " + max);
        }
    }*/
}
