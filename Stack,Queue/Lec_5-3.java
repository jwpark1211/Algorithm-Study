    import java.util.*;

    public class Main {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            int N = sc.nextInt();
            int arr[][] = new int[N][N];
            for(int i=0;i<N;i++)
                for(int j=0;j<N;j++)
                    arr[i][j] = sc.nextInt();
            int M = sc.nextInt();
            int moves[] = new int[M];
            for(int i=0; i<M; i++)
                moves[i] = sc.nextInt();
            System.out.println(solution(N,arr,M,moves));
        }

        public static int solution(int N, int arr[][], int M, int moves[]) {
            int answer = 0;
            Stack<Integer> stack = new Stack<>();
            for(int move : moves){
                for(int i=0;i<N; i++) {
                    if (arr[i][move - 1] != 0) {
                        int tmp = arr[i][move - 1];
                        arr[i][move - 1] = 0;
                        if (!stack.isEmpty() && tmp == stack.peek()) {
                            answer += 2;
                            stack.pop();
                        } else stack.push(tmp);
                        break;
                    }
                }
            }
            return answer;
        }
    }


