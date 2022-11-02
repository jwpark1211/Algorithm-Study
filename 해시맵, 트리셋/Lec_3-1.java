    import java.util.*;

    public class Main {
        public static void main(String[] args) {
          Scanner sc = new Scanner(System.in);
          int N = sc.nextInt();
          String str = sc.next();
          System.out.println(solution(N,str));
        }

        public static char solution(int N, String str) {
            char answer = ' ';
            HashMap<Character,Integer> map = new HashMap<>();

            for(char x : str.toCharArray())
                map.put(x, map.getOrDefault(x,0)+1);

            int max = Integer.MIN_VALUE;
            for(char key : map.keySet()){
                if(map.get(key)>max){
                    max = map.get(key);
                    answer = key;
                }
            }

            return answer;
        }
    }
