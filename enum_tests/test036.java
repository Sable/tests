public enum test036 {
    PLUS {
        double eval(double x, double y) { return x + y; }
    };

    // Perform the arithmetic test036 represented by this constant
    abstract double eval(double x, double y);
}