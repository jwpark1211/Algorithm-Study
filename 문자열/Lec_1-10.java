import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      String str = sc.next();
      String c = sc.next();
      solution(str,c.charAt(0));
    }

    //왼쪽 방향에서의 c와의 거리를 구한 후, 오른쪽 방향에서의 c와의 거리를 구한다.
    //그리고 이 둘을 비교한다.
    public static void solution(String str, char c){
        int [] answer = new int[str.length()];
        int p = 1000;
        for(int i = 0; i< str.length();i++){
            if(str.charAt(i) == c){
                p = 0;
                answer[i] = p;
            }else{
                p++;
                answer[i] = p;
            }
        }

        p = 1000;
        for(int i = str.length()-1; i>= 0;i--){
            if(str.charAt(i) == c){
                p = 0;
            }else{
                p++;
                answer[i] = Math.min(answer[i],p);
            }
        }
        for(int i=0;i<answer.length;i++){
            System.out.print(answer[i]+" ");
        }
    }
}
