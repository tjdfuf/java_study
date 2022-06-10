package day11.protec.pec2;

import day11.protec.pec1.A;

public class D extends A {

    public D() {
//        super(30.3);  // default
         A a = new A();
//        a.f1 = 2;
        super.f1 = 2;  // protects
//        super.f2 = 2;  // default
        super.m1();  // protects
//        super.m2();   // default



    }


}
