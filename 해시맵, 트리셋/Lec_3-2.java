    import java.util.*;

    public class Main {
        public static void main(String[] args) {
          Scanner sc = new Scanner(System.in);
          String str1 = sc.nextLine();
          String str2 = sc.nextLine();
          System.out.println(solution(str1, str2));
        }

        public static String solution(String str1, String str2) {
            String answer = "YES";

            HashMap<Character,Integer> map = new HashMap<>();

            for(char x : str1.toCharArray())
                map.put(x,map.getOrDefault(x,0)+1);

            for(char x : str2.toCharArray()){
                if(!map.containsKey(x) || map.get(x)==0)
                    return "NO";
                map.put(x, map.get(x)-1);
            }

            return answer;
        }
    }
