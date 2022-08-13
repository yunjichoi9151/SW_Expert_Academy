import java.util.Scanner;

public class String_1213 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        for(int tc = 1; tc <= 1; tc++) {
            int n = sc.nextInt();
            int cnt = 0, i = 0;
            String s = sc.next();
            String s1 = sc.next();
            if(s1.indexOf(s) != -1) {
                while(s1.indexOf(s, i) != -1) {
                    if(s1.indexOf(s, i) >= 0) {
                        System.out.println("s1.indexof(s, i) is " + s1.indexOf(s, i));
                        System.out.println("case1");
                        cnt++;
                        System.out.println("cnt is " + cnt);
                        i = (s1.indexOf(s, i) + s.length());
                        System.out.println("i is " + i);
                    }
                    else {
                        System.out.println("case2");
                        i++;
                    }
                }
            }
            else {
                System.out.println("case3");
                cnt = 0;
            }
            System.out.println("#" + n + " " + cnt);
        }
        sc.close();
    }
}