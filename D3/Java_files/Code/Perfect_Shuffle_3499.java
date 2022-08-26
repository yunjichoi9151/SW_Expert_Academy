import java.util.ArrayList;
import java.util.Scanner;

public class Perfect_Shuffle_3499 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for(int tc = 1; tc <= t; tc++) {
            int n = sc.nextInt();
            ArrayList<String> arr1 = new ArrayList<>();
            ArrayList<String> arr2 = new ArrayList<>();
            for(int i = 0; i < n; i++) {
                arr1.add(sc.next());
            }
            for(int i = 0; i < n / 2; i++) {
                arr2.add(arr1.get(i));
                if(n % 2 == 0) {
                    arr2.add(arr1.get(i + n / 2));
                }
                else {
                    arr2.add(arr1.get(i + n / 2 + 1));
                }
            }
            if(n % 2 != 0) {
                arr2.add(arr1.get(n / 2));
            }
            System.out.print("#" + tc + " ");
            for(int i = 0; i < n; i++) {
                System.out.print(arr2.get(i) + " ");
            }
            System.out.println();
        }
        // for(int tc = 1; tc <= t; tc++) {
        //     int n = sc.nextInt();
        //     String[] arr1 = new String[n];
        //     String[] arr2 = new String[n / 2];
        //     String[] arr3 = new String[n / 2];
        //     for(int i = 0; i < n; i++) {
        //         arr1[i] = sc.next();
        //         if(i < n / 2) {
        //             arr2[i] = arr1[i];
        //         }
        //         else {
        //             if(n % 2 == 0) {
        //                 if(i >= n / 2) {
        //                     arr3[i - n / 2] = arr1[i];
        //                 }
        //             }
        //             else {
        //                 if(i > n / 2) {
        //                     arr3[i - n / 2 - 1] = arr1[i];
        //                 }
        //             }
        //         }
        //     }
        //     System.out.print("#" + tc + " ");
        //     for(int i = 0; i < n / 2; i++) {
        //         System.out.print(arr2[i] + " " + arr3[i] + " ");
        //     }
        //     if(n % 2 != 0) {
        //         System.out.print(arr1[n / 2 + 1]);
        //     }
        //     System.out.println();
        // }
        sc.close();
    }
}
