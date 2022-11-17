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
            Stack<Integer> stack = new Stack<>();

            for(char x : str.toCharArray()){
                if(Character.isDigit(x)) stack.push((int)x-48);
                else{
                    int rt = stack.pop();
                    int lt = stack.pop();
                    if(x =='+') stack.push(lt+rt);
                    else if( x=='-') stack.push(lt-rt);
                    else if( x=='*') stack.push(lt*rt);
                    else if( x=='/') stack.push(lt/rt);
                }
            }
            answer = stack.pop();
            return answer;
        }
    }


