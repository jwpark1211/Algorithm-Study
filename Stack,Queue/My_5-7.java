 import java.util.*;

    public class Main {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            String standard = sc.nextLine();
            String compare = sc.nextLine();
            System.out.println(solution(standard,compare));
        }

        public static String solution(String standard, String compare) {
            String answer = "";
            ArrayList<Character> std = new ArrayList<>();
            for(char x : standard.toCharArray()) {
                std.add(x);
            }
            for(char x : compare.toCharArray()) {
                if(std.contains(x)) answer+=x;
            }

            if(answer.equals(standard)) return "YES";
            else return "NO";
        }
    }


