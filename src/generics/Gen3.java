package generics;

/*
Extends clause of generic is not allowed to have generic information within them.
Notice this in Gen3's extends clause; diamond symbol is having concrete object types.

Below syntax is also specifies that object used in Gen3 generic specification should be,
of Gen2 or its subtype and that class should also implement GenInterface
*/
public class Gen3<D extends Gen2<Double> & GenInterface<Double> > {
    public Gen2<Double> gen2;

    public Gen3(Gen2<Double> gen2) {
        this.gen2 = gen2;
    }
}
