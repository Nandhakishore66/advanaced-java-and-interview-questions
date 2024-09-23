package LearnAutomationOnline;

public class SuperKeywordChild extends SuperKeywordParent {
    // When i use without extends keyword it will only print "This is child class".
    // Creating no arguments constructor
    int value = 10;
    SuperKeywordChild() {
        //If i use extends keyword it will automatically provide super() keyword inside the constructor
        //super(); it will present like this here
        int checking = this.value;
        System.out.println(checking);
        System.out.println("This is child class");
    }
    public static void main(String[] args) {
        SuperKeywordChild obj = new SuperKeywordChild();

    }
}
