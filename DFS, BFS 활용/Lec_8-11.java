import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

class Point{
    int x;
    int y;
    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }
}

public class Main {
    static int[] dx = {-1,0,1,0};
    static int[] dy = {0,1,0,-1};
    static int[][] board, dis;
    static Queue<Point> q = new LinkedList<>();
    public static void BFS(int x, int y){
        q.offer(new Point(x,y));
        board[x][y] = 1;
        while(!q.isEmpty()){
            Point point = q.poll();
            for(int i=0; i<4; i++){
                int nx = point.x+dx[i];
                int ny = point.y+dy[i];
                if(nx>=1 && nx<8 && ny>=1 && ny<8 && board[nx][ny]==0){
                    board[nx][ny] = 1;
                    q.offer(new Point(nx,ny));
                    dis[nx][ny] = dis[point.x][point.y]+1;
                }
            }
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        board = new int[8][8];
        dis = new int[8][8];
        for(int i=1; i<=7; i++){
            for(int j=1; j<=7; j++){
                board[i][j] = sc.nextInt();
            }
        }
        BFS(1,1);
        if(dis[7][7] == 0) System.out.println(-1);
        else System.out.println(dis[7][7]);
    }
}