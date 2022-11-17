    import java.util.*;

    public class Main {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            String str = sc.nextLine();
            System.out.println(solution(str));
        }

        public static String solution(String str) {
            String answer = "";
            Stack<Character> stack = new Stack<>();

            for(char x : str.toCharArray()){
                if(x == ')'){
                    while(stack.pop()!='(');
                }
                else stack.push(x);
            }

            for ( char x : stack)
                answer += x;

            return answer;
        }
    }


