import java.util.*;

class Node {
    int data;
    Node lt, rt;

    public Node(int data) {
        this.data = data;
        lt = null;
        rt = null;
    }
}
public class Main {
    Node root;
    public int BFS(Node root){
        int L = -1;
        Queue<Node> q = new LinkedList<>();
        q.offer(root);
        boolean isEndNode = false;
        while(!isEndNode){
            L++;
            int size = q.size();
            for(int i=0;i<size; i++){
                Node tmp = q.poll();
                if(tmp.lt != null) q.offer(tmp.lt);
                if(tmp.rt != null) q.offer(tmp.rt);
                if(tmp.lt == null && tmp.rt == null){
                    isEndNode = true;
                    break;
                }
            }
        }
        return L;
    }
    public static void main(String[] args) {
        Main tree = new Main();
        tree.root = new Node(1);
        tree.root.lt = new Node(2);
        tree.root.rt = new Node(3);
        tree.root.lt.lt = new Node(4);
        tree.root.lt.rt = new Node(5);
        System.out.println(tree.BFS(tree.root));
    }
}