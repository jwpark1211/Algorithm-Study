import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        System.out.println(solution(N,1));
    }
    public static int solution(int N,int res) {
        if(N==0) return res;
        else{
            res  = res * N;
            return solution(N-1,res);
        }
    }
}

