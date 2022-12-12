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
    static int N,M;
    static int [][] tomato, day;
    public static int BFS(){
        Queue<Point> q = new LinkedList<>();
        for(int i=0; i<N; i++)
            for(int j=0; j<M; j++)
                if(tomato[i][j] == 1)
                    q.offer(new Point(i,j));

        int rday = 0;
        while(!q.isEmpty()){
            int size = q.size();
            rday++;
            for(int k=0; k<size; k++){
                Point point = q.poll();
                if(point.x!=N-1 && tomato[point.x+1][point.y]==0){
                    tomato[point.x+1][point.y] = 1;
                    day[point.x+1][point.y] = rday;
                    q.offer(new Point(point.x+1,point.y));
                }
                if(point.y!=M-1 && tomato[point.x][point.y+1]==0){
                    tomato[point.x][point.y+1] = 1;
                    day[point.x][point.y+1] = rday;
                    q.offer(new Point(point.x,point.y+1));
                }
                if(point.x!=0 && tomato[point.x-1][point.y]==0){
                    tomato[point.x-1][point.y] = 1;
                    day[point.x-1][point.y] = rday;
                    q.offer(new Point(point.x-1,point.y));
                }
                if(point.y!=0 && tomato[point.x][point.y-1]==0){
                    tomato[point.x][point.y-1] = 1;
                    day[point.x][point.y-1] = rday;
                    q.offer(new Point(point.x,point.y-1));
                }
            }
        }

        boolean flag = true; int max = -1;
        for(int i=0; i<N; i++) {
            for (int j = 0; j < M; j++) {
                if(tomato[i][j] == 0)
                    return -1;
                if(day[i][j]>max)
                    max = day[i][j];
            }
        }

        return max;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        M = sc.nextInt();
        N = sc.nextInt();
        tomato = new int[N][M];
        day = new int[N][M];

        boolean isAllRipen = true;
        for(int i=0; i<N; i++){
            for(int j=0; j<M; j++){
                tomato[i][j] = sc.nextInt();
                if(tomato[i][j] == 0)
                    isAllRipen = false;
            }
        }
        if(isAllRipen == true) System.out.println(0);
        else System.out.println(BFS());
    }
}