package interfaces;

public class Main implements TypesOfMethodsAndAttributes {
    // public non static methods need to be over-ridden.
    // default methods can be over-ridden or used as it is

    @Override
    public void method1() {
        System.out.println("Method 1");
    }

    public static void main(String[] args) {
        System.out.println("Pi: " + TypesOfMethodsAndAttributes.pi);

        Main main = new Main();
        main.method1();
        TypesOfMethodsAndAttributes.method2();
        main.method3();
    }
}
