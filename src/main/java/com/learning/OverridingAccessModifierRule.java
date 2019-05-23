package com.learning;

import org.hibernate.hql.internal.ast.SqlASTFactory;

import java.sql.SQLException;

class first{
    public void method(){
        System.out.println(" class first method");
    }
    private void method1(){
        System.out.println(" class first private  method");
    }
}

class second extends first{
   /* private void method(){
        System.out.println(" class second method");
    }*/
    public void method1() throws Exception{
        System.out.println(" class first public method");
    }
}
public class OverridingAccessModifierRule{
    public void methodPrivate() throws Exception{
        System.out.println(" class OverridingAccessModifierRule private  method");
    }
    public static void main(String[] args) {
        first first=new first();
         //first.method1();
        OverridingAccessModifierRule overridingAccessModifierRule=new over();
        try {
            ((over) overridingAccessModifierRule).methodPrivate();
        } catch (Exception e) {
            e.printStackTrace();
        }

        OverridingAccessModifierRule overridingAccessModifierRule1=new OverridingAccessModifierRule();
        try {
            overridingAccessModifierRule1.methodPrivate();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
 class over extends OverridingAccessModifierRule{
     public void methodPrivate() throws Exception {
         System.out.println(" class over public  method");
     }
}
