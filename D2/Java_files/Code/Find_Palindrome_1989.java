import java.util.Scanner;

public class Find_Palindrome_1989 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(), result = 0;
        for (int i = 0; i < n; i++) {
            String s = sc.next();
            for (int j = 0; j < s.length() / 2; j++) {
                if (s.charAt(j) == s.charAt(s.length() - j - 1))
                    result = 1;
                else
                    result = 0;
            }
            System.out.println("#" + (i + 1) + " " + result);
        }
        sc.close();
    }
}