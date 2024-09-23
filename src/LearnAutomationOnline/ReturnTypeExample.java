package LearnAutomationOnline;

public class ReturnTypeExample {

    // Dad has given a task to his son to collect 1000 from person A and send to him

    //Datas
    /*int collectedAmount = 1000;
    public void amountCollected() {   //user defined method
        System.out.println("Dad the amount which i have collected from person A is "  +  collectedAmount);
    }
    // Main method
    public static void main(String[] args) {
        ReturnTypeExample obj = new ReturnTypeExample();
        obj.amountCollected();
    }*/
    // upto now my son has collected the amount but not yet given to me



    // Now I am typing for return statement
    int collectedAmount = 1000;
    public int amountCollected() {   //user defined method
        // Void does not return anything....
        // Now changing to int instead of void becoz I want the collected amount
        System.out.println("Dad the amount which i have collected from person A is "  +  collectedAmount);
        return collectedAmount;
    }
    // Main method
    public static void main(String[] args) {
        ReturnTypeExample obj = new ReturnTypeExample();
        int returnedAmt = obj.amountCollected();
        System.out.println("My son has returned the collected amount "  +  returnedAmt);

    } // utilize some more examples for return type......
}
