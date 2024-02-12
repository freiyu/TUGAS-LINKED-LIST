import tugas2_LinkedList.LinkedList;

public class MainList {

    public static void main(String[] args) {
        System.out.println("============================");
        System.out.println("Create:");
        LinkedList linkedList = new LinkedList(1);
        linkedList.printLinkedList();
        System.out.println("============================");

        System.out.println("Append:");
        linkedList.append(2);
        linkedList.printLinkedList();
        linkedList.append(3);
        linkedList.printLinkedList();
        linkedList.append(4);
        linkedList.printLinkedList();
        System.out.println("============================");

        System.out.println("Prepend:");
        linkedList.prepend(6);
        linkedList.printLinkedList();
        linkedList.prepend(7);
        linkedList.printLinkedList();
        linkedList.prepend(8);
        linkedList.printLinkedList();
        System.out.println("============================");

        System.out.println("Remove First:");
        linkedList.removeFirst();
        linkedList.printLinkedList();
        linkedList.removeFirst();
        linkedList.printLinkedList();
        System.out.println("============================");

        System.out.println("Remove Last:");
        linkedList.removeLast();
        linkedList.printLinkedList();
        linkedList.removeLast();
        linkedList.printLinkedList();
        System.out.println("============================");

        System.out.println("Get Node By Index:");
        System.out.println("LinkedList Index of 1: " + linkedList.get(1));
        linkedList.printLinkedList();
        System.out.println("LinkedList Index of 2: " + linkedList.get(2));
        linkedList.printLinkedList();
        System.out.println("LinkedList Index of 3: " + linkedList.get(3));
        linkedList.printLinkedList();
        System.out.println("============================");

        System.out.println("Add Node By Index:");
        linkedList.insert(1, 7);
        linkedList.printLinkedList();
        linkedList.insert(3, 8);
        linkedList.printLinkedList();
        System.out.println("============================");

        System.out.println("Remove Node By Index:");
        linkedList.printLinkedList();
        System.out.println("Removed node (Index : 1): " +  linkedList.remove(1));
        linkedList.printLinkedList();
        System.out.println("Removed node (Index : 2): " +  linkedList.remove(2));
        linkedList.printLinkedList();
        System.out.println("============================");

        System.out.println("Reverse LinkedList:");
        System.out.println("Before Reversed");
        linkedList.printLinkedList();
        System.out.println("After Reversed");
        linkedList.reverse();
        linkedList.printLinkedList();
        System.out.println("============================");

        System.out.println("Head and Tail: ");
        linkedList.getHead();
        linkedList.getTail();
        System.out.println("============================");
    }
}
