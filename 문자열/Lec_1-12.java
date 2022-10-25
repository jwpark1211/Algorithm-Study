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
        for(int i=0;i<c;i++){
            String tmp = str.substring(0,7)
                    .replace('#','1')
                    .replace('*','0');
            int num = Integer.parseInt(tmp,2);
            answer += (char) num;
            str = str.substring(7);

        }
        return answer;
    }
}
