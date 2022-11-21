 import java.util.*;

    public class Main {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            String need = sc.nextLine();
            String plan = sc.nextLine();
            System.out.println(solution(need, plan));
        }

        public static String solution(String need, String plan) {
            String answer = "YES";
            Queue<Character> Q = new LinkedList<>();
            for(char x : need.toCharArray()) Q.offer(x);
            for(char x : plan.toCharArray()){
                if(Q.contains(x)) {
                    if(x!=Q.poll()) return "NO";
                }
            }
            if(!Q.isEmpty()) return "NO";
            return answer;
        }
    }


