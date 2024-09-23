package LearnAutomationOnline;

public class ParameterizedConstructor {
    String animalName;
    String animalType;
    ParameterizedConstructor(String name, String type) {
        animalName = name;
        animalType = type;
    }
    public void printStatement() {
        System.out.println("Animal name is "+animalName + " Animal type is " +animalType);
    }
    public static void main(String[] args) {
        ParameterizedConstructor obj = new ParameterizedConstructor("Pegion", "bird");
        obj.printStatement();
        // Like this I can create multiple objects and I am able to give my own inputs
        ParameterizedConstructor obj1 = new ParameterizedConstructor("Lion", "King");
        obj1.printStatement();
        //In Industry they are mostly using parameterized constructor
    }
}
