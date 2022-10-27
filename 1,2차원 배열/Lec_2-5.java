import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      int N = sc.nextInt();
        System.out.println(solution(N));
    }

    public static int solution(int N) {
        int answer = 0 ;
        int [] ch = new int[N+1];
        for(int i=2;i<N;i++){
            if(ch[i] == 0){
                answer ++;
                for(int j=i;j<=N;j=j+i){
                    ch[j] = 1;
                }
            }
        }
        return answer;
    }
}
