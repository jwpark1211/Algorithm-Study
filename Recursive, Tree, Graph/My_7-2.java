import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        solution(N);
    }
    public static void solution(int N) {
        if(N>0){
            int res = N/2;
            int rem = N%2;
            solution(res);
            System.out.print(rem);
        }else return;
    }

}

