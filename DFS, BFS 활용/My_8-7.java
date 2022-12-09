import java.util.Scanner;

public class Main {
    static int n,r,answer = 0;
    static int[] arr,pm,ch ;

    public int DFS(int n, int r){
       if(r == 1) return n;
       if(n == r) return 1;
       else{
           answer = DFS(n-1,r-1)+DFS(n-1,r);
       }
       return answer;
    }
    public static void main(String[] args) {
        Main T = new Main();
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        r = sc.nextInt();
        System.out.println(T.DFS(n,r));
    }
}