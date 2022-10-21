import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      String str = sc.nextLine();
      System.out.println(solution(str));
    }

    public static String solution(String str){
        String answer = "";
        int m = Integer.MIN_VALUE;
        int pos;
        while((pos=str.indexOf(' ')) != -1){
            String tmp = str.substring(0,pos); //' ' 기준 전 단어
            int len = tmp.length();
            if(len>m){
                m=len;
                answer = tmp;
            }
            str = str.substring(pos+1);
        }
        if(str.length()>m) answer = str;
        return answer;
    }
}
