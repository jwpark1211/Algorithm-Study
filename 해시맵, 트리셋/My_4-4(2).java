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

            for(int i=0; i<t.length();i++)
                mapS.put(s.charAt(i),mapS.getOrDefault(s.charAt(i),0)+1);
            if(mapS.equals(mapT)) answer++;

            int lt = 0; int rt = t.length(); int any=0;
            while(rt<s.length()){
                if(mapS.containsKey(s.charAt(rt)))
                    mapS.put(s.charAt(rt),mapS.get(s.charAt(rt))+1);
                else
                    any++;
                if(mapS.containsKey(s.charAt(lt)))
                    mapS.put(s.charAt(lt),mapS.get(s.charAt(lt))-1);
                else
                    any--;
                if(mapS.equals(mapT)&&any==0) answer++;
                lt++; rt++;
            }
            return answer;
        }
    }


