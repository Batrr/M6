package demo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class A {

    public static void main(String[] args) {
        ClassPathXmlApplicationContext ac = new ClassPathXmlApplicationContext("ApplicationContext.xml");

        System.out.println("------------------");

        C firstC = (C) ac.getBean("firstC");
        firstC.functionInC();


        System.out.println("------------------");

        B firstB = (B) ac.getBean("firstB");
        firstB.functionInB();

        System.out.println("------------------");

        //        System.out.println("hello from A");
//
//        B b;
//        C c;
//
//        System.out.println("------------------");
//
//        b = new B(null, 11);
//        b.functionInB();
//
//        System.out.println("------------------");
//
//        c = new C(22);
//        c.functionInC();
//
//        System.out.println("------------------");
//
//        b = new B(c, 33);
//        b.functionInB();
    }
}
