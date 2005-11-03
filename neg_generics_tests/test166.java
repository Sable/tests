public class test166 <T extends Iterable>{
	class Mtest166<U extends Iterable> {
	}
}
class Stest166 extends test166<Thread>.Mtest166<Object> {
	Stest166(test166 x){
		x.super();
	}
}
