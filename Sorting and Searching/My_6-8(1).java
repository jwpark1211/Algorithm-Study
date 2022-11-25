import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();
        int arr[] = new int[N];
        for(int i=0; i<N; i++) arr[i] = sc.nextInt();
        System.out.println(solution(N,M,arr));
    }
    public static int solution(int N,int M, int [] arr) {
        int answer = 1;
        for(int x : arr){
            if(x<M) answer++;
        }
        return answer;
    }
}

