package LearnAutomationOnline;

public class StaticVariableExample1 {
    /*
     1. Normally we should not create object for static (Main moto)
     2. This example is specially to prove that point which is,
     * only a single copy of static variable is created and shared among all the instances(means object)
     of the class.
    */

    static int balance;
    String name;
    public static void main(String[] args) {
        // balance = 1000; we can call it like this

        // No need to create object but creating object to prove that above point
        StaticVariableExample1 obj1 = new StaticVariableExample1();
        obj1.balance = 2000;
        obj1.name = "naveen";
//        System.out.println("obj 1 bal " + obj1.balance);
//        System.out.println("obj 1 name " + obj1.name);// kept this for doubt
        StaticVariableExample1 obj2 = new StaticVariableExample1();
        obj2.balance = 3000;
        obj2.name = "kohli";

        System.out.println("obj 1 bal " + obj1.balance);
        System.out.println("obj 1 name " + obj1.name);
        System.out.println("obj 2 bal " + obj2.balance);
        System.out.println("obj 2 name " + obj2.name);
    }
}
