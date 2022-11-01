    import java.util.*;

    public class Main {
        public static void main(String[] args) {
          Scanner sc = new Scanner(System.in);
          int N = sc.nextInt();
          System.out.println(solution(N));
        }

        public static int solution(int N) {
            int answer = 0, sum =0, lt =1;
            for(int rt =1; rt<N; rt++){
                sum += rt;
                if(sum == N) answer++;
                while(sum>=N) {
                    sum -= lt++;
                    if(sum == N) answer++;
                }
            }
            return answer;
        }
    }
