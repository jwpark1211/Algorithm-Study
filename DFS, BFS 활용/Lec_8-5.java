import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class Main {
    static int n,m,answer = Integer.MAX_VALUE;
    public void DFS(int L,int sum, Integer[] coin){
        if(sum>m) return;
        if(L>=answer) return; //이거 없으면 time limit exceed
        if(sum == m){
            answer = Math.min(answer,L);
        }else{
            for(int i=0;i<n;i++){
                DFS(L+1,sum+coin[i],coin);
            }
        }
    }
    public static void main(String[] args) {
        Main T = new Main();
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        Integer [] coin = new Integer[n];
        for(int i=0;i<n;i++) coin[i] = sc.nextInt();
        Arrays.sort(coin, Collections.reverseOrder()); //이거 없으면 time limit exceeded
        m = sc.nextInt();
        T.DFS(0,0,coin);
        System.out.println(answer);
    }
}