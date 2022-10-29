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
        List<Integer> sumArr = new ArrayList<>();

        // 행, 열 합 구하기
        for(int i=0;i<n;i++){
            int rowSum = 0, colSum = 0;
            for(int j=0;j<n;j++){
                rowSum += arr[i][j];
                colSum += arr[j][i];
            }
            sumArr.add(rowSum);
            sumArr.add(colSum);
        }

        //대각선 1,2
        int diagSum1 = 0, diagSum2 = 0;
        for(int i=0;i<n;i++){
            diagSum1 += arr[i][i];
            diagSum2 += arr[n-1-i][i];
        }
        sumArr.add(diagSum1);
        sumArr.add(diagSum2);

        int max = -1;
        for(int x : sumArr){
            if(max<x)
                max = x;
        }

        return max;
    }
}
