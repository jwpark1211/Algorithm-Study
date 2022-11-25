import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();
        int arr[] = new int[N];
        for(int i=0; i<N; i++) arr[i] = sc.nextInt();
        Arrays.sort(arr);
        System.out.println(solution(N,M,arr));
    }
    public static int solution(int N,int M, int [] arr) {
        int answer = -1;
        int lt = 0; int rt = N-1;
        while(lt<=rt){
            int mid = (lt+rt)/2;
            if(arr[mid]>M){
                rt = mid-1;
            }else if(arr[mid]<M){
               lt = mid+1;
            }else{
                answer = mid+1;
                break;
            }
        }
        return answer;
    }
}
