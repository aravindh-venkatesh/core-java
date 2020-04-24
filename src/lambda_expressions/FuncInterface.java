package lambda_expressions;

/*
Functional interface can have only one method.
Lambda works on functional interface.
*/

public interface FuncInterface<T, V, S> {
    S method(T ob1, V ob2);
}
