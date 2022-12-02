import java.util.Scanner;

public class Main {
    static int C,N;
    static int[] ch;
    static int[] array;
    static int answer = 0;

    public int DFS(int S){
        if(S == N+1){
            int sum = 0;
            for(int i=1; i<=N; i++){
                if(ch[i]==1) sum+=array[i];
            }
            if(sum>answer && sum<=C)
                answer = sum;
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
        C = sc.nextInt();
        N = sc.nextInt();
        ch = new int[N+1];
        array = new int[N+1];
        for(int i=1; i<=N; i++) array[i] = sc.nextInt();
        System.out.println(T.DFS(1));
    }
}