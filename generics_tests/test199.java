import java.util.List;
public class test199 {
	List<? super Number> wsn= null; // Contravariance
	List<? super Integer> wsi= wsn; // should work!
}
