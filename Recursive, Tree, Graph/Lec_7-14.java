import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Main {
    static int N,M;
    static int[] ch, dis;
    static ArrayList<ArrayList<Integer>> graph;
    public void BFS(int S){
        Queue<Integer> q = new LinkedList<>();
        ch[S] = 1;
        dis[S] = 0;
        q.offer(S);
        while(!q.isEmpty()){
            int cv = q.poll();
            for(int nv : graph.get(cv)){
                if(ch[nv]==0){
                    ch[nv] = 1;
                    q.offer(nv);
                    dis[nv] = dis[cv]+1;
                }
            }
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
        ch = new int[N+1];
        dis = new int[N+1];
        for(int i=0; i<M; i++){
            int a = sc.nextInt();
            int b = sc.nextInt();
            graph.get(a).add(b);
        }
        T.BFS(1);
        for(int i=2; i<=N; i++){
            System.out.println(i + " : " + dis[i]);
        }
    }
}