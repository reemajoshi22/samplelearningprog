package com.learning;
class ABC
{
    void methodABC()
    {
        new XYZ().methodXYZ();
    }
}
 
class XYZ extends ABC
{
    void methodXYZ()
    {
        methodABC();
    }
}
 
public class MainClass
{
    public static void main(String[] args)
    {
        new ABC().methodABC();
    }    
}