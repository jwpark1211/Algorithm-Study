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
        char temp;
        for(String x : str){
            int len = x.length();
            char array[]= x.toCharArray();
            for(int i=0; i<len/2;i++){
                temp = array[i];
                array[i] = array[len-1-i];
                array[len-1-i] = temp;
            }
            answer.add(String.valueOf(array));
        }
        return answer;
    }
}
