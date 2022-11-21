import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int S = sc.nextInt();
        int N = sc.nextInt();
        int arr[] = new int[N];
        for(int i=0; i<N; i++) arr[i] = sc.nextInt();
        solution(S,N,arr);
    }
    public static void solution(int S,int N,int arr[]) {
        int cache [] = new int[S];
        for(int x : arr){
            int pos = -1;
            for(int i=0; i<S; i++) if(x == cache[i]) pos=i;
            if(pos == -1){
                for(int i=S-1;i>=1;i--)
                    cache[i] = cache[i-1];
                cache[0]=x;
            }else{
                for(int i=pos; i>=1; i--)
                    cache[i] = cache[i-1];
                cache[0] = x;
            }
        }
        for(int x : cache) System.out.print(x+" ");
    }
}

