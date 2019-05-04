package com.learning;
class A
{
    void myMethod() throws IOException
    {
        System.out.println("ONE");
    }
     
    void myMethod() throws NumberFormatException
    {
        System.out.println("TWO");
    }
     
    void myMethod() throws ArrayIndexOutOfBoundsException
    {
        System.out.println("THREE");
    }
}