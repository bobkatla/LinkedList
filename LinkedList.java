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
        Node result = tail;
        if (size == 0) {
            throw new Error("Invalid: the list is empty cannot remove element");
        } else if (size == 1) {
            head = null;
            tail = null;
        } else {
            Node current = head;
            while (current.next.next != null) {
                current = current.next;
            }
            current.next = null;
            tail = current;
        }
        size--;
        return result.data;
    }

    public int removeFirst() {
        if (size == 0) {
            throw new Error("Invalid: the list is empty cannot remove element");
        } else {
            int result = head.data;
            Node newHead = head.next;
            head.next = null;
            head = newHead;
            if (size == 1) tail = null;
            size--;
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
        if (size == 0) {
            throw new Error("Invalid: the list is empty");
        } else {
            Node current = head;
            while (current != null) {
                System.out.print(current.data);
                if (current.next != null) System.out.print("->");
                current = current.next;
            }
            System.out.println("");
        }
    }

    public void reverse() {
        
    }
}
