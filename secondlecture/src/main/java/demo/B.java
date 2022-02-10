package demo;

public class B {

    static int val;
    static C c;

    public B(C cc, int value) {
        c = cc;
        val = value;
    }

    public void functionInB() {

        System.out.println("I'm from B");
        System.out.println(val);

        if(c == null)
            System.out.println("There are no C");
        else
            c.functionInC();
    }
}
