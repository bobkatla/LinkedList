import java.lang.*;
import java.util.*;
import java.io.*;
import java.util.Map.*;

public class Main {
    public static void main(String[] args) {
        LinkedList l = new LinkedList();
        // System.out.println(l.getFirst());
        l.addFirst(3);
        l.addFirst(6);
        l.addFirst(7);
        l.addLast(8);
        l.addLast(5);
        l.showList();
        l.reverse();
        l.showList();
        l.reverse();
        l.showList();
        // System.out.println(l.getLast());
    }
}