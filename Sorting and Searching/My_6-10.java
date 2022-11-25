import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int C = sc.nextInt();
        int arr[] = new int[N];
        for(int i=0; i<N; i++) arr[i] = sc.nextInt();
        System.out.println(solution(N,C,arr));
    }
    public static int solution(int N,int C, int [] arr) {
        int answer = 0;
        Arrays.sort(arr);

        int lt = 1; int rt = arr[N-1];
        while(lt<=rt){
            int mid = (lt+rt)/2;
            if(count(arr,mid)>=C){
                answer = mid;
                lt = mid +1;
            }else {
                rt = mid -1;
            }
        }

        return answer;
    }
    public static int count(int arr[] , int MID){
        int count = 1; int std = arr[0];
        for(int i=0; i<arr.length;i++){
            if(arr[i]-std>=MID){
                count ++;
                std = arr[i];
            }
        }
        return count;
    }
}

