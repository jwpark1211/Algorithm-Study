import java.util.*;
class Schedule implements Comparable<Schedule>{
    int money;
    int date;

    public Schedule(int money, int date) {
        this.money = money;
        this.date = date;
    }
    @Override
    public int compareTo(Schedule o) {
        return o.date - this.date;
    }
}
class Main{
    public static int Greedy(ArrayList<Schedule> schedules, int n, int max){
        int answer = 0;
        Collections.sort(schedules);
        PriorityQueue<Integer> pQ = new PriorityQueue<>(Collections.reverseOrder());
        int j = 0;
        for(int i=max; i>0; i--){
            for(; j<n; j++){
                if(schedules.get(j).date<i) break;
                pQ.offer(schedules.get(j).money);
            }
            if(!pQ.isEmpty()) answer += pQ.poll();
        }
        return answer;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        ArrayList<Schedule> schedules = new ArrayList<>();
        int max = Integer.MIN_VALUE;
        for(int i=0; i<n; i++){
            int money = sc.nextInt();
            int date = sc.nextInt();
            max = Math.max(max,date);
            schedules.add(new Schedule(money,date));
        }
        System.out.println(Greedy(schedules,n,max));
    }
}