import java.util.HashMap;
import java.util.LinkedList;

public class CMap {
    private HashMap<Integer, Node> map = new HashMap<>();
    
    class Node {
        int value;
        long time;
        public Node(int value, long time) {
            this.value = value;
            this.time = time;
        }
    }

    void put(int key, int value) {
        Node node = new Node(value, System.currentTimeMillis());
        map.put(key, node);
    }

    int get(int key) {
        long cms = System.currentTimeMillis();
        Node node = map.get(key);
        if (cms - node.time < 100000) {
            return node.value;
        } else {
            return -1;
        }
    }

    public static void main(String[] args) {

    }
}
