    import java.util.*;

    public class Main {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            String s = sc.next();
            String t = sc.next();
            System.out.println(solution(s, t));
        }

        //틀림..
        public static int solution(String s, String t) {
            int answer = 0;
            Map<Character,Integer> map = new HashMap<>();

            for(char x : t.toCharArray()){
                map.put(x, map.getOrDefault(x,0)+1);
            }
            for(int i=0; i<t.length();i++){
                map.put(s.charAt(i),map.getOrDefault(s.charAt(i),0)-1);
            }
            boolean isBoolean = true;
            for(char x : t.toCharArray()){
                if(map.get(x)!=0)
                    isBoolean = false;
            }
            if(isBoolean == true) answer++;

            isBoolean = true;
            int rt = t.length(); int lt = 1;
            while(rt<s.length()){
                map.put(s.charAt(rt),map.getOrDefault(s.charAt(rt),0)-1);
                map.put(s.charAt(lt),map.getOrDefault(s.charAt(lt),0)+1);

                isBoolean = true;
                for(char x : t.toCharArray()){
                    if(map.get(x)!=0)
                        isBoolean = false;
                }
                if(isBoolean == true) answer++;
                lt++; rt++;
            }

            return answer;

        }
    }


