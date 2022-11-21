import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int arr[] = new int[N];
        for(int i=0; i<N; i++) arr[i] = sc.nextInt();
        solution(N,arr);
    }
    public static void solution(int N,int arr[]) {
        for(int i=1; i<=N; i++){
            int tmp = arr[i],j;
            for(j= i-1; j>=0; j--){
                if(arr[j]>tmp) arr[j+1] = arr[j];
                else break;
            }
            arr[j+1]=tmp;
        }
        for(int x : arr) System.out.print(x+" ");
    }
}
