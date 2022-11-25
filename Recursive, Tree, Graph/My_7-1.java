import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();

       solution(1,N);
    }
    public static void solution(int t,int N) {
        if(t<=N){
            System.out.print(t + " ");
            solution(t+1,N);
        }
    }
}
