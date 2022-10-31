import java.util.*;

public class Main {
    public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      int n = sc.nextInt(); //학생 수
      int arr1[] = new int[n];
      for(int i=0; i<n; i++)
         arr1[i] = sc.nextInt();
      int m = sc.nextInt();
      int arr2[] = new int[m];
      for(int i=0; i<m; i++)
          arr2[i] = sc.nextInt();
     solution(n,arr1,m,arr2);
    }

    public static void solution(int n, int[] arr1,
                                int m, int[] arr2) {
        ArrayList<Integer> answer = new ArrayList<>();
        int p1 = 0, p2 = 1;
        while(true) {
            if (arr1[p1]<=arr1[p2]){
                p1 ++; p2++;
            }else if(arr1[p1]>arr1[p2]){
                int temp = arr1[p1];
                arr1[p1] = arr1[p2];
                arr1[p2] = temp;
                if(p1 !=0){
                    p1--; p2--;
                }
            }
            if(p1 == n-2 && p2 == n-1 && arr1[p1]<=arr1[p2])
                break;
        }

        p1 = 0; p2 = 1;
        while(true) {
            if (arr2[p1]<=arr2[p2]){
                p1 ++; p2++;
            }else if(arr2[p1]>arr2[p2]){
                int temp = arr2[p1];
                arr2[p1] = arr2[p2];
                arr2[p2] = temp;
                if(p1 !=0){
                    p1--; p2--;
                }
            }
            if(p1 == m-2 && p2 == m-1 && arr2[p1]<=arr2[p2])
                break;
        }

        p1 = 0; p2 = 0;
        while(p1<n && p2<m){
            if(arr1[p1] == arr2[p2]){
                answer.add(arr2[p2]);
                p1++; p2++;
            }else if(arr1[p1]<arr2[p2]) p1++;
            else if(arr1[p1]>arr2[p2]) p2++;
        }

        for(int x: answer)
            System.out.print(x + " ");
    }
}
