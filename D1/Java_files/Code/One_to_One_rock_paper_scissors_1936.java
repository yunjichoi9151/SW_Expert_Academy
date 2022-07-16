import java.util.Scanner;

public class One_to_One_rock_paper_scissors_1936 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt(), b = sc.nextInt();
        if (a > b)
            System.out.println((b == a - 1) ? "A" : "B");
        else
            System.out.println((a == b - 1) ? "B" : "A");
    }
}
