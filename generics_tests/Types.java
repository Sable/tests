public class C<T extends AX & I1 & I2>{

    T t;
    C(T t){
        this.t = t;
    }

    void foo(){
        C<?> w = new C<BX>(new BX());
        w.bar();
    }
}
class AX{

    void bar(){}
}
class BX extends AX implements I1, I2{}
interface I1{}
interface I2{}
