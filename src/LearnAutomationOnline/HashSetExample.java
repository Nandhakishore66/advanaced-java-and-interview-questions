package LearnAutomationOnline;

import java.util.HashSet;
import java.util.Iterator;

public class HashSetExample {
    public void hashSet() {
        HashSet<String> hs1 = new HashSet<String>();
        hs1.add("A");
        hs1.add(null);
        hs1.add("B");
        hs1.add("C");
        hs1.add("A");
        System.out.println(hs1);
        hs1.remove(null);
        System.out.println(hs1);
        System.out.println(hs1.contains("A"));
    }
    public void loop() {
        HashSet<String> hs2 = new HashSet<String>();
        hs2.add("A");
        hs2.add("B");
        hs2.add("C");
        hs2.add("A");
        for (String string : hs2){
            System.out.println(string);
        }
        // Check for Loop
        Iterator<String> iterator = hs2.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }
    public static void main(String[] args) {
        HashSetExample example = new HashSetExample();
        example.hashSet();
        example.loop();
    }
}
