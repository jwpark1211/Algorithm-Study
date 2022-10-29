import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      int n = sc.nextInt();
      int arr [][]  = new int[n][n];
      for(int i=0;i<n;i++){
          for(int j=0;j<n;j++){
              arr[i][j] = sc.nextInt();
          }
      }
        System.out.println(solution(n,arr));
    }

    public static int solution(int n,int[][] arr) {
        int answer = Integer.MIN_VALUE;

        int rowSum , colSum ;
        for(int i=0; i<n; i++){
            rowSum=colSum=0;
            for(int j=0;j<n;j++){
                rowSum += arr[i][j];
                colSum += arr[j][i];
            }
            answer = Math.max(answer,rowSum);
            answer = Math.max(answer,colSum);
        }

        int diag1Sum=0, diag2Sum =0;
        for(int i=0; i<n; i++){
            diag1Sum += arr[i][i];
            diag2Sum += arr[n-1-i][i];
        }
        answer = Math.max(answer,diag1Sum);
        answer = Math.max(answer,diag2Sum);

        return answer;
    }
}
