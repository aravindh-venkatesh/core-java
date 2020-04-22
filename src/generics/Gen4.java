package generics;

public class Gen4<T extends Number> {
    private T number;

    public Gen4(T number) {
        this.number = number;
    }

    public void setNumber(T number) {
        this.number = number;
    }

    public T getNumber() {
        return number;
    }

    public double getDoubleValueOfNumber() {
        return number.doubleValue();
    }
}
