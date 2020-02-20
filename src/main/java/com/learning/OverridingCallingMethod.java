package com.learning;

public class OverridingCallingMethod {
    public static void main(String[] args) {
        OverridingCallingMethod overridingCallingMethod=new OverridingCallingMethod();
        overridingCallingMethod.doIt();
    }
    public void doIt(){
        System.out.println("OverridingCallingMethod");
    }
}

 class OverridingSubClass extends OverridingCallingMethod {

    public void doIt(){
        super.doIt();
        System.out.println("OverridingSubClass");
    }
}

class OverridingSubClass2 extends OverridingSubClass {

    public void doIt(){
        System.out.println("OverridingSubClass2");
    }
}
