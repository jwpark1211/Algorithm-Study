import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      String str = sc.nextLine();
        System.out.println(solution(str));
    }

    public static String solution(String str){
        String strArray[];
        String answer = "";
        strArray = str.split(" ");

        int max = 0;
        for(int i=0;i<strArray.length;i++){
            if(max<=strArray[i].length()){
                max = strArray[i].length();
                answer = strArray[i];
            }
        }
        return answer;
    }
}
