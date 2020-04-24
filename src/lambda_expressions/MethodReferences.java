package lambda_expressions;

public class MethodReferences {

    public MethodReferences() {

    }

    public MethodReferences(String string1, String string2) {
        System.out.println(string1 + " " + string2);
    }

    public static String method1(String string1, String string2) {
        return string1 + " " + string2;
    }

    public String method2(String string1, String string2) {
        return string1 + " " + string2;
    }

    public String method3(String string) {
        return string;
    }

    public String method4() {
        return "Hello world from method4";
    }

}
