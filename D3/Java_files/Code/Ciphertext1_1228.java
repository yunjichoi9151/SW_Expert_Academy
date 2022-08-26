import java.util.ArrayList;
import java.util.Scanner;

public class Ciphertext1_1228 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        for(int tc = 1; tc <= 10; tc++) {
            int n1 = sc.nextInt();
            ArrayList<Integer> arr1 = new ArrayList<>();
            for(int i = 0; i < n1; i++) {
                arr1.add(sc.nextInt());
            }
            int n2 = sc.nextInt();
            for(int i = 0; i < n2; i++) {
                String s = sc.next();
                int index = sc.nextInt();
                int n3 = sc.nextInt();
                for(int j = 0; j < n3; j++) {
                    arr1.add(index, sc.nextInt());
                    index++;
                }
            }
            System.out.print("#" + tc + " ");
            for(int i = 0; i < 10; i++) {
                System.out.print(arr1.get(i) + " ");
            }
            System.out.println();
        }
        sc.close();
    }
}
