import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      int num = sc.nextInt();
      String stringList[] = new String[num];
      for(int i=0;i<num;i++){
          stringList[i] = sc.next();
      }
      for(String s : solution(num,stringList))
          System.out.println(s);
    }

    public static ArrayList<String> solution(int num,String str[]){
        ArrayList<String> answer = new ArrayList<>();
        for(String x : str){
            String tmp = new StringBuilder(x).reverse().toString();
            answer.add(tmp);
        }
        return answer;
    }
}
