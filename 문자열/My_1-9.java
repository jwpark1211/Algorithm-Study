import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      String str = sc.nextLine();
      System.out.println(solution(str));
    }

    public static int solution(String str){
        str = str.replaceAll("[^0-9]","");
        return Integer.parseInt(str);
    }
}
