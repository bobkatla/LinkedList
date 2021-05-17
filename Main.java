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
        System.out.print(l.getFirst());
        l.showList();
        l.addLast(8);
        l.addLast(5);
        l.removeFirst();
        l.showList();
        // l.removeLast();
    }
}