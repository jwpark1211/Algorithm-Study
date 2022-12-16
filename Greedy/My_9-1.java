import java.util.*;

class Person{
    int height;
    int weight;

    public Person(int height, int weight) {
        this.height = height;
        this.weight = weight;
    }
}

class Main{
    public static int Greedy(int n, Person [] list){
        int answer = 0;
        for(int i=0; i<n; i++){
            boolean flag = true;
            Person person = list[i];
            for(int j=0; j<n; j++){
                if(i!=j){
                    Person cmp = list[j];
                    if(person.height<cmp.height){
                        if(person.weight<cmp.weight){
                            flag = false;
                            break;
                        }
                    }
                }
            }
            if(flag == true) answer ++;
        }
        return answer;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Person[] list = new Person[n];
        for(int i=0; i<n; i++){
            list[i] =  new Person(sc.nextInt(), sc.nextInt());
        }
        System.out.println(Greedy(n,list));
    }
}