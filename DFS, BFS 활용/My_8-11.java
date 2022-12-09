import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    static int n,m,answer = Integer.MAX_VALUE;
    static int[][] arr = new int[8][8];
    static int[][] visited = new int[8][8];

    public void BFS(int L,int x, int y){
        if(L>answer) return;
        if(x == 7 && y== 7) {
            answer = Math.min(answer,L);
        }
        else{
            if(x!=1 &&visited[x-1][y]==0 && arr[x-1][y]==0) {
                visited[x-1][y] = 1;
                BFS(L+1,x-1,y);
                visited[x-1][y] = 0;
            }
            if(y!=1 &&visited[x][y-1]==0 && arr[x][y-1]==0) {
                visited[x][y-1] = 1;
                BFS(L+1,x,y-1);
                visited[x][y-1] = 0;
            }
            if(x!=7 && visited[x+1][y]==0 && arr[x+1][y]==0) {
                visited[x+1][y] = 1;
                BFS(L+1,x+1,y);
                visited[x+1][y] = 0;
            }
            if(y!=7 && visited[x][y+1]==0 && arr[x][y+1]==0) {
                visited[x][y+1] = 1;
                BFS(L+1,x,y+1);
                visited[x][y+1] = 0;
            }
        }
    }
    public static void main(String[] args) {
        Main T = new Main();
        Scanner sc = new Scanner(System.in);

        for(int i=1; i<=7; i++)
            for(int j=1; j<=7; j++)
                arr[i][j] = sc.nextInt();

        visited[1][1] = 1;
        T.BFS(0,1,1);

        if(answer == Integer.MAX_VALUE) System.out.println(-1);
        else System.out.println(answer);
    }
}