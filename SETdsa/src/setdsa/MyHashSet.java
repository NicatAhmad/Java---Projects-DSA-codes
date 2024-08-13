
package setdsa;
import java.util.LinkedList;

class MyHashSet {
    private static final int SIZE = 1000;
    private LinkedList<Integer>[] buckets;

    public MyHashSet() {
        buckets = new LinkedList[SIZE];
        for (int i = 0; i < SIZE; i++) {
            buckets[i] = new LinkedList<>();
        }
    }

    private int hash(int key) {
        return key % SIZE;
    }

    public void add(int key) {
        int bucketIndex = hash(key);
        LinkedList<Integer> bucket = buckets[bucketIndex];
        if (!bucket.contains(key)) {
            bucket.add(key);
        }
    }

    public void remove(int key) {
        int bucketIndex = hash(key);
        LinkedList<Integer> bucket = buckets[bucketIndex];
        bucket.remove((Integer) key);
    }

    public boolean contains(int key) {
        int bucketIndex = hash(key);
        LinkedList<Integer> bucket = buckets[bucketIndex];
        return bucket.contains(key);
    }
}
