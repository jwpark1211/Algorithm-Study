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
    static int N,M;
    static Queue<Point> q = new LinkedList<>();
    public static void BFS(){
        while(!q.isEmpty()){
            Point point = q.poll();
            for(int i=0; i<4; i++){
                int nx = point.x+dx[i];
                int ny = point.y+dy[i];
                if(nx>=0 && nx<N && ny>=0 && ny<M && board[nx][ny]==0){
                    board[nx][ny] = 1;
                    q.offer(new Point(nx,ny));
                    dis[nx][ny] = dis[point.x][point.y]+1;
                }
            }
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        M = sc.nextInt();
        N = sc.nextInt();
        board = new int[N][M];
        dis = new int[N][M];
        for(int i=0; i<N; i++){
            for(int j=0; j<M; j++){
                board[i][j] = sc.nextInt();
                if(board[i][j]==1) q.offer(new Point(i,j));
            }
        }
        BFS();
        boolean flag = true;
        int answer = Integer.MIN_VALUE;
        for(int i=0; i<N; i++){
            for(int j=0; j<M; j++){
                if(board[i][j]==0) flag = false;
            }
        }
        if(flag){
            for(int i=0; i<N; i++){
                for(int j=0; j<M; j++){
                    answer = Math.max(answer,dis[i][j]);
                }
            }
            System.out.println(answer);
        } else System.out.println(-1);
    }
}