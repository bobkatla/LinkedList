import java.lang.*;
import java.util.*;
import java.io.*;
// Manual testing
public class Main {

    // Creating a private method for running test results, this will be like a wrapper to compare
    public static int numberOfTest = 0;
    private static void Testing(String actualResult, String expectedResult){
        numberOfTest++;
        if (expectedResult.equals(actualResult)) {
            System.out.println("Test " + Integer.toString(numberOfTest) + ": PASS");
        } else {
            System.out.println("Test " + Integer.toString(numberOfTest) + ": FAIL");
            System.out.println("-> Expected: \"" + expectedResult + "\", but received: \"" + actualResult + "\"");
        }
    }
    public static void main(String[] args) {
        LinkedList l = new LinkedList();
        String result = "";

        System.out.println("*");
        System.out.println("* START THE TESTING *");
        System.out.println("*");

        // Test 1 for error of removing in empty list
        try {l.removeLast();}
        catch(Error e) {result = e.toString();}
        Testing(result, "java.lang.Error: The list is empty cannot remove element");

        // Test 2 for error of removing in empty list
        try {l.removeFirst();}
        catch(Error e) {result = e.toString();}
        Testing(result, "java.lang.Error: The list is empty cannot remove element");

        // Test 3 for error of getting in empty list
        try {l.getFirst();}
        catch(Error e) {result = e.toString();}
        Testing(result, "java.lang.Error: NULL");

        // Test 4 for error of getting in empty list
        try {l.getLast();}
        catch(Error e) {result = e.toString();}
        Testing(result, "java.lang.Error: NULL");

        // Test 5
        l.addFirst(5);
        Testing(l.toString(), "5");

        // Test 6
        Testing(Integer.toString(l.getLast()), "5");

        // Test 7
        Testing(Integer.toString(l.getFirst()), "5");

        // Test 8
        l.removeLast();
        Testing(l.toString(), "");

        // Test 9
        l.addLast(235);
        Testing(l.toString(), "235");

        // Test 10
        Testing(Integer.toString(l.getLast()), "235");

        // Test 11
        Testing(Integer.toString(l.getFirst()), "235");

        // Test 12
        l.removeFirst();
        Testing(l.toString(), "");

        // Test 13
        l.addFirst(8);
        l.addLast(3);
        l.addFirst(3);
        l.addFirst(6);
        l.addFirst(7);
        l.addLast(2443);
        Testing(l.toString(), "7->6->3->8->3->2443");

        // Test 14
        Testing(Integer.toString(l.getLast()), "2443");

        // Test 15
        Testing(Integer.toString(l.getFirst()), "7");

        // Test 16
        l.removeLast();
        l.removeFirst();
        l.addLast(12);
        l.addFirst(22);
        l.removeLast();
        Testing(l.toString(), "22->6->3->8->3");

        // Test 17
        l.reverse();
        Testing(l.toString(), "3->8->3->6->22");

        // Test 18
        Testing(Integer.toString(l.getLast()), "22");

        // Test 19
        Testing(Integer.toString(l.getFirst()), "3");

        // Test 20
        l.addFirst(65);
        l.addLast(1);
        Testing(l.toString(), "65->3->8->3->6->22->1");

        // Test 21
        l.removeLast();
        l.removeLast();
        l.removeFirst();
        l.removeFirst();
        Testing(l.toString(), "8->3->6");

        // Test 22
        l.reverse();
        Testing(l.toString(), "6->3->8");

        // Test 23
        l.removeLast();
        l.removeLast();
        l.removeLast();
        Testing(l.toString(), "");
    }
}