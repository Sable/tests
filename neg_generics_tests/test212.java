interface K1<A> { 
        public <B extends A> void kk(K1<B> x); 
} 
 
class K2<C> implements K1<C> { 
        public <D extends C> void kk(K1<D> y) { 
                System.out.println("K2::kk(" + y.toString() + ")"); 
        } 
} 
 
// --------------------------------------------------- 
 
interface L1<E> { 
        public void ll(L1<? extends E> a); 
} 
 
class L2<KK> implements L1<KK> { 
        public void ll(L1<? extends KK> b) { 
                ll2(b); 
        } 
 
        private <LL extends KK> void ll2(L1<LL> c) { 
                System.out.println("L2::ll2(" + c.toString() + ")"); 
        } 
} 
 
// --------------------------------------------------- 
 
interface M1<H> { 
        public void mm(M1<? extends H> p); 
} 
 
class M2<I> implements M1<I> { 
        public <J extends I> void mm(M1<J> q) { 
                System.out.println("M2::mm(" + q.toString() + ")"); 
        } 
} 
 
// =================================================== 
 
class test212test212            { public String toString() { return "test212test212"; } } 
class YY extends test212test212 { public String toString() { return "YY"; } } 
class ZZ extends YY { public String toString() { return "ZZ"; } } 
 
// --------------------------------------------------- 
 
public class test212 { 
        public static void main(String arg[]) { 
                goK(new K2<YY>()); 
                goL(new L2<YY>()); 
                goM(new M2<YY>()); 
        } 
 
 
        public static void goK(K1<YY> k) { 
                // k.kk(new K2<test212test212>()); // Would fail 
                k.kk(new K2<YY>()); 
                k.kk(new K2<ZZ>()); 
        } 
 
 
        public static void goL(L1<YY> l) { 
                // l.ll(new L2<test212test212>()); // Would fail 
                l.ll(new L2<YY>()); 
                l.ll(new L2<ZZ>()); 
        } 
 
 
        public static void goM(M1<YY> m) { 
                // m.mm(new M2<test212test212>()); // Would fail 
                m.mm(new M2<YY>()); 
                m.mm(new M2<ZZ>()); 
        } 
}