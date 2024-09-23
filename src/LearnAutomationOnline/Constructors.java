package LearnAutomationOnline;

public class Constructors {
    /* Constructor is a block of code that initializes values to the
    newly created object */

    // 1. Default constructor

    int value;
    String name;
    Integer wrapperClass;

    // When we create a class, the compiler will automatically provide one default constructor here.
    public static void main(String[] args) {
        Constructors obj = new Constructors();
        int yes = obj.value;
        String nameDefaultConstructor =obj.name;
        Integer wrapper = obj.wrapperClass;
        System.out.println(yes);
        System.out.println(nameDefaultConstructor);
        System.out.println(wrapper);


    }
}
