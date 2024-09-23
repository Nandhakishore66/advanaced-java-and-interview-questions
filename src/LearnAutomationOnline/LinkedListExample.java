package LearnAutomationOnline;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;

public class LinkedListExample {
    public void linkedListEx() {
        LinkedList<Integer> linkedList = new LinkedList<Integer>();
        linkedList.add(4);
        linkedList.add(5);
        linkedList.add(4);
        linkedList.add(7);
        linkedList.add(8);
        System.out.println(linkedList);
        System.out.println(linkedList.getFirst());
        System.out.println(linkedList.getLast());
        linkedList.addFirst(2);
        System.out.println(linkedList);
        linkedList.addLast(9);
        System.out.println(linkedList);
        linkedList.removeFirst();
        System.out.println(linkedList);
        linkedList.removeLast();
        System.out.println(linkedList);
        linkedList.removeFirstOccurrence(4);
        System.out.println(linkedList);
        linkedList.removeLastOccurrence(4);
        System.out.println(linkedList);
        System.out.println(linkedList.get(1));
    }
    public void forEachAndForLoops() {
        LinkedList<Integer> linkedList = new LinkedList<Integer>();
        linkedList.add(4);
        linkedList.add(5);
        linkedList.add(4);
        linkedList.add(7);
        linkedList.add(8);
        System.out.println(linkedList);
        System.out.println("1stLoop----------------------------------");
        for (Integer integer : linkedList) {
            System.out.println(integer);
        }
        System.out.println("2ndLoop----------------------------------");
        for (int i =0; i<linkedList.size(); i++) {
            System.out.println(linkedList.get(i));
        }
        System.out.println("Has both forward and reverse traversing----------------------------------");
        ListIterator<Integer> listIterator = linkedList.listIterator();
        while(listIterator.hasNext()) {
            System.out.println(listIterator.next());
        }
        System.out.println("Reverse----------------------------------");
        while(listIterator.hasPrevious()) {
            System.out.println(listIterator.previous());
        }
        System.out.println("only forward");
        Iterator<Integer> iterator = linkedList.iterator();
        while(iterator.hasNext()) {
            System.out.println(iterator.next());
        }

    }
    public static void main(String[] args) {
        LinkedListExample obj =new LinkedListExample();
        obj.linkedListEx();
        obj.forEachAndForLoops();
    }
}
