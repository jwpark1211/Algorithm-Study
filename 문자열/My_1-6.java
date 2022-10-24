import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      String str = sc.next();
      str = solution(str);
      System.out.println(str);
    }

    public static String solution(String str){
        String answer = ""+str.charAt(0);
        boolean isDuplicated = false;
        for( char x : str.toCharArray() ){
            isDuplicated = false;
            for(int i=0;i<answer.length();i++){
                if(answer.charAt(i) == x) {
                    isDuplicated = true;
                }
            }
            if(isDuplicated == false) {
                answer += x;
            }
        }
        return answer;
    }
}
