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

        for(int i=0; i<N; i++){
           boolean isContain = false;
           for(int j=0; j<cache.length; j++)
               if(cache[j]==arr[i]){
                   isContain = true;
                   int tmp = cache[j];
                   for(int k=j; k>0; k--)
                       cache[k] = cache[k-1];
                   cache[0] = tmp;
               }
           if(isContain==false){
               for(int j=S-1; j>0; j--)
                   cache[j] = cache[j-1];
               cache[0] = arr[i];
           }
       }
       for(int x : cache) System.out.print(x+" ");
    }
}

