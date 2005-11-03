public class test183 <E> {
  public test183() {
  	new E();
  	new E() {
  		void perform() {
  			run();
  		}
  	}.perform();
  }
}
