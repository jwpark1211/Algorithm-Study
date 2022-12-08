import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class Main {
    static int [] count;
    static int [] coin;
    static int n,m;
    static int answer = Integer.MAX_VALUE;
    public void DFS(int L,int M){
        if(M<0) return;
        if(L==n){
            if(M==0) {
                int sum = 0;
                for (int x : count) {
                    sum += x;
                }
                answer = Math.min(sum, answer);
            }
        }else{
            for(int i=0; i<n; i++){
                for(int j=0; j<=M/coin[i];j++){
                    count[L] = j;
                    DFS(L+1,M-coin[i]*j);
                }
            }
        }
    }
    public static void main(String[] args) {
        Main T = new Main();
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        count = new int[n];
        coin = new int[n];
        for(int i=0;i<n;i++) coin[i] = sc.nextInt();
        m = sc.nextInt();
        T.DFS(0,m);
        System.out.println(answer);
    }
}