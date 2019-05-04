package com.learning;

import java.sql.SQLException;

class AEX
{
    void myMethod() throws Exception
    {
        System.out.println("Super Class");
    }
}
 
class Bx extends AEX
{
    @Override
    void myMethod()
    {
        System.out.println("Sub Class");
    }
}