package LearnAutomationOnline;

public class StaticClassExampleOuter {

    static class Inner{
        public void print(){
            System.out.println("print statement");
        }
    }
    public static void main(String[] args) {
        //Inner class is a static member of outer class so we are creating like this
        StaticClassExampleOuter.Inner obj = new StaticClassExampleOuter.Inner();
        obj.print();
    }
}
