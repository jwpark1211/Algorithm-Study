import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      int n = sc.nextInt(); //학생 수
      int m = sc.nextInt(); //시험 횟수
      int arr [][]  = new int[m][n];
      for(int i=0;i<m;i++)
          for(int j=0; j<n; j++)
              arr[i][j] = sc.nextInt();
      System.out.println(solution(n,m,arr));
    }

    public static int solution(int n,int m,int[][] arr) {
        int answer = 0;
        int resArr[][] = new int[n][m];

        for(int i=0; i<m; i++){
            for(int j=0; j<n;j++){
                resArr[arr[i][j]-1][i] = j;
            }
        }

        for(int i=0; i<n;i++){
            for(int j=i+1;j<n;j++){
                boolean isSatisfied1 = true;
                boolean isSatisfied2 = true;
                for(int k=0;k<m;k++){
                    if(resArr[i][k]<resArr[j][k])
                        isSatisfied1 = false;
                    if(resArr[i][k]>resArr[j][k])
                        isSatisfied2 = false;
                }
                if(isSatisfied1==true || isSatisfied2==true)
                    answer++;
            }
        }
        return answer;
    }
}
