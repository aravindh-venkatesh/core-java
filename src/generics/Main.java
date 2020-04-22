package generics;

public class Main {
    public static void main(String[] args) {
        // demo1("Hello World!!!", 3.14);
        // demo2();
        // demo3();
        // demo4();
        demo5();
    }

    public static <T, V extends Number> void demo1(T ob1, V ob2) {
        System.out.println(ob1);
        System.out.println(ob1.getClass().getName());
        System.out.println();
        System.out.println(ob2);
        System.out.println(ob2.getClass().getName());
    }

    public static void demo2() {
        NonGen1 nonGen1 = new NonGen1(100);
        System.out.println(nonGen1.getD());
        System.out.println();
        nonGen1.setD(3.14);
        System.out.println(nonGen1.getD());
    }

    public static void demo3() {
        Gen1<Number, Double> gen1 = new Gen1<>(3.14);
        System.out.println(gen1.getNumber());
        gen1.setNumber(100.0);
        System.out.println(gen1.getNumber());
    }

    public static void demo4() {
        /*
        Here Gen3 object is expecting a generic of Gen2 or its subtype
        and also Gen2 or its subtype class should implement GenInterface.

        Try removing and adding implements in Gen2 to see the difference
        */

        Gen2<Double> gen2 = new Gen2<>();
        Gen3<Gen2<Double>> gen3 = new Gen3<>(gen2);
        gen3.gen2.setNumber(3.14);
        System.out.println(gen3.gen2.getNumber());
    }

    public static void demo5() {
        Gen4<Number> numberGen4 = new Gen4<>(100);
        Gen4<Integer> integerGen4 = new Gen4<>(200);
        Gen4<Double> doubleGen4 = new Gen4<>(300.0);

        demo5SubMethod1(numberGen4);
        demo5SubMethod1(integerGen4);
        demo5SubMethod1(doubleGen4);
        System.out.println();

        demo5SubMethod2(numberGen4);
        demo5SubMethod2(integerGen4);
        System.out.println();
        /*
        demo5SubMethod3(doubleGen4);
        Error because method3 is expecting Integer or its super class
        */

        /*
        demo5SubMethod2(numberGen4);
        demo5SubMethod2(integerGen4);
        Above two lines are error because method2 is expecting Double or its subclass
        */
        demo5SubMethod3(doubleGen4);
    }

    /*
    Below method takes any object as its argument. ? specifies any argument.
    However according to Gen4 class generic specification ? can only be Number or its sub class type.
    Hence having '?' or '? extends Number' in below line will have same outcome
    */
    public static void demo5SubMethod1(Gen4<?> gen4) {
        /*
        since argument gen4 can hold Gen4<Number>, Gen4<Integer> and Gen4<Double> kind of objects to this method,
        only instance methods which are common (usually methods available in super class and inherited through
        hierarchy ) to all three objects are available inside this block.
        */
        System.out.println(gen4.getDoubleValueOfNumber());
    }

    /*
    Method2 can take only Integer and its super class
    */
    public static void demo5SubMethod2(Gen4<? super Integer> gen4) {
        System.out.println(gen4.getDoubleValueOfNumber());
    }

    /*
    Method3 takes any object which is Double or its subclass as its argument.
    */
    public static void demo5SubMethod3(Gen4<? extends Double> gen4) {
        System.out.println(gen4.getDoubleValueOfNumber());
    }
}
