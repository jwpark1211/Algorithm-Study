import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      int n = sc.nextInt();
      int nArray []  = new int[n];
      for(int i=0;i<n;i++){
          nArray[i] = sc.nextInt();
      }
      solution(n,nArray);
    }

    public static void solution(int n,int[] nArray) {
        List<Integer> answer = new ArrayList<>();
        for(int i=0;i<n;i++){
            int tmp = nArray[i];
            int res = 0;
            while(tmp>0){
                int t = tmp%10;
                res = res*10+t;
                tmp = tmp/10;
            }
            if(isPrime(res)) answer.add(res);
        }
        for(int x : answer)
            System.out.print(x+" ");
    }
    public static boolean isPrime(int num){
        if(num ==1) return false;
        for(int i=2;i<num;i++){
            if(num%i==0) return false;
        }
        return true;
    }
}
