package generics;

public class Gen2<D extends Double> implements GenInterface<D> {
    private D number;

    // @Override
    public void setNumber(D number) {
        this.number = number;
    }

    public double getNumber() {
        return number;
    }
}
