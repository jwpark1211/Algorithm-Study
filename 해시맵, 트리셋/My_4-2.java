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
            boolean isSame = true;

            HashMap<Character,Integer> map1 = new HashMap<>();
            HashMap<Character,Integer> map2 = new HashMap<>();

            for(char x : str1.toCharArray())
                map1.put(x,map1.getOrDefault(x,0)+1);
            for(char x : str2.toCharArray())
                map2.put(x,map2.getOrDefault(x,0)+1);

            if(map1.size() != map2.size()) isSame = false;
            for(char key : map1.keySet()){
                if(map1.get(key) != map2.get(key))
                    isSame = false;
            }
            if(isSame == false) answer = "NO";

            return answer;
        }
    }
