import java.util.*;

public class Main {
    public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      int m = sc.nextInt(); //총 일수
      int n = sc.nextInt(); //구해야 하는 일수
      int arr [] = new int[m];
      for(int i=0; i<m;i++)
          arr[i] = sc.nextInt();
        System.out.println(solution(m,n,arr));
    }

    //타임 아웃 걸림 ... 도대체 왜????????
    public static int solution(int m, int n, int arr[]) {
        int answer = 0;
        int p1 = 0, p2 = 1, sum = arr[0];
        while(p1+n-1<m){
            if(p2<=p1+n-1)
                sum += arr[p2++];
            else if(p2 > p1+n-1){
                if(sum>answer)
                    answer = sum;
                p1++; p2 = p1+1;
                sum = arr[p1];
            }
            System.out.println("p1 = " + p1);
        }
        return answer;
    }
}
