import java.util.HashMap;

public class CMap<T, E> {
    private HashMap<T, Node> map = new HashMap<>();

    class Node {
        E value;
        long time;
        public Node(E value, long time) {
            this.value = value;
            this.time = time;
        }
    }

    void put(T key, E value) {
        Node node = new Node(value, System.currentTimeMillis());
        map.put(key, node);
    }

    E get(int key) {
        long cms = System.currentTimeMillis();
        Node node = map.get(key);
        if (cms - node.time < 100000) {
            return node.value;
        } else {
            return null;
        }
    }

    public static void main(String[] args) {
        CMap<String, Integer> map = new CMap<>();
        map.put("ali", 7);
    }
}
