import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      String str = sc.next();
      char c = sc.next().charAt(0);
      System.out.println(solution(str,c));
    }

    public static int solution(String str, char c){
        int answer = 0;

        str = str.toUpperCase();
        c  =  Character.toUpperCase(c);

        //str.toCharArray()를 통해 문자열을 배열로 변경해줌 -> forEach를 통해 해결
        for(char x : str.toCharArray()){
            if(c == x)
                answer++;
        }

        return answer;
    }
}
