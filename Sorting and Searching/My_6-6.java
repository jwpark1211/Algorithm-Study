import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int arr[] = new int[N];
        for(int i=0; i<N; i++) arr[i] = sc.nextInt();
        solution(N,arr);
    }
    public static void solution(int N,int arr[]) {
        ArrayList<Integer> answer = new ArrayList<>();
        ArrayList<Integer> compare = new ArrayList<>();
        for(int x : arr) compare.add(x);
        Collections.sort(compare);
        for(int i=0; i<N; i++){
           if(compare.get(i)!=arr[i])
               answer.add(i+1);
       }

        for(int x : answer) System.out.print(x+" ");
    }
}

