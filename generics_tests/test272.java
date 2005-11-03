public class test272 {
	public static <T> void myMethod(final List<? extends File> fileList) {
		Collections.sort(fileList, new Comparator<File>(){
			public int compare(File f1, File f2) { return 0; }
		});
	}
}

class List<T> {}
class File {}
interface Comparator<T> {}
class Collections {
	static <T> void sort(List<T> list, Comparator<? super T> c) {}
}