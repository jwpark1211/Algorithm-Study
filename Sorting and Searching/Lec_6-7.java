import java.util.*;

class Point implements Comparable<Point>{
    public int x,y;

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    @Override
    public int compareTo(Point o) {
        if(this.x == o.x)
            return this.y-o.y; //오름차순 정렬(작은게 앞)
        else
            return this.x-o.x;
    }
}
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        ArrayList<Point> arr = new ArrayList<>();
        for(int i=0; i<N; i++) arr.add(new Point(sc.nextInt(),sc.nextInt()));
        Collections.sort(arr);
        for(Point x : arr) System.out.println(x.x+" "+x.y);
    }
    public static void solution(int N, ArrayList<Point>arr) {

    }
}
