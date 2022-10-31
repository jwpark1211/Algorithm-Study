    import java.util.*;

    public class Main {
        public static void main(String[] args) {
          Scanner sc = new Scanner(System.in);
          int N = sc.nextInt(); 
          int M = sc.nextInt(); 
          int arr [] = new int[N];
          for(int i=0; i<N;i++)
              arr[i] = sc.nextInt();
            System.out.println(solution(N,M,arr));
        }

        public static int solution(int N, int M, int arr[]) {
            int answer = 0, sum = arr[0];
            int p1 = 0, p2 = 1;
            while(true){
                if( p2 == N && sum < M)
                    break;
                if(sum == M){
                    answer++;
                    if(p2 == N)
                        break;
                    p1++; p2 = p1+1;
                    sum = arr[p1];
                }else if(sum < M){
                    sum += arr[p2++];
                }else{
                    sum -= arr[p1++];
                }
            }
            return answer;
        }
    }
