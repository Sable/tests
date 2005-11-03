@interface test026 {
    int id () default 10L; 
    int[] ids() default { 10L };
    Class cls() default new Object();
}
