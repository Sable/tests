public class test184 <E extends String> {
  public test184() {
  	new E();
  	new E() {
  		void perform() {
  			run();
  		}
  	}.perform();
  }
}
