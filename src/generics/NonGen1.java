package generics;

public class NonGen1 {
    private double d;

    public <T extends Number> NonGen1(T number) {
        d = number.doubleValue();
    }

    public <T extends Number> void setD(T number) {
        this.d = number.doubleValue();
    }

    public double getD() {
        return d;
    }
}
