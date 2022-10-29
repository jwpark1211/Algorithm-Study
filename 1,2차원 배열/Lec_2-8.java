import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      int n = sc.nextInt();
      int nArray []  = new int[n];
      for(int i=0;i<n;i++){
          nArray[i] = sc.nextInt();
      }
      for(int x : solution(n,nArray)) System.out.print(x + " ");
    }

    public static int[] solution(int n,int[] arr) {
        int [] answer = new int[n];
        for(int i=0;i<n;i++){
            int cnt = 1;
            for(int j=0;j<n;j++)
                if(arr[j]>arr[i]) cnt++;
            answer[i] = cnt;
        }
        return answer;
    }
}
