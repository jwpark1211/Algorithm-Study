import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      int N = sc.nextInt();
      solution(N);
    }

    public static void solution(int N){
        int a=1, b=1,c;
        System.out.print(a+" "+b+" ");
        for(int i=2;i<N;i++){
            c = a + b;
            System.out.print(c + " ");
            a = b;
            b = c;
        }
    }
}
