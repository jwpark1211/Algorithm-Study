import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Main {
    static int N,M;
    static int answer[];
    static ArrayList<ArrayList<Integer>> graph;
    public void BFS(int S){
        int L = 0;
        Queue<Integer> q = new LinkedList<>();
        q.offer(S);
        while(!q.isEmpty()){
            int len = q.size();
            for(int i=0; i<len; i++){
                int cur = q.poll();
                if(answer[cur]==0){
                    answer[cur] = L;
                    for(int x : graph.get(cur))
                        q.offer(x);
                }
            }
            L++;
        }
        for(int i=2; i<=N; i++){
            System.out.println(i + " : " + answer[i]);
        }
    }
    public static void main(String[] args) {
        Main T = new Main();
        Scanner sc = new Scanner(System.in);
        N = sc.nextInt();
        M = sc.nextInt();
        graph = new ArrayList<>();
        for(int i=0; i<=N; i++){
            graph.add(new ArrayList<Integer>());
        }
        answer = new int[N+1];
        for(int i=0; i<M; i++){
            int a = sc.nextInt();
            int b = sc.nextInt();
            graph.get(a).add(b);
        }
        T.BFS(1);
    }
}