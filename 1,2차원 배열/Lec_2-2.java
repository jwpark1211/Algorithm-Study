import java.util.Scanner;

//틀림
public class Main {
    public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      int numOfPerson = sc.nextInt();
      int heightArr [] = new int[numOfPerson];
      for(int i=0;i<numOfPerson;i++){
          heightArr[i] = sc.nextInt();
      }
        System.out.println(solution(numOfPerson,heightArr));
    }

    public static int solution(int numOfPerson, int [] heightArr){
        int answer = 1; //첫번째 학생은 항상 보임

        int max = heightArr[0];

        for(int i=1;i<numOfPerson;i++){
               if(heightArr[i]>max){
                   answer ++;
                   max = heightArr[i];
               }
        }
        return answer;
    }
}
