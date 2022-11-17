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
                int idx = 0; move-=1;
                while(idx<N){
                    if(arr[idx][move]!=0){
                        int value = arr[idx][move];
                        arr[idx][move] = 0;
                        if(stack.isEmpty()) {
                            stack.push(value);
                        }
                        else if(stack.peek()==value){
                            stack.pop();
                            answer +=2;
                        }else {
                            stack.push(value);
                        }
                        break;
                    }
                    idx++;
                }
            }
            return answer;
        }
    }


