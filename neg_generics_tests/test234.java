public class test234<T extends Number> {
    T[] array;
    test234(int s) {
        array = (T[]) new Number[s];   // Unnecessary cast from Number[] to T[]
        array = new Number[s];   // Type mismatch: cannot convert from Number[] to T[]
     }
}
