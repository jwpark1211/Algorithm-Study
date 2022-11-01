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
            int answer = 0, sum =0, lt =0, zero=0;
            for(int rt =0; rt<N; rt++){
                if(zero>=k && arr[rt]==0){
                    if(sum>answer)
                        answer = sum;
                    zero = 0; sum = 0; lt++; rt=lt;
                }else if(arr[rt]==1){
                    sum ++;
                }else if(arr[rt]==0){
                    sum ++; zero++;
                }
            }
            return answer;
        }
    }
