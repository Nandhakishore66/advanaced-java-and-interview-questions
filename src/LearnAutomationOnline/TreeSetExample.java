package LearnAutomationOnline;

import java.util.Iterator;
import java.util.TreeSet;

public class TreeSetExample {
    public void methods() {
        TreeSet<Integer> tree = new TreeSet<Integer>();
        tree.add(2);
        tree.add(9);
        tree.add(7);
        tree.add(5);
        System.out.println(tree);
        System.out.println(tree.first());
        System.out.println(tree.last());
        System.out.println(tree.headSet(7));
        System.out.println(tree.tailSet(5));
        System.out.println(tree.subSet(2, 9));
        System.out.println(tree.comparator());
        System.out.println(tree.higher(5));
        System.out.println(tree.lower(7));
        System.out.println(tree.descendingSet());
        System.out.println(tree);
        System.out.println(tree.pollFirst()); // retrive and remove
        System.out.println(tree);
        System.out.println(tree.pollLast());
        System.out.println(tree);
    }
    public void loop(){
        TreeSet<Integer> tree = new TreeSet<Integer>();
        tree.add(2);
        tree.add(9);
        tree.add(7);
        tree.add(5);
        System.out.println("----------------");
        for (Integer integer:tree) {
            System.out.println(integer);
        }
        Iterator<Integer> iterator = tree.iterator();
        System.out.println("----------------");
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
        Iterator<Integer> iterator1 = tree.descendingIterator();
        System.out.println("----------------");
        while (iterator1.hasNext()) {
            System.out.println(iterator1.next());
        }
    }
    public static void main(String[] args) {
        TreeSetExample example = new TreeSetExample();
        example.methods();
        example.loop();
    }
}
