import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      int len = sc.nextInt();
      int arr [] = new int[len];
      for(int i=0;i<len;i++){
          arr[i] = sc.nextInt();
      }
      solution(len,arr);
    }

    //2-1은 내가 푼 거랑 해설이랑 똑같앵
    public static void solution(int len, int [] arr){
        List<Integer> answer = new ArrayList<>();
        answer.add(arr[0]);

        for(int i=1; i<=len-1;i++){
            if(arr[i]>arr[i-1])
                answer.add(arr[i]);
        }

        for(int x : answer){
            System.out.print(x + " ");
        }
    }
}
