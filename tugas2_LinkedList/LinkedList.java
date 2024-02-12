package tugas2_LinkedList;

public class LinkedList {
    private Node head;
    private Node tail;
    private int length;

    // Membuat LinkedList
    public LinkedList(int value) {
        Node newNode = new Node(value);
        head = newNode;
        tail = newNode;
        length = 1;
    }

    // Menampilkan Seluruh Node pada LinkedList`
    public void printLinkedList() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.value + " ");
            temp = temp.next;
        }
        System.out.println();
    }

    // Menampilkan Head LinkedList
    public void getHead() {
        if (head == null) {
            System.out.println("Head: null");
        } else {
            System.out.println("Head: " + head.value);
        }
    }

    // Menampilkan Tail LinkedList
    public void getTail() {
        if (head == null) {
            System.out.println("Tail: null");
        } else {
            System.out.println("Tail: " + tail.value);
        }
    }

    // Mendapatkan panjang LinkedList terkini
    public int getLength() {
        return length;
    }

    // Menambahkan node di akhir
    public void append(int value) {
        Node newNode = new Node(value);
        if (length == 0)
        {
            head = newNode;
            tail = newNode;
        }
        else
        {
            tail.next = newNode;
            tail = newNode;
        }
        length++;
    }

    // Menghapus node terakhir
    public Node removeLast()
    {
        if (length == 0) return null;
        Node temp = head;
        Node pre = head;
        while(temp.next != null)
        {
            pre = temp;
            temp = temp.next;
        }
        tail = pre;
        tail.next = null;
        length--;
        if (length == 0)
        {
            head = null;
            tail = null;
        }
        return temp;
    }

    // Menambahkan node di awal
    public void prepend(int value)
    {
        Node newNode = new Node(value);
        if (length == 0)
        {
            head = newNode;
            tail = newNode;
        }
        else
        {
            newNode.next = head;
            head = newNode;
        }
        length++;
    }

    // Menghapus node pertama
    public Node removeFirst()
    {
        if (length == 0) return null;
        Node temp = head;
        head = head.next;
        temp.next = null;
        length--;
        if (length == 0)
        {
            tail = null;
        }
        return temp;
    }

    /*
     * Pada praktikum kali ini silakan lengkapi function/method:
     * 1. get() -> untuk mendapatkan node berdasarkan index
     * 2. insert() -> untuk menambahkan node berdasarkan index
     * 3. remove() -> untuk menghapus node berdasarkan index
     * 4. reverse() -> untuk membalikkan urutan node LinkedList
     *
     * Silahkan modifikasi kode sehingga dapat menampilkan output seperti di soal.
     * Modfifikasi kode hanya diperbolehkan pada bagian yang ditandai
     * dan diperbolehkan.
     *
     * Selamat mengerjakan!
     *
     * JAWABAN INI MILIK
     * RAKASYAEL HIZKIA KOLONDAM
     * 2023105490 - SISTEM INFORMASI
     */

    // Mendapatkan node berdasarkan indeks indeks urutan
    public Node get(int index) {
        if(length > 0 && index >= 0 && index < length){
            Node result = head;
            for(int i = 1; i <= index; i++){
                result = result.next;
            }

            return result;
        }

        return null;
    }
    

    // Menambahkan node berdasarkan indeks urutan
    public void insert(int index, int value)  {
        Node newNode = new Node(value);

        if(head == null){
            head = tail = newNode;
            tail.next = null;
        }
        else{
            Node current = head;
            int pos = 1;

            while (pos < index && current.next != head){
                current = current.next;
                pos++;
            }

            newNode.next = current.next;
            current.next = newNode;
        }
    }

    // Menghapus node berdasarkan indeks urutan
    public Node remove(int index) {
        if(index < 0 || head == null){
            return null;
        }

        Node removedNode;

        if(index == 0){
            removedNode = head;
            head = head.next;
            return removedNode;
        }

        Node temp = head;
        int count = 0;
        while(temp != null && count < index - 1){
            temp = temp.next;
            count++;
        }

        if(temp == null || temp.next == null){
            return null;
        }

        removedNode = temp.next;
        temp.next = temp.next.next;
        return removedNode;
    }



    // Membalikkan urutan node LinkedList
    public void reverse() {
        Node current = head;
        Node prev = null;
        Node next = null;

        while(current != null){
            next = current.next;
            current.next = prev;
            prev = current;
            current = next;
        }

        head = prev;
    }
}
