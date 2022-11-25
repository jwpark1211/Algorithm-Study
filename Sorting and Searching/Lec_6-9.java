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
        int answer = 0;
        int lt = Arrays.stream(arr).max().getAsInt();
        int rt = Arrays.stream(arr).sum();

        while(lt<=rt){
            int mid = (lt+rt)/2;
            if(count(arr,mid)<=M){
                answer = mid;
                rt = mid -1;
            }else {
                lt = mid +1;
            }
        }
        return answer ;
    }
    public static int count(int arr[] , int MID){
        int count = 1; int sum = 0;
        for(int x: arr){
            if(sum+x>MID){
               count ++;
               sum = x;
            }else sum +=x;
        }
        return count;
    }
}

