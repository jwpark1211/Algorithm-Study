import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      int N = sc.nextInt();
      solution(N);
    }

    public static void solution(int N){
        int [] arr = new int[N];
        arr[0] = 1;
        arr[1] = 1;

        for(int i=2;i<N;i++)
            arr[i] = arr[i-1]+ arr[i-2];

        for(int x : arr){
            System.out.print(x + " ");
        }
    }
}
