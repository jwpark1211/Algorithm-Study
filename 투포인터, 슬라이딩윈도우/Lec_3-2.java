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
        Arrays.sort(arr1);
        Arrays.sort(arr2);

        int p1 = 0, p2 = 0;
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
