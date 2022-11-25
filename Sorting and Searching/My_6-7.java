import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int xy[][] = new int[N][2];
        for(int i=0; i<N; i++){
            xy[i][0] = sc.nextInt();
            xy[i][1] = sc.nextInt();
        }
        solution(N,xy);
    }
    public static void solution(int N,int xy[][]) {
        Arrays.sort(xy, (o1,o2)->{
            if(o1[0] == o2[0])
                return Integer.compare(o1[1],o2[1]);
            else
                return Integer.compare(o1[0],o2[0]);
        });

        for(int i=0; i<N; i++){
            System.out.println(xy[i][0]+" "+xy[i][1]);
        }
    }
}

