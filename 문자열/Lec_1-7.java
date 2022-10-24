import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      String str = sc.next();
      str = solution(str);
      System.out.println(str);
    }

    //String.indexOf를 활용한 문제
    //indexOf() 메서드는 호출한 String 객체에서 주어진 값과 일치하는 첫 번째 인덱스를 반환
    public static String solution(String str){
        String answer = "";
        String reverse = new StringBuilder(str).reverse().toString();
        if(!str.equalsIgnoreCase(reverse))
            return "NO";
        return "YES";
    }
}
