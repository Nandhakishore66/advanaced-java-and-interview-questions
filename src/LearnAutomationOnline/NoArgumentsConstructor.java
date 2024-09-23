package LearnAutomationOnline;

public class NoArgumentsConstructor {
    int value;
     NoArgumentsConstructor() { //Now the constructor is available so it is user defined constructor
        value = 20;
        System.out.println(value);

    }// once we written the user defined constructor there is no concept of default constructor
    public static void main(String[] args) {
        NoArgumentsConstructor obj = new NoArgumentsConstructor();
        //Here we have not called the constructor by using object. We just created a object
    }
}
