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
        int sum = 0;
        for(int i=0; i<N; i++) sum += arr[i];
        int answer = sum/M;

        while(true){
            ArrayList<Integer> arrayList = new ArrayList<>();
            int res=0;
            for(int i=0; i<N; i++){
                res += arr[i];
                if(res>answer){
                    res-=arr[i--];
                    arrayList.add(res);
                    res = 0;
                }else if(i==N-1){
                    arrayList.add(res);
                }
            }
            if(arrayList.size()==M)
                break;
            else
                answer ++;
        }
        return answer;
    }
}

