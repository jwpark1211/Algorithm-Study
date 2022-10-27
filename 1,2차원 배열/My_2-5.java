import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      int N = sc.nextInt();
        System.out.println(solution(N));
    }

    /*중요하기 짚고 넘어가야 하는 문제일듯 ! 기존 2중 for문을 이용하면 Time Limit 걸리기 때문ㅔ
    에라토스테네스 체를 이용해야 한다고 함...*/
    public static int solution(int N) {
        int answer = 0 ;
        for(int i=2;i<N;i++) {
            boolean isPrime = true;
            for(int j=2;j<=Math.sqrt(i);j++) {
                if (i % j == 0) {
                    isPrime = false;
                    break;
                }
            }
            if(isPrime == true) answer ++;
        }
        return answer;
    }
}
