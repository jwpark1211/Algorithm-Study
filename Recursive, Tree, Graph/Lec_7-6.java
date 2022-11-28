public class Main {
   static  int N;
   static int [] ch;
    public void DFS(int L){
       if(L == N+1) {
           String tmp = "";
           for (int i = 1; i <= N; i++) {
               if(ch[i]==1) tmp += (i+" ");
           }
           if(tmp.length()>0) System.out.println(tmp);
       }else{
           ch[L] = 1;
           DFS(L+1);
           ch[L] = 0;
           DFS(L+1);
       }
    }
    public static void main(String[] args) {
        Main T = new Main();
        N = 3;
        ch = new int[N+1];
        T.DFS(1);
    }
}