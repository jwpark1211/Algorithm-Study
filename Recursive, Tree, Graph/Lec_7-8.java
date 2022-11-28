    import java.util.LinkedList;
    import java.util.Queue;
    import java.util.Scanner;

    public class Main {
        public int BFS(int S, int E){
            int answer = 0;
            Queue<Integer> q = new LinkedList<>();
            int dis[] = {1,-1,5};
            boolean arr[] = new boolean[10001];
            arr[S] = true;
            q.offer(S);
            int L = 0;
            while(!q.isEmpty()){
                int len = q.size();
                for(int i=0; i<len; i++) {
                    int cur = q.poll();
                    if(cur == E) answer = L;
                    for(int j=0; j<3; j++){
                        int nx = cur + dis[j];
                        if(nx>=1 && nx<=10000 && arr[nx] == false){
                            arr[nx] = true;
                            q.offer(nx);
                        }
                    }
                }
                L++;
            }
            return answer;
        }
        public static void main(String[] args) {
            Main T = new Main();
            Scanner sc = new Scanner(System.in);
            int S = sc.nextInt();
            int E = sc.nextInt();
            System.out.println(T.BFS(S,E));
        }
    }