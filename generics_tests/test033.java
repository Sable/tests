public class test033<T> {
     Atest033 ax = new Atest033();
     Atest033 ax2 = ax.p;
     Atest033 ax3 = new Atest033<String>();
}

class Atest033 <P> {
    Atest033<P> p;
}
