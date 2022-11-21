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
        for(int i=1; i<=N-1; i++){
            for(int j=0; j<i; j++){
                if(arr[j]>arr[i]){
                    int temp = arr[i];
                    for(int k= i; k>j ; k--)
                        arr[k] = arr[k-1];
                    arr[j] = temp;
                }
            }
        }
        for(int x : arr) System.out.print(x+" ");
    }
}
