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
            char arr [] = str.toCharArray();
            HashMap<Character,Integer> result = new HashMap<>();

            char[] keys = {'A','B','C','D','E'};
            for(int i=0;i<5;i++) result.put(keys[i], 0);
            for(int i=0; i<arr.length;i++){
               int value =  result.get(arr[i]);
               value ++;
               result.put(arr[i],value);
            }

            int max = 0;
            for(int i =0; i<5; i++){
                if(result.get(keys[i])>max){
                    max = result.get(keys[i]);
                    answer = keys[i];
                }
            }
            return answer;
        }
    }
