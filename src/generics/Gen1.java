package generics;

/*
 Gen1 implements generic interface GenInterface<D>; its type information is specified in class generics
 i.e., in Gen1<T extends Number, D extends Double>, here D is referring to interface type
*/
public class Gen1<T extends Number, D extends Double> implements GenInterface<D> {
    private T number;

    public Gen1(T number) {
        this.number = number;
    }

    public T getNumber() {
        return number;
    }

    public void printObjectType() {
        System.out.println(number.getClass().getName());
    }

    @Override
    public void setNumber(D number) {
        this.number = (T) number;
    }
}
