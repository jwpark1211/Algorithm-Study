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
        int answer = -1;

        int max = 0;
        int sum = 0;
        for(int i=0; i<N; i++){
            if(max<arr[i])
               max = arr[i];
            sum += arr[i];
        }

        int  lt = max; int rt = sum;
        int mid = (lt+rt)/2;
        while (lt<=rt){
            if(count(arr,mid)<=M){
                answer = mid;
                rt = mid -1;
                mid = (lt+rt)/2;
            }else{
                lt = mid+1;
                mid = (lt+rt)/2;
            }
        }
        return answer ;
    }
    public static int count(int arr[] , int MID){
        int count = 0; int sum = 0;
        for(int i=0; i<arr.length; i++){
            sum += arr[i];
            if(sum>MID){
                count ++;
                sum -= arr[i--];
                sum = 0;
            }
            if(i == arr.length-1 && sum>0)
                count ++;
        }
        return count;
    }
}

