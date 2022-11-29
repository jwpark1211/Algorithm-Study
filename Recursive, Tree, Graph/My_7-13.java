import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    static int N,M,answer = 0;
    static ArrayList<ArrayList<Integer>> graph;
    static int visited[];
    public void DFS(int S){
       if(S == N) answer ++;
       else{
           for(int x : graph.get(S))
               if(visited[x] == 0){
                   visited[x] = 1;
                   DFS(x);
                   visited[x] = 0;
               }
       }
    }
    public static void main(String[] args) {
        Main T = new Main();
        Scanner sc = new Scanner(System.in);
        N = sc.nextInt();
        M = sc.nextInt();
        graph = new ArrayList<>();
        for(int i=0; i<N+1; i++){
            graph.add(new ArrayList<Integer>());
        }
        visited = new int[N+1];
        for(int i=0; i<M; i++){
            int a = sc.nextInt();
            int b = sc.nextInt();
            graph.get(a).add(b);
        }
        visited[1] = 1;
        T.DFS(1);
        System.out.println(answer);
    }
}