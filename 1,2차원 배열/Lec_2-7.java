import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      int n = sc.nextInt();
      int nArray []  = new int[n];
      for(int i=0;i<n;i++){
          nArray[i] = sc.nextInt();
      }
        System.out.println(solution(n,nArray));
    }

    public static int solution(int n,int[] nArray) {
        int answer = 0, cnt = 0;
        for(int i=0;i<n;i++){
            if(nArray[i] == 1){
                cnt ++;
                answer +=cnt;
            }
            else cnt =0;
        }
        return answer;
    }
}
