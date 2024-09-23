package LearnAutomationOnline;

public class ConstructorOverloading {
    String draw;
    ConstructorOverloading() { //No arguments constructor
        System.out.println("Draw object created");

    }

    ConstructorOverloading(String toDraw){
        this.draw = toDraw;
        System.out.println("Drawing "+ draw);
    }
    public static void main(String[] args) {
        ConstructorOverloading obj = new ConstructorOverloading();
        ConstructorOverloading obj1 = new ConstructorOverloading("Circle");
// Based on the object created it will choose the constructor CTRL+CLICK on near (new)
    }
}
