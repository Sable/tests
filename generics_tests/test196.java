public class test196 {
 public static void main (String[] args) {
  final String val = (args == null||args.length==0 ? "SUCC" : args[0]) + "ESS";
  class AllegedBoundMismatch<E2 extends SuperI<E2>> {
   String field = val;
  }
  System.out.println(new Object() {
   AllegedBoundMismatch<SubI<Q>> trial = new AllegedBoundMismatch<SubI<Q>>();
  }.trial.field);
 }
}
class Q {}
interface SubI<Q> extends SuperI<SubI<Q>> {}
interface SuperI<Q> {}