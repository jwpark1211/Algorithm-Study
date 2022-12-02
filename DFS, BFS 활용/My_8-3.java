import java.util.Scanner;

public class Main {
    static int N,M;
    static int[] ch;
    static int[] scoreArray;
    static int[] timeArray;
    static int answer = 0;

    public int DFS(int S){
        if(S == N+1){
            int time = 0, score = 0;
            for(int i=1; i<=N; i++){
                if(ch[i]==1) {
                    time += timeArray[i];
                    score += scoreArray[i];
                }
            }
            if(score>answer && time<=M)
                answer = score;
        }else{
            ch[S] = 1;
            DFS(S+1);
            ch[S] = 0;
            DFS(S+1);
        }
        return answer;
    }
    public static void main(String[] args) {
        Main T = new Main();
        Scanner sc = new Scanner(System.in);
        N = sc.nextInt();
        M = sc.nextInt();
        ch = new int[N+1];
        scoreArray = new int[N+1];
        timeArray = new int[N+1];
        for(int i=1; i<=N; i++) {
            scoreArray[i] = sc.nextInt();
            timeArray[i] = sc.nextInt();
        }
        System.out.println(T.DFS(1));
    }
}