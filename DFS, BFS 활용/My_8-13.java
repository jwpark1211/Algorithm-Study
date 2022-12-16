import java.util.*;
class Main{
    static int N, answer = 0;
    static int [] mx = {-1,0,1,0,-1,1,1,-1};
    static int [] my = {0,1,0,-1,-1,1,-1,1};
    static int[][] board;
    public static void DFS(int x, int y){
        for(int i=0; i<8; i++){
            int nx = x + mx[i];
            int ny = y + my[i];
            if(nx>=0 && nx<N && ny>=0 && ny<N && board[nx][ny] == 1) {
                board[nx][ny] = 0;
                DFS(nx, ny);
            }
        }
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        N = sc.nextInt();
        board = new int[N][N];
        for(int i=0; i<N; i++)
            for(int j=0; j<N; j++)
                board[i][j] = sc.nextInt();
        for(int i=0; i<N; i++){
            for(int j=0; j<N; j++){
                if(board[i][j] == 1){
                    answer ++;
                    board[i][j] = 0;
                    DFS(i,j);
                }
            }
        }
        System.out.println(answer);
    }
}