import java.util.Scanner;

public class Main {
    static int N,M,answer = 0;
    static int[][] graph;
    static int visited[];
    public void DFS(int S){
       if(S == N) answer ++;
       else{
           for(int i=1; i<=N; i++)
               if(graph[S][i] == 1 && visited[i] == 0){
                   visited[i] = 1;
                   DFS(i);
                   visited[i] = 0;
               }
       }
    }
    public static void main(String[] args) {
        Main T = new Main();
        Scanner sc = new Scanner(System.in);
        N = sc.nextInt();
        M = sc.nextInt();
        graph = new int[N+1][N+1];
        visited = new int[N+1];
        for(int i=0; i<M; i++){
            int a = sc.nextInt();
            int b = sc.nextInt();
            graph[a][b] = 1;
        }
        visited[1] = 1;
        T.DFS(1);
        System.out.println(answer);
    }
}