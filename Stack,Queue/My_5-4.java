    import javax.script.ScriptEngine;
    import javax.script.ScriptEngineManager;
    import javax.script.ScriptException;
    import java.util.*;

    public class Main {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            String str = sc.nextLine();
            System.out.println(solution(str));
        }

        public static int solution(String str) {
            int answer = 0;
            String formula = "";
            Stack<Integer> stack = new Stack<>();

            for(char x : str.toCharArray()){
                int tmp1=0; int tmp2=0; int res=0;
                if(x=='+'){
                    tmp1 = stack.pop();
                    tmp2 = stack.pop();
                    res = tmp2+tmp1;
                    stack.push(res);
                }else if(x == '-'){
                    tmp1 = stack.pop();
                    tmp2 = stack.pop();
                    res = tmp2-tmp1;
                    stack.push(res);
                }else if(x == '*'){
                    tmp1 = stack.pop();
                    tmp2 = stack.pop();
                    res = tmp2*tmp1;
                    stack.push(res);
                }else if(x == '/'){
                    tmp1 = stack.pop();
                    tmp2 = stack.pop();
                    res = tmp2/tmp1;
                    stack.push(res);
                }else{
                    stack.push(Integer.parseInt(String.valueOf(x)));
                }
            }
            answer = stack.pop();
            return answer;
        }
    }


