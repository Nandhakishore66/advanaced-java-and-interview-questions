package LearnAutomationOnline;

public class TypicalBasicJava {

    // Class = Data + methods (function)

    // Below things are data....
    Long accountNumber = 9876543L;
    // I have used a wrapper class Long which means am able to create a object
    String name = "Kishore";
    int accountBal = 300;
    public void holderName() {       // This is user defined method

        System.out.println(name);
    }

    // Here only I have used a method..
    // This public static void main is the entry point of executions
    // jdk first search (public static void main) where is this line, then it will execute from this line
    public static void main(String[] args){ // Built in method
        TypicalBasicJava obj = new TypicalBasicJava();
        obj.holderName();

    }


}
