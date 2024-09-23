package LearnAutomationOnline;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class ArrayListExamples {
    public void arrayListExample() {
        //List <String> arrayList = new ArrayList<String>();
        ArrayList <String> arrayList = new ArrayList<String>();
        arrayList.add("Rohit");
        arrayList.add("Kohli");
        arrayList.add("Rahul");
        arrayList.add("dhoni");
        arrayList.add("dhoni");
        System.out.println(arrayList);
        String value = arrayList.get(2);
        System.out.println(value);
        System.out.println(arrayList.indexOf("dhoni"));
        System.out.println(arrayList.lastIndexOf("dhoni"));
        System.out.println("----------------------------------");
        System.out.println("Copying the old list to a new list");
        List <String> anotherList = new ArrayList<String>();
        anotherList.addAll(arrayList);
        System.out.println(anotherList);
        anotherList.clear();
        System.out.println(anotherList);
        arrayList.remove(1);
        System.out.println(arrayList);
        arrayList.remove("dhoni");
        System.out.println(arrayList);
        arrayList.add(null);
        System.out.println(arrayList);
        arrayList.add("Hardik");
        System.out.println(arrayList);
        arrayList.set(1, "Gambhir");
        System.out.println(arrayList);
        System.out.println(anotherList.isEmpty());
        System.out.println("---------------------------");
        System.out.println("For each loop");
        for(String string: arrayList) {
            System.out.println(string);
        }
        System.out.println("---------------------------");
        System.out.println("For loop");
        for(int i=0; i<arrayList.size(); i++) {
            System.out.println(arrayList.get(i));
        }
        System.out.println(anotherList.isEmpty());
        System.out.println("---------------------------");
        System.out.println("List iterator for both forward and reverse traversing");
        ListIterator<String> listIterator = arrayList.listIterator();
        while (listIterator.hasNext()){
            System.out.println(listIterator.next());
        }
        while (listIterator.hasPrevious()){
            System.out.println(listIterator.previous());
        }
        System.out.println("---------------------------");
        System.out.println("iterator has only forward traversing");
        Iterator<String> iterator = arrayList.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }

    }
    public static void main(String[] args) {
        ArrayListExamples obj = new ArrayListExamples();
        obj.arrayListExample();
    }
}
