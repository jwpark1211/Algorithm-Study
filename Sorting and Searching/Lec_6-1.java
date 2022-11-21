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
        for(int i=0; i<N-1; i++){
            int idx = i;
            for(int j=i+1; j<N; j++){
                if(arr[j]<arr[idx]) idx = j;
            }
            int tmp = arr[i];
            arr[i] = arr[idx];
            arr[idx] = tmp;
        }
        for(int x: arr)
            System.out.print(x+ " ");
    }
}

