import java.util.Scanner;

public class Main {
    static int N;
    static int[] ch;
    static int[] array;
    static String answer = "NO";

    public String DFS(int S){
        if(S == N+1){
            int sum1 = 0, sum2 = 0;
            for(int i=1; i<=N; i++){
                if(ch[i]==1) sum1+=array[i];
                else if(ch[i]==0) sum2+=array[i];
            }
            if(sum1 == sum2)
               answer = "YES";
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
        ch = new int[N+1];
        array = new int[N+1];
        for(int i=1; i<=N; i++) array[i] = sc.nextInt();
        System.out.println(T.DFS(1));
    }
}