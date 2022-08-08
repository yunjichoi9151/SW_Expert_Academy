import java.util.Scanner;

public class New_Cure_for_Insomnia_1288 {

    /*public static void main(String args[]) throws Exception
    {
        Scanner sc = new Scanner(System.in);
        int T;
        T=sc.nextInt();
        for(int test_case = 1; test_case <= T; test_case++)
        {
            boolean arr[]=new boolean[10];
            String A=sc.next();
            int num=Integer.parseInt(A);
            int count=0;
            int cnt=1;
            while(true){
                for(int i=0;i<A.length();i++){
                    int temp=Integer.parseInt(A.substring(i,i+1));
                    if(arr[temp]==false){
                        arr[temp]=true;
                        count++;
                    }
                }
                if(count==10)
                    break;
                else{
                    cnt++;
                    A=Integer.toString(num*cnt);
                }
            }
            System.out.println("#"+test_case+" "+A);
        }
    }*/
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for(int i = 1; i <= t; i++) {
            boolean[] arr = new boolean[10];
            String s = sc.next();
            int n = Integer.parseInt(s), cnt = 0, num = 1;
            while(true) {
                for(int j = 0; j < s.length(); j++) {
                    int tmp = Integer.parseInt(s.substring(j, j + 1));
                    if(arr[tmp] == false) {
                        arr[tmp] = true;
                        cnt++;
                    }
                }
                if(cnt == 10)
                    break;
                else {
                    num++;
                    s = Integer.toString(n * num);
                }
            }
            System.out.printf("#%d %s\n", i, s);
        }
        sc.close();
    }
}
