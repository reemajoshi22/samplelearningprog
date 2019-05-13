package com.learning;
class Base
{
    public void print_geek()
    {
        System.out.println("Geeks");
    }
}

class Derived1 extends Base
{
    public void print_for()
    {
        System.out.println("for");
    }
}

class Derived2 extends Base
{
    /*............*/
}

public class HierarchicalInheritenceExample {
    public static void main(String[] args) {
        Derived2 g = new Derived2();
        g.print_geek();
        Derived1 t = new Derived1();
        t.print_for();
        g.print_geek();
    }
}
