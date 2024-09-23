package LearnAutomationOnline;

import java.util.HashMap;

public class HashMapExample {
    public void example() {
        HashMap<Integer, String> hashMap = new HashMap<Integer, String>();
        hashMap.put(1, "Facebook");
        hashMap.put(2, "Instagram");
        hashMap.put(3, "Whatsapp");// If we have same duplicate keys it will be overridden with the new value
        hashMap.put(3, "snapchat");
        System.out.println(hashMap);
        HashMap<Integer, String> duplicate = new HashMap<Integer, String>();
        duplicate.putAll(hashMap);
        System.out.println(duplicate);
        duplicate.clear();
        System.out.println(duplicate);
        System.out.println(duplicate.isEmpty());
        System.out.println(hashMap.containsKey(2));
        System.out.println(hashMap.containsValue("Whatsapp")); //Case Sensitive
        System.out.println(hashMap.clone());
        System.out.println(hashMap.get(4));
        System.out.println(hashMap.keySet());
        System.out.println(hashMap.values());
        System.out.println(hashMap.entrySet());

    }
    public static void main(String[] args) {
        HashMapExample obj = new HashMapExample();
        obj.example();
    }
}
