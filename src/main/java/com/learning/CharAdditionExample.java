package com.learning;

public class CharAdditionExample {
    public static void main(String[] args) {
        CharAdditionExample charAdditionExample=new CharAdditionExample();
        charAdditionExample.charAddtitionToInt();
        charAdditionExample.incrementLoopExample();
    }

    private void incrementLoopExample() {
        int increment=-1;
        for(int i=0,j=0;i<10 & j<5;i++,j+=2){
            increment++;
        }
        System.out.println("increment " +increment);
    }

    private void charAddtitionToInt() {
       // var y='c'+2;
        //System.out.println(y);
        char y='b'+1;
        System.out.println(y);

    }
}
