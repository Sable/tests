import java.util.Iterator;
import java.util.Set;

public class test159<E> {
   private TreeNode<E> root;

   public void doSomething() {
      for (TreeNode<E> child : root.children()) {
         // root.children() should work??
      }
   }

   public void doSomethingElse() {
      for (Iterator<TreeNode<E>> it = root.children().iterator(); it.hasNext();) {
         // this also should work
      }
   }
}

class TreeNode<E> {
   private Set<TreeNode<E>> children;
   
   public Set<TreeNode<E>> children() {
      return children;
   }
}
