    import java.util.*;

    public class Main {
        public static void main(String[] args) {
          Scanner sc = new Scanner(System.in);
          int N = sc.nextInt();
          System.out.println(solution(N));
        }

        public static int solution(int N) {
            int answer = 0, cnt=1;
            N--;
            while(N>0){
                cnt++;
                N-=cnt;
                if(N%cnt==0) answer++;
            }
            return answer;
        }
    }
