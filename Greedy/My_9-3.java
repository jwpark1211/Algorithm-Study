import java.util.*;
class Time implements Comparable<Time>{
    int time;
    char status;

    public Time(int time, char status) {
        this.time = time;
        this.status = status;
    }

    @Override
    public int compareTo(Time o) {
        if(this.time == o.time)
            return this.status - o.status;
        else return this.time - o.time;
    }
}
class Main{
    public static int Greedy(ArrayList<Time> timeLine, int n){
        int answer = 0;
        int cnt = 0;
        Collections.sort(timeLine);
        for(Time time : timeLine){
            if(time.status == 'S') {
                cnt++;
                answer = Math.max(cnt,answer);
            }else
                cnt --;
        }
        return answer;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        ArrayList<Time> timeLine = new ArrayList<>();
        for(int i=0; i<n; i++){
            timeLine.add(new Time(sc.nextInt(),'S'));
            timeLine.add(new Time(sc.nextInt(),'E'));
        }
        System.out.println(Greedy(timeLine,n));
    }
}