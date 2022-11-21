 import java.util.*;

    public class Main {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            int N = sc.nextInt();
            int M = sc.nextInt();
            int arr[] = new int[N];
            for(int i=0; i<N; i++) arr[i] = sc.nextInt();
            System.out.println(solution(N,M,arr));
        }
        public static int solution(int N, int M,int arr[]) {
            int answer = 0;
            Queue<Person> q = new LinkedList<>();
            for(int i=0 ; i<N; i++){
                Person person = new Person(i,arr[i]);
                q.offer(person);
            }
            while(!q.isEmpty()){
                Person temp = q.poll();
                for(Person x : q){
                    if(x.priority>temp.priority) {
                        q.offer(temp);
                        break;
                    }
                }
                if(q.size()==N-1){
                    answer ++; N--;
                    if(temp.id == M)
                        break;
                }
            }
            return answer;
        }
    }

    class Person{
        int id;
        int priority;

        public Person(int id, int priority) {
            this.id = id;
            this.priority = priority;
        }

    }


