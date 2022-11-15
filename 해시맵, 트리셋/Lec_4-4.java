    import java.util.*;

    public class Main {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            String s = sc.next();
            String t = sc.next();
            System.out.println(solution(s, t));
        }

        public static int solution(String s, String t) {
            int answer = 0;
            Map<Character,Integer> mapS = new HashMap<>();
            Map<Character,Integer> mapT = new HashMap<>();

            for(char x : t.toCharArray())
                mapT.put(x, mapT.getOrDefault(x,0)+1);

            int L = t.length()-1;
            for(int i=0; i<L; i++)
                mapS.put(s.charAt(i),mapS.getOrDefault(s.charAt(i),0)+1);
            int lt=0;
            for(int rt=L;rt<s.length();rt++){
                mapS.put(s.charAt(rt),mapS.getOrDefault(s.charAt(rt),0)+1);
                if(mapS.equals(mapT)) answer++;
                mapS.put(s.charAt(lt),mapS.getOrDefault(s.charAt(lt),0)-1);
                if(mapS.get(s.charAt(lt))==0) mapS.remove(s.charAt(lt));
                lt++;
            }
            return answer;
        }
    }


