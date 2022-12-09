import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    static int n,m,answer = 0;
    static int[][] arr = new int[8][8];
    static int[][] visited = new int[8][8];

    public void DFS(int x, int y){
        if(x == 7 && y== 7) answer +=1;
        else{
            if(x!=1 &&visited[x-1][y]==0 && arr[x-1][y]==0) {
                visited[x-1][y] = 1;
                DFS(x-1,y);
                visited[x-1][y] = 0;
            }
            if(y!=1 &&visited[x][y-1]==0 && arr[x][y-1]==0) {
                visited[x][y-1] = 1;
                DFS(x,y-1);
                visited[x][y-1] = 0;
            }
            if(x!=7 && visited[x+1][y]==0 && arr[x+1][y]==0) {
                visited[x+1][y] = 1;
                DFS(x+1,y);
                visited[x+1][y] = 0;
            }
            if(y!=7 && visited[x][y+1]==0 && arr[x][y+1]==0) {
                visited[x][y+1] = 1;
                DFS(x,y+1);
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
        T.DFS(1,1);
        System.out.println(answer);
    }
}