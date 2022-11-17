    import java.util.*;

    public class Main {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            String str = sc.nextLine();
            System.out.println(solution(str));
        }

        public static String solution(String str) {
            String answer = "";
            char arr[] = str.toCharArray();
            Stack<Character> stack = new Stack<>();

            int count = 0;
            for(int i=0;i<arr.length;i++){
                if(arr[i]=='('){
                    stack.push(arr[i]);
                }else if(arr[i]==')'){
                    if(stack.isEmpty())
                        count ++;
                    else if(stack.peek()=='(')
                        stack.pop();
                    else
                        count++;
                }
            }

            if(stack.isEmpty()&&count == 0) answer = "YES";
            else answer = "NO";

            return answer;
        }
    }


