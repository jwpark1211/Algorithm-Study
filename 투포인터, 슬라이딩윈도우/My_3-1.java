import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      int n = sc.nextInt(); //학생 수
      int arr1 [] = new int[n];
      for(int i=0; i<n; i++)
          arr1[i] = sc.nextInt();
      int m = sc.nextInt();
      int arr2 [] = new int[m];
      for(int i=0; i<m; i++)
          arr2[i] = sc.nextInt();
     solution(n,arr1,m,arr2);
    }

    public static void solution(int n, int[] arr1, int m, int[] arr2) {
        int answer[] = new int[n+m];
        int idx1 = 0, idx2 = 0, idxA = 0;

        while(idx1<n && idx2<m){
            if(arr1[idx1]>=arr2[idx2]) {
                answer[idxA] = arr2[idx2];
                idx2 ++;
            }else{
                answer[idxA] = arr1[idx1];
                idx1 ++;
            }
            idxA ++;
        }

        for(int i=idx1; i<n;i++){
            answer[idxA] = arr1[i];
            idxA++;
        }
        for(int i=idx2; i<m;i++){
            answer[idxA] = arr2[i];
            idxA++;
        }

        for(int x : answer)
            System.out.print(x + " ");
    }
}
