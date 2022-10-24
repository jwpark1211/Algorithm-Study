import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      String str = sc.nextLine();
      str = solution(str);
      System.out.println(str);
    }

    public static String solution(String str){
        String strOnlyAlpha = "";
        for(char s : str.toCharArray())
            if(Character.isAlphabetic(s))
                strOnlyAlpha += s;
        String reverse = new StringBuilder(strOnlyAlpha).reverse().toString();
        if(!strOnlyAlpha.equalsIgnoreCase(reverse))
            return "NO";
        return "YES";
    }
}
