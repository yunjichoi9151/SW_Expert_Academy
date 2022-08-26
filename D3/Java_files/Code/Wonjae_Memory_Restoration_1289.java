package Java_files.Code;

import java.util.Scanner;

public class Wonjae_Memory_Restoration_1289 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for(int tc = 1; tc <= t; tc++) {
            String s = sc.next();
            int[] arr = new int[s.length()];
            for(int i = 0; i < s.length(); i++) {
                arr[i] = s.charAt(i) - '0';
            }
            int dir = 0, idx = 0, cnt = 0;
            while(arr[idx] != 1) {
                idx++;
            }
            for(int i = idx; i < arr.length; i++) {
                if(dir == 0 && arr[i] == 1) {
                    cnt++;
                    dir = 1;
                }
                else if(dir == 1 && arr[i] == 0) {
                    cnt++;
                    dir = 0;
                }
            }
            System.out.println("#" + tc + " " + cnt);
        }
        sc.close();
    }
}
