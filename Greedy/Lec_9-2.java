import java.util.*;

class Meeting implements Comparable<Meeting>{
    int start,end;
    public Meeting(int start, int end) {
        this.start = start;
        this.end = end;
    }
    @Override
    public int compareTo(Meeting o) {
        if(o.end == this.end)
            return this.start - o.start;
        else
            return this.end - o.end;
    }
}
class Main{
    public static int Greedy(ArrayList<Meeting> arr,int n){
        int answer = 1;
        Collections.sort(arr);
        int endTime = 0;
        for(Meeting obj : arr){
            if(obj.start>=endTime){
                answer ++;
                endTime = obj.end;
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        ArrayList<Meeting> arr = new ArrayList<>();
        for(int i=0; i<n; i++){
            arr.add(new Meeting(sc.nextInt(),sc.nextInt()));
        }
        System.out.println(Greedy(arr,n));
    }
}