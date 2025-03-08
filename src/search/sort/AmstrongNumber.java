package com.search.sort;

public class AmstrongNumber {
    public static void main(String[] args){
        int num=153;
        int original=num;
        int temp;
        int check=0;
        while(num>0){
            temp=num%10;
            check=check+(temp*temp*temp);
            num=num/10;
        }
        if(check==original){
            System.out.println("It is Amstrong Number");
        }else{
            System.out.println("Not a Amstrong");
        }
    }
}
