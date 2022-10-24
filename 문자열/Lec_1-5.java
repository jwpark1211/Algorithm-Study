import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      String str = sc.next();
      str = solution(str);
      System.out.println(str);
    }

    public static String solution(String str){
        String answer = "";

        char tmp;
        int lt = 0, rt = str.length()-1;
        char strToChar [] = str.toCharArray();
        while(lt<rt){
            if(Character.isAlphabetic(strToChar[lt] )
                    && Character.isAlphabetic(strToChar[rt])){
                tmp = strToChar[lt];
                strToChar[lt] = strToChar[rt];
                strToChar[rt] = tmp;
                lt ++;
                rt --;
            }else if(!Character.isAlphabetic(strToChar[lt])){
                lt ++;
            }else if(!Character.isAlphabetic(strToChar[rt])){
                rt --;
            }
        }
        answer = String.valueOf(strToChar);

        return answer;
    }
}
