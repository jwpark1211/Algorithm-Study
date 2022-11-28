    import java.util.LinkedList;
    import java.util.Queue;
    import java.util.Scanner;

    public class Main {
        public int BFS(int S, int E){
            int answer = -1;
            Queue<Integer> q = new LinkedList<>();
            q.offer(S);
            int L = 0;
            while(answer == -1){
                int len = q.size();
                for(int i=0; i<len; i++) {
                    int cur = q.poll();
                    if(cur == E){
                        answer = L;
                    }
                    q.offer(cur+1);
                    q.offer(cur-1);
                    q.offer(cur+5);
                }
                L++;
            }
            return answer;
        }
        public static void main(String[] args) {
            Main main = new Main();
            Scanner sc = new Scanner(System.in);
            int S = sc.nextInt();
            int E = sc.nextInt();
            System.out.println(main.BFS(S,E));
        }
    }