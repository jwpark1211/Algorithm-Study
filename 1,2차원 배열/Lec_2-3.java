import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      int round = sc.nextInt();
      int A [] = new int[round];
      int B [] = new int[round];
      for(int i=0;i<round;i++)  A[i] = sc.nextInt();
      for(int i=0;i<round;i++)  B[i] = sc.nextInt();
      for(int i=0;i<round;i++)  System.out.println(solution(A[i],B[i]));
    }

    //문제 해설이랑 내가 푼 거랑 똑같음
    public static String solution(int A, int B){
       String Result = "";
       // 경우의 수 : [1] A==B [2] A=1/B=2  [3] A=1/B=3  [4] A=2/B=1 [5] A=2/B=3 [6] A=3/B=1  [7] A=3/B=2
        if(A == B){
            Result = "D";
        }else{
            if(A==1){
                if(B==2) Result = "B";
                else if(B==3) Result = "A";
            }else if(A==2){
                if(B==1) Result = "A";
                else if(B==3) Result = "B";
            }else if(A==3)
                if(B==1) Result = "B";
                else if(B==2) Result = "A";
        }
       return Result;
    }
}
