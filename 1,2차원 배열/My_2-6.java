import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      int n = sc.nextInt();
      String nArray []  = new String[n];
      for(int i=0;i<n;i++){
          nArray[i] = sc.next();
      }
      solution(n,nArray);
    }

    public static void solution(int n,String[] nArray) {
        List<Integer> answer = new ArrayList<>();
        for(String x : nArray){
            boolean isPrime = true;
            int num = Integer.parseInt(new StringBuilder(x).reverse().toString());
            for(int i=2;i<=Math.sqrt(num);i++){
                if(num%i==0){
                    isPrime = false;
                    break;
                }
            }
            if(isPrime == true && num != 1)
                answer.add(num);
        }
        for(int x : answer)
            System.out.print(x+" ");
    }
}
