package Java_files.Code;

import java.util.LinkedList;
import java.util.Scanner;

public class Ciphertext3_1230 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        for(int tc = 1; tc <= 10; tc++) {
            int n = sc.nextInt();
            LinkedList<Integer> list = new LinkedList<>();
            for(int i = 0; i < n; i++) {
                list.add(sc.nextInt());
            }
            int n2 = sc.nextInt();
            for(int i = 0; i < n2; i++) {
                char c = sc.next().charAt(0);
                if(c == 'I') {
                    int index = sc.nextInt(); 
                    int n3 = sc.nextInt(); 
                    for(int j = index; j < index + n3; j++) { 
                        list.add(j, sc.nextInt());
                    }
                }
                else if(c == 'D') {
                    int index = sc.nextInt(); 
                    int n3 = sc.nextInt(); 
                    for(int j = index; j < index + n3; j++) { 
                        list.remove(index); 
                    }
                }
                else if(c == 'A') {
                    int n3 = sc.nextInt(); 
                    for(int j = 0; j < n3; j++) { 
                        list.add(sc.nextInt()); 
                    }
                }
                 
            }
            System.out.print("#" + tc + " ");
            for(int i = 0; i < 10; i++) {
                System.out.print(list.get(i) + " ");
            }
            System.out.println();
        }
        sc.close();
    }
}