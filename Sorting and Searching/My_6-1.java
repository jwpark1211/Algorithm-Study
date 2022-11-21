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
        int res[] = new int[N];

        for(int i=0; i<N; i++){
            int min = Integer.MAX_VALUE;
            int idx = -1;
            for(int j=0; j<N; j++){
                if(arr[j]>0) {
                    if (min > arr[j]) {
                        min = arr[j];
                        idx = j;
                    }
                }
            }
            arr[idx] = -1;
            res[i] = min;
        }

        for(int x: res)
            System.out.print(x+ " ");
    }
}
