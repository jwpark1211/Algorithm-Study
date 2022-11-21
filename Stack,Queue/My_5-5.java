 import java.util.*;

    public class Main {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            String str = sc.nextLine();
            System.out.println(solution(str));
        }

        public static int solution(String str) {
            int answer = 0;
            Stack<Character> stack = new Stack<>();
            char arr[] = str.toCharArray();

            for(int i=0; i<arr.length; i++){
                if(arr[i] == '(') stack.push(arr[i]);
                else
                {
                    stack.pop();
                    if(arr[i-1]=='(') answer += stack.size();
                    else answer+=1;
                }
            }

            return answer;
        }
    }


