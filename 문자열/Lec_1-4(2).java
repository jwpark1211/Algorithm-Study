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
            char array[]= x.toCharArray();
            int lt = 0, rt = x.length() -1;
            while(lt<rt){
                char tmp = array[lt];
                array[lt] = array[rt];
                array[rt] = tmp;
                lt ++; rt --;
            }
            answer.add(String.valueOf(array));
        }
        return answer;
    }
}
