public class LinkedList {
    // private nested class Node
    private class Node {
        int data;
        private Node(int data) {this.data = data;}
        Node next = null;
    }

    // Init
    private Node head = null;
    private Node tail = null;
    private int size = 0;
    public LinkedList() {}

    // Special case when add new data but the list is empty
    private boolean initList(int e) {
        if (size == 0) {
            Node newNode = new Node(e);
            head = newNode;
            tail = newNode;
            size++;
            return true;
        } else return false;
    }
    // Add the new data at first, run in O(1)
    public void addFirst(int e) {
        if(!initList(e)) {
            Node newFirstNode = new Node(e);
            newFirstNode.next = head;
            head = newFirstNode;
            size++;
        }
    }
    // Add new data at last, run in O(1)
    public void addLast(int e) {
        if(!initList(e)) {
            Node newLastNode = new Node(e);
            tail.next = newLastNode;
            tail = newLastNode;
            size++;
        }
    }
    // Remove the last data, run in O(n)
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
    // Remove the first data, run in O(1)
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
    // Get the first data, run in O(1), throw error NULL if the list is empty
    public int getFirst() {
        try{
            return head.data;
        }catch(Exception e) {
            throw new Error("NULL");
        }
    }
    // Get the last data, run in O(1), throw error NULL if the list is empty
    public int getLast() {
        try{
            return tail.data;
        }catch(Exception e) {
            throw new Error("NULL");
        }
    }
    // Print out the list with the required order, run in O(n)
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
    // Reverse the list, run in O(n)
    public void reverse() {
        LinkedList hold = new LinkedList();
        int sz = size;
        while(size > 0) hold.addFirst(removeFirst());
        while(size < sz) addLast(hold.removeFirst());
        hold = null;
    }
}
