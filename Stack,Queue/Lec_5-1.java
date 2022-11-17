    import java.util.*;

    public class Main {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            String str = sc.nextLine();
            System.out.println(solution(str));
        }

        public static String solution(String str) {
            String answer = "YES";
            Stack<Character> stack = new Stack<>();

            for(char x : str.toCharArray()){
                if(x == '(') stack.push(x);
                else{
                    if(stack.isEmpty()) return "NO";
                    stack.pop();
                }
            }

            if(!stack.isEmpty()) return "NO";
            return answer;
        }
    }


