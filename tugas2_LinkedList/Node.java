package tugas2_LinkedList;

public class Node {
    int value;
    Node next;

    @Override
    public String toString() {
        return String.valueOf(value);
    }

    Node(int value) {
        this.value = value;
    }
}
