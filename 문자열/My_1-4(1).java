import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      int num = sc.nextInt();
      String stringList[] = new String[num];
      for(int i=0;i<num;i++){
          stringList[i] = sc.next();
      }
      stringList = solution(num, stringList);
      for(String s : stringList)
          System.out.println(s);
    }

    public static String[] solution(int num,String str[]){
        String string;
        StringBuilder builder;
        for(int i=0;i<num; i++){
            builder = new StringBuilder(str[i]);
            str[i] = builder.reverse().toString();
        }
        return str;
    }
}
