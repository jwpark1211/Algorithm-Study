import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();

        solution(N);
    }
    public static void solution(int N) {
       if(N==0) return;
       else{
           solution(N-1);
           System.out.print(N + " ");
       }
    }
}
