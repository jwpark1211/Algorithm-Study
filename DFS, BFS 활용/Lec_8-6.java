import java.util.Scanner;

public class Main {
    static int n,m;
    static int[] arr,pm,ch ;

    public void DFS(int L){
        if(L == m){
            for(int x : pm) System.out.print(x + " ");
            System.out.println();
        }else{
            for(int i=0; i<n; i++){
                if(ch[i]==0){
                    ch[i] = 1;
                    pm[L] = arr[i];
                    DFS(L+1);
                    ch[i] = 0;
                }
            }
        }
    }
    public static void main(String[] args) {
        Main T = new Main();
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        arr = new int[n];
        ch = new int[n];
        m = sc.nextInt();
        pm = new int[m];
        for(int i=0;i<n;i++) arr[i] = sc.nextInt();
        T.DFS(0);
    }
}