package lambda_expressions;

public class Main {
    public static void main(String[] args) {
        // demo1();
        // demo2();
        // demo3();
        // demo4();
        demo5();
    }

    public static void demo1() {
        FuncInterface<String, String, String> funcInterface = (ob1, ob2) -> {
            System.out.println("Hello from lambda function - demo1");
            return ob1 + " " + ob2;
        };
        System.out.println(funcInterface.method("Hello", "World!!!!"));
    }

    public static void demo2() {
        FuncInterface<String, String, String> funcInterface = (ob1, ob2) -> {
            System.out.println("Hello from lambda function - demo2");
            return ob1 + " " + ob2;
        };
        String arg1 = "Hello";
        String arg2 = "World!!!";
        demo2method(funcInterface, arg1, arg2);
    }

    private static void demo2method(FuncInterface<String, String, String> funcInterface, String arg1, String arg2) {
        System.out.println(funcInterface.method(arg1, arg2));
    }

    public static void demo3() {
        String arg1 = "Hello from lambda function - ";
        String arg2 = "demo3";

        /*
        Outer variable which is used within lambda function should be final or effectively final.
        In case if variable is not defined as final it is assumed that variable is effectively final
        and will never be reassigned with new value.
        */

        // arg1 = "Hello";
        // Error - should be final or effectively final

        FuncInterface<String, String, String> funcInterface = (ob1, ob2) -> {
            System.out.print(arg1);
            System.out.println(arg2);
            return ob1 + " " + ob2;
        };

        // arg2 = "World!!!";
        // Error - should be final or effectively final

        System.out.println(funcInterface.method("Hello", "World!!!"));
    }

    public static void demo4() {
        FuncInterface<String, String, String> funcInterface1 = MethodReferences::method1;
        System.out.println(funcInterface1.method("Hello", "from demo4 - static method reference"));

        FuncInterface<String, String, MethodReferences> funcInterface = MethodReferences::new;
        MethodReferences methodReferences = funcInterface.method("Hello", "from demo4 - method references constructor");

        FuncInterface<String, String, String> funcInterface2 = methodReferences::method2;
        System.out.println(funcInterface2.method("Hello", "from demo4 - object instance : method reference"));

        FuncInterface<MethodReferences, String, String> funcInterface3 = MethodReferences::method3;
        System.out.println(funcInterface3.method(
                methodReferences,"Hello from demo4 - passing object and method reference"));
    }

    public static void demo5() {
        /*
        Regular way of creating array of objects (empty array) and adding objects into this array.
        Creates array which can hold object of type MethodReferences.
        But no objects are assigned to it, they are all currently holding null values.
        */
        MethodReferences methodReferences = new MethodReferences("Hello", "from demo5 - regular object instantiation");
        MethodReferences[] methodReferences1 = new MethodReferences[1];
        System.out.println(methodReferences1.length);
        methodReferences1[0] = methodReferences;
        System.out.println(methodReferences1[0].method4());

        /*
        Using functional interfaces to create array of objects.
        Functional interface methods are used to create array of particular length.
        */
        FunctionalInterfaceForArrayConstructor1<MethodReferences[]> arrayConstructor1 = MethodReferences[]::new;
        FunctionalInterfaceForArrayConstructor2<MethodReferences[], Integer> arrayConstructor2
                = MethodReferences[]::new;

        MethodReferences[] methodReferences2 = arrayConstructor1.constructorMethod(1);
        MethodReferences[] methodReferences3 = arrayConstructor2.constructorMethod(1);

        System.out.println(methodReferences2.length);
        System.out.println(methodReferences3.length);

        methodReferences2[0] = methodReferences;
        methodReferences3[0] = methodReferences;

        System.out.println(methodReferences2[0].method4());
        System.out.println(methodReferences3[0].method4());
    }
}
