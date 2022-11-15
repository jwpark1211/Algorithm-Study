    import java.util.*;

    public class Main {
        public static void main(String[] args) {
          Scanner sc = new Scanner(System.in);
          int n = sc.nextInt();
          int k = sc.nextInt();
          int [] arr = new int [n];
          for(int i=0; i<n; i++) arr[i] = sc.nextInt();
          solution(n,k,arr);
        }

        public static void solution(int n,int k, int[] arr) {
            List<Integer> answer = new ArrayList<>();

            int lt = 0, rt = 0;
            HashMap<Integer, Integer> map = new HashMap<>();
            while(rt != n){
                map.put(arr[rt],map.getOrDefault(arr[rt],0)+1);
                rt++;
                if(rt-lt==k) {
                    answer.add(map.size());
                    if(map.get(arr[lt])==1)
                        map.remove(arr[lt]);
                    else
                        map.put(arr[lt],map.get(arr[lt])-1 );
                    lt++;
                }
            }
            for(int x : answer) System.out.print(x+" ");
        }
    }
