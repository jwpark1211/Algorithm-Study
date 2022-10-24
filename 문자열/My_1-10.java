import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      String str = sc.next();
      String c = sc.next();
      solution(str,c.charAt(0));
    }

    public static void solution(String str, char c){
        List<Integer> indexArray = new ArrayList<>();
        for(int i=0;i<str.length();i++)
            if(str.charAt(i) == c)
                indexArray.add(i);
        for(int i=0;i<str.length();i++){
            int min = Integer.MAX_VALUE;
            for(int j=0;j<indexArray.size();j++){
                if(min>Math.abs(indexArray.get(j)-i))
                    min = Math.abs(indexArray.get(j)-i);
            }
            System.out.print(min + " ");
        }
    }
}
