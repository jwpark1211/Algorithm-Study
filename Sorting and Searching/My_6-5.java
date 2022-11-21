import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int arr[] = new int[N];
        for(int i=0; i<N; i++) arr[i] = sc.nextInt();
        System.out.println( solution(N,arr));
    }
    public static String solution(int N,int arr[]) {
        Set<Integer> set = new TreeSet<>();
        for(int x: arr) set.add(x);
        if(set.size()<N) return "D";
        else return "U";
    }
}

