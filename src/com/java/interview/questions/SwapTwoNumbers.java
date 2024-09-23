package com.java.interview.questions;

public class SwapTwoNumbers {
    //Idea No: 1
    /*
    2 number ah swap panrom appo, enkita oru number iruku en friend kita oru number iruku,
    friend kita iruka number ah vaanga ennoda kaila idam ila becoz ennoda kaila already
    oru number iruku so, ennoda number oru third person ah kooptu avarkita koduthuten
    apdina ennoda kai free aagirum ippo naan en friend kita irunthu number ah vaangiruven
    aprm antha 3rd person kita na kodutha number ah en frd kita koduka solliruven....
     */
    int myNumber = 890;
    int frdNumber = 1250;
    int thirdPerson = myNumber;
    public void swapping(){
        frdNumber = myNumber;
        System.out.println("afterswapping");

    }
    public void afterSwapping() {
        frdNumber = thirdPerson;
        System.out.println(frdNumber);
    }

    //2nd Way Without using third variable
    /*
    using maths + - combination or * / combination
     */
    int first = 30;
    int second = 60;
    public void usingMathsAddSub() {
        first = first - second;
        second = first + second;
        first = second - first;
        System.out.println(first);
        System.out.println(second);

    }
    public void usingMathsMulDiv() {
        first = first * second;
        second = first / second;
        first = first / second;
        System.out.println(first);
        System.out.println(second);
// While doing multiplication and divison value 0 will not work

    }



    public static void main(String[] args) {
        SwapTwoNumbers twoNumbers = new SwapTwoNumbers();
        //twoNumbers.swapping();
        //twoNumbers.afterSwapping();
        //twoNumbers.usingMathsAddSub();
        twoNumbers.usingMathsMulDiv();
    }
}
