    import java.util.*;

    public class Main {
        public static void main(String[] args) {
          Scanner sc = new Scanner(System.in);
          int n = sc.nextInt(); //총 일수
          int k = sc.nextInt(); //구해야 하는 일수
          int arr [] = new int[n];
          for(int i=0; i<n;i++)
              arr[i] = sc.nextInt();
            System.out.println(solution(n,k,arr));
        }

        public static int solution(int n, int k, int arr[]) {
            int answer = 0, sum = 0;
            for(int i=0; i<k;i++)
                sum += arr[i];
            answer = sum;
            for(int i =k;i<n;i++) {
                sum += (arr[i] - arr[i - k]);
                answer = Math.max(answer,sum);
            }
            return answer;
        }
    }
