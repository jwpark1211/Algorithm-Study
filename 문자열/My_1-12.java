import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      int c = sc.nextInt();
      String str = sc.next();
      System.out.println(solution(c,str));
    }

    public static String solution(int c, String str){
        String answer = "";
        String binary = "";
        for(int i=0;i<str.length();i++){
            if(str.charAt(i) == '#')
                binary += "1";
            if(str.charAt(i) == '*')
                binary += "0";
        }
        for(int i=0;i<c;i++){
            answer += (char)Integer.parseInt(binary.substring(i*7,7*(i+1)),2);
        }
        return answer;
    }
}
