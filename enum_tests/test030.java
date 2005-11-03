public enum test030 {
    PLUS {
        double eval(double x, double y) { return x + y; }
    };

    // Perform the arithmetic test030 represented by this constant
    abstract double eval(double x, double y);
}