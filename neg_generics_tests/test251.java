class test251<T> {
    T getT() {
        return null;
    }
    
    void m() {
        String s= new test251<String>.getT();
    }
}
