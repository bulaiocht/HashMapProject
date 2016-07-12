import com.sun.net.httpserver.HttpServer;

/**
 *
 * Created by Kocherha Vitalii on 12.07.2016.
 */
public class HaschMap <K, V> {

    private Node<K, V> [] buckets;
    int INITIAL_BUCKETS_CAPACITY = 15;



    private class Node<K, V>{
        private K key;
        private V value;
        private Node<K, V> nextNode;
        private int nodeKeyHash;

        public Node(K key, V value) {
            this.key = key;
            this.value = value;
            this.nodeKeyHash = hashCode(key);
        }

        public K getKey() {
            return key;
        }

        public V getValue() {
            return value;
        }

        public Node<K, V> getNextNode() {
            return nextNode;
        }

        public void setNextNode(Node<K, V> nextNode) {
            this.nextNode = nextNode;
        }

        public int getNodeHash() {
            return nodeKeyHash;
        }

        public int hashCode(K key) {
            return key.hashCode();
        }
    }
}
