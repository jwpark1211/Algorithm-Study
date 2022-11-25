import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        System.out.print(1+" "+1+" ");
        solution(N-2,1,1);
    }
    public static void solution(int N,int a, int b) {
        if(N==0) return;
        else {
            int tmp = a + b;
            a = b;
            b = tmp;
            System.out.print(tmp+ " ");
            solution(N-1,a,b);
        }
    }
}

