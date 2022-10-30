import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      int n = sc.nextInt();
      int arr [][]  = new int[n][5];
      for(int i=0;i<n;i++)
          for(int j=0; j<5; j++)
              arr[i][j] = sc.nextInt();
      System.out.println(solution(n,arr));
    }

    public static int solution(int n,int[][] arr) {
        int stdArr[] = new int[n];
        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                if(arr[i][0]==arr[j][0] || arr[i][1]==arr[j][1] || arr[i][2]==arr[j][2]
            ||arr[i][3]==arr[j][3] ||arr[i][4]==arr[j][4] ){
                    stdArr[i] ++;
                    stdArr[j] ++;
                }
            }
        }
        int max = Integer.MIN_VALUE, maxIdx = -1;
        for(int i=0;i<n;i++){
            if(stdArr[i]>max){
                max = stdArr[i];
                maxIdx = i+1;
            }
        }
        return maxIdx;
    }
}
