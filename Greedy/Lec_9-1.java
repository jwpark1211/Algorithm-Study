import java.util.*;

class Person implements Comparable<Person>{
    int height;
    int weight;
    public Person(int height, int weight) {
        this.height = height;
        this.weight = weight;
    }
    @Override
    public int compareTo(Person o) {
        return o.height-this.height;
    }
}
class Main{
    public static int Greedy(ArrayList<Person> arr,int n){
        int answer = 0;
        Collections.sort(arr);
        int max = Integer.MIN_VALUE;
        for(Person obj : arr){
            if(obj.weight>max){
                max = obj.weight;
                answer ++;
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        ArrayList<Person> arr = new ArrayList<>();
        for(int i=0; i<n; i++){
            arr.add(new Person(sc.nextInt(),sc.nextInt()));
        }
        System.out.println(Greedy(arr,n));
    }
}