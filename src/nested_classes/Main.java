package nested_classes;

public class Main {
    public static void main(String[] args) {
        Outer outer = new Outer();
        outer.demo1();
        System.out.println();

        outer.demo2();
        System.out.println();

        /*
        Static inner classes are instantiated without instantiating outer classes
        */
        Outer.Inner3 demo3 = new Outer.Inner3();
        demo3.printHello();
        System.out.println();

        /*
        Below example shows anonymous class on interface.
        It is possible to replace anonymous class with lambda when there is only one method in Interface.
        We can also have anonymous class on abstract class. It basically overrides abstract methods.
        Lambda cannot be created on abstract class
        */
        AnonymousInterface anonymous = new AnonymousInterface() {
            @Override
            public void printHello() {
                System.out.println("Hello from anonymous class");
            }
        };
        anonymous.printHello();
        System.out.println();

        AnonymousInterface lambda = () -> System.out.println("Hello from lambda");
        lambda.printHello();
    }
}
