package LearnAutomationOnline;

public class StaticMethods {

    public static void methodStatic() {  //example for static method
        System.out.println("This method is static");
    }
    public void nonStatic() { //Example for non static method
        // We can call static method from non static but not the otherwise
        methodStatic(); // lastly added
        System.out.println("This method is non static");
    }
    public static void main(String[] args) {
        //When we make a member static we can call it without creating a object
        methodStatic();
        //If i want to call non static methods means I need to create an object
        StaticMethods obj = new StaticMethods();
        obj.nonStatic();
        //obj.methodStatic(); // we can call in this way also but it will give warning
    }
}
