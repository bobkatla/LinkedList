public class LinkedList {
    private class Node {
        int data;
        private Node(int data) {this.data = data;}
        Node next = null;
    }

    private Node head = null;
    private Node tail = null;
    private int size = 0;
    
    public LinkedList() {}

    private boolean initList(int e) {
        if (size == 0) {
            Node newNode = new Node(e);
            head = newNode;
            tail = newNode;
            size++;
            return true;
        } else return false;
    }

    public void addFirst(int e) {
        if(!initList(e)) {
            Node newFirstNode = new Node(e);
            newFirstNode.next = head;
            head = newFirstNode;
            size++;
        }
    }

    public void addLast(int e) {
        if(!initList(e)) {
            Node newLastNode = new Node(e);
            tail.next = newLastNode;
            tail = newLastNode;
            size++;
        }
    }

    public int removeLast() {
        if (size == 0) {
            throw new Error("Invalid: the list is empty cannot remove element");
        } else {
            Node current = head;
            while (current.next.next != null) {
                current = current.next;
            }
            int result = tail.data;
        }
    }

    public int removeFirst() {
        if (size == 0) {
            throw new Error("Invalid: the list is empty cannot remove element");
        } else {
            int result = head.data;
            Node newHead = head.next;
            head.next = null;
            head = newHead;
            return result;
        }
    }

    public int getFirst() {
        try{
            return head.data;
        }catch(Exception e) {
            throw new Error("NULL");
        }
    }

    public int getLast() {
        try{
            return tail.data;
        }catch(Exception e) {
            throw new Error("NULL");
        }
    }

    public void showList() {
        System.out.println("");
        Node current = head;
        while (current != null) {
            System.out.print(current.data);
            System.out.print("->");
            current = current.next;
        }
    }
}
