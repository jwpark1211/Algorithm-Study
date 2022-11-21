 import java.util.*;

    public class Main {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            int N = sc.nextInt();
            int K = sc.nextInt();
            System.out.println(solution(N,K));
        }

        public static int solution(int N, int K) {
            int answer = 0;

            Queue<Integer> queue = new LinkedList<>();
            for(int i=1; i<N; i++) queue.offer(i);

            while(queue.size()!=1){
                for(int i=1; i<=K; i++) if(i==K) queue.poll();
            }

            answer = queue.poll();
            return answer;
        }
    }


