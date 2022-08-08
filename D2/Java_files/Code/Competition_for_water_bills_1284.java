import java.util.Scanner;

public class Competition_for_water_bills_1284 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for(int i = 0; i < t; i++) {
            int p = sc.nextInt(), q = sc.nextInt(), r = sc.nextInt(), s = sc.nextInt(), w = sc.nextInt();
            if(w > r)
                System.out.println("#" + (i + 1) + " " + (w * p > q + s * (w - r) ? q + s * (w - r) : w * p));
            else
                System.out.println("#" + (i + 1) + " " + (w * p > q ? q : w * p));
        }
        sc.close();
    }
}
