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
        // 틀렸다가 다시 맞춤 ->
        // max 초기화를 0으로 둬서 틀림 heightArr[0]으로 두었더니 정답!!
        for(int i=1;i<numOfPerson;i++){
           if(heightArr[i]>heightArr[i-1]){
               if(heightArr[i]>max){
                   answer ++;
                   max = heightArr[i];
               }
           }
        }
        return answer;
    }
}
