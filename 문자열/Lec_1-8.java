import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      String str = sc.nextLine();
      str = solution(str);
      System.out.println(str);
    }

    //String.replaceAll 이용해서 문제 해결하면 훨씬 간단...
    public static String solution(String str){
        str = str.toUpperCase().replaceAll("[^A-Z]","");
        // 대문자 A-Z가 아닌 것은 다 ""로 치환하라.
        String reverse = new StringBuilder(str).reverse().toString();
        if(!str.equals(reverse))
            return "NO";
        return "YES";
    }
}
