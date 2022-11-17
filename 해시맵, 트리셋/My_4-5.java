    import java.util.*;

    public class Main {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            int N = sc.nextInt();
            int K = sc.nextInt();

            int arr[] = new int[N];
            for(int i=0; i<N; i++)
                arr[i] = sc.nextInt();
            System.out.println(solution(N,K,arr));
        }

        public static int solution(int N, int K, int[] arr) {
            int answer = 0;
            TreeSet<Integer> treeSet = new TreeSet<>(Comparator.reverseOrder());

            for (int i = 0; i < N - 2; i++) {
                for (int j = i + 1; j < N - 1; j++) {
                    for (int k = j + 1; k < N; k++)
                        treeSet.add(arr[i] + arr[j] + arr[k]);
                }
            }

            if(treeSet.size()<K)
                return -1;

            Iterator iter = treeSet.iterator();
            for(int i=0; i<K; i++){
                answer = (int)iter.next();
            }
            return answer;
        }
    }


