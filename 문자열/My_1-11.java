import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      String str = sc.next();
      System.out.println(solution(str));
    }

    public static String solution(String str){
        String answer = "";
        int isDuplicated [] = new int[str.length()];
        isDuplicated[str.length()-1] = 0;
        //str.charAt(i) == str.charAt(i)이면 1, 아니면 0

        for(int i=0;i<str.length()-1;i++){
            if(str.charAt(i) == str.charAt(i+1))
                isDuplicated[i] = 1;
            else
                isDuplicated[i] = 0;
        }

        int N = 1;
        for(int i=0;i<str.length();i++){
            while(true){
                if(isDuplicated[i] == 0){
                    answer += str.charAt(i);
                    if(N != 1)
                        answer += String.valueOf(N);
                    N = 1;
                    break;
                }
                else if(isDuplicated[i] == 1){
                    N ++;
                    break;
                }
            }
        }
        return answer;
    }
}
