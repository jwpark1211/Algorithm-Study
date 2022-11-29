import java.util.Scanner;

public class Main {
    static int answer = 0;
    static int[][] arr = new int[6][6];
    static int visited[] = new int[6];
    public static void DFS(int S, int N){
        visited[S] = 1;
        if(S == N) answer ++;
        for(int i=1; i<6; i++){
            if(arr[S][i]==1 && visited[i]==0)
                DFS(i, N);
        }
        visited[S] = 0;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();
        for(int i=0; i<M; i++) arr[sc.nextInt()][sc.nextInt()] = 1;
        DFS(1, N);
        System.out.println(answer);
    }
}