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
           if(Character.isUpperCase(s)){
               result  += Character.toLowerCase(s);;
           }
           else if(Character.isLowerCase(s)){
               result += Character.toUpperCase(s);
           }
       }
        return result;
    }
}
