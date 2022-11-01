    import java.util.*;

    public class Main {
        public static void main(String[] args) {
          Scanner sc = new Scanner(System.in);
          int N = sc.nextInt();
          int k = sc.nextInt();
          int arr[] = new int[N];
          for(int i=0; i<N; i++)
              arr[i] = sc.nextInt();
          System.out.println(solution(N,k,arr));
        }

        public static int solution(int N,int k, int[] arr) {
            int answer = 0, zero=0,lt =0;
            for(int rt=0;rt<N;rt++){
                if(arr[rt]==0) zero++;
                while(zero>k){
                    if(arr[lt]==0) zero--;
                    lt++;
                }
                answer = Math.max(answer,rt-lt+1);
            }
            return answer;
        }
    }
