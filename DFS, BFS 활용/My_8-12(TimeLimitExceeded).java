import java.util.ArrayList;
import java.util.Scanner;

class Point{
    int x; int y;
    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }
}
public class Main {
    static int m, n, answer = Integer.MAX_VALUE;
    static int count0 = 0;
    static int[][] arr;
    static ArrayList<Point> pointArray = new ArrayList<>();
    public static void BFS(int L){
        if(count0 == 0)
            answer = L;
        else{
            for(int i = pointArray.size() - 1; i >= 0; i--){
                Point p = pointArray.get(i);
                if(p.x != n-1 && arr[p.x+1][p.y] == 0) {
                    arr[p.x + 1][p.y] = 1;
                    pointArray.add(new Point(p.x+1,p.y));
                    count0 --;
                }
                if(p.x != 0 && arr[p.x-1][p.y] == 0) {
                    arr[p.x - 1][p.y] = 1;
                    pointArray.add(new Point(p.x-1,p.y));
                    count0 --;
                }
                if(p.y != m-1 && arr[p.x][p.y+1] == 0) {
                    arr[p.x][p.y + 1] = 1;
                    pointArray.add(new Point(p.x,p.y+1));
                    count0 --;
                }
                if(p.y != 0 && arr[p.x][p.y-1] == 0) {
                    arr[p.x][p.y - 1] = 1;
                    pointArray.add(new Point(p.x,p.y-1));
                    count0 --;
                }
                pointArray.remove(p);
            }
            BFS(L + 1);
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        m = sc.nextInt();
        n = sc.nextInt();
        arr = new int[n][m];
        for (int i = 0; i < n; i++)
            for (int j = 0; j < m; j++) {
                arr[i][j] = sc.nextInt();
                if(arr[i][j] == 0) count0 ++;
            }
        if (count0 == 0)
            System.out.println(0);
        else {
            for(int i=0; i<n; i++){
                for(int j=0; j<m; j++){
                    if(arr[i][j] == 1)
                        pointArray.add(new Point(i,j));
                }
            }
            BFS(0);
            if (answer == Integer.MAX_VALUE) System.out.println(-1);
            else System.out.println(answer);
        }
    }
}