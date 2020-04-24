package interfaces;

public interface TypesOfMethodsAndAttributes {
    // implicitly attributes are static and final. it is not required to implement an interface to use static attributes
    double PI = 3.14;

    // most generic form of method written for interface
    // this method will be implemented by classes implementing interface
    // implicitly methods are public
    void method1();

    // static method; similar to attributes; need not require to implement interface to use static methods
    static void method2() {
        System.out.println("Method 2");
    }

    // default methods provide implementation
    // helpful to prevent breaking legacy code whose interface require addition of methods
    // default methods can call private methods (as private methods all provide implementation)
    default void method3() {
        System.out.println("Method 3");
        method4();
    }

    // private methods are not visible outside interface
    // only default methods and private methods can call other private methods
    private void method4() {
        method5();
    }

    private void method5() {
        System.out.println("Method 4");
    }

}
