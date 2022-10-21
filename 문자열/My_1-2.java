import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      String str = sc.next();
        System.out.println(solution(str));
    }

    public static String solution(String str){
        String result = "";
        for(char s : str.toCharArray()){
           if((int)s>=65 && (int)s<=90){
               s = Character.toLowerCase(s);
               result  += s;
           }
           else if((int)s >=97 && (int)s<=122){
               s = Character.toUpperCase(s);
               result += s;
           }
       }
        return result;
    }
}
