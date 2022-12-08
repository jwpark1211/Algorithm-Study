import java.util.Scanner;

public class Main {
    static int n,m;
    static int[] arr ;
    static int[] pm;
    public void DFS(int L,int B){
        if(L == m){
            for(int x : pm) System.out.print(x+" ");
            System.out.println();
        }else{
            for(int i=0; i<n; i++){
                if(B!=i) {
                    pm[L] = arr[i];
                    DFS(L + 1, i);
                }
            }
        }
    }
    public static void main(String[] args) {
        Main T = new Main();
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        arr = new int[n];
        m = sc.nextInt();
        pm = new int[m];
        for(int i=0;i<n;i++) arr[i] = sc.nextInt();
        T.DFS(0,-1);
    }
}