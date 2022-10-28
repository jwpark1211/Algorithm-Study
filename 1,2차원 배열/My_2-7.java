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
        System.out.println(solution(n,nArray));
    }

    public static int solution(int n,int[] nArray) {
        int answer = nArray[0];
        for(int i=1;i<nArray.length;i++){
            if(nArray[i-1] !=0 && nArray[i] != 0)
                nArray[i] = nArray[i-1]+1;
            answer += nArray[i];
        }
        return answer;
    }
}
