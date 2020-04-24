package nested_classes;

public class Outer {
    private String outerStringInstanceVariable;

    public void setOuterStringInstanceVariable(String outerStringInstanceVariable) {
        this.outerStringInstanceVariable = outerStringInstanceVariable;
    }

    public String getOuterStringInstanceVariable() {
        return outerStringInstanceVariable;
    }

    public void demo1() {
        Inner1 inner1 = new Inner1();
        inner1.printHello();
    }

    /*
    Non static inner classes has access to instance variables and methods of outer class.
    Class can be private only when it is inner class
    */
    private class Inner1 {
        public void printHello() {
            setOuterStringInstanceVariable("Hello from non static inner class");
            System.out.println(getOuterStringInstanceVariable());
        }
    }

    public void demo2() {
        class Inner2 {
            public void demo2() {
                setOuterStringInstanceVariable("Hello from inner class within method");
                System.out.println(getOuterStringInstanceVariable());
            }
        }
        Inner2 inner2 = new Inner2();
        inner2.demo2();
    }

    /*
    Static inner classes doesn't have access to instance variables and methods of outer class.
    */
    public static class Inner3 {
        public void printHello() {
            System.out.println("Hello from static inner class");
        }
    }
}
