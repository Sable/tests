package name.panitz.aufgaben;
public class Bubble {
  public static <at> void bubbleSort(at[] ar,Smaller<at> rel){
    boolean toBubble = true;
    int end=ar.length;
    while (toBubble){ 
      toBubble = bubble(ar,rel,end);
      end=end-1;
    }
  }

  static <at> boolean bubble(at[] ar,Smaller<at> rel,int end){
    boolean result = false;
    for (int i=0;i<end;i=i+1){
      try {
        if (!rel.le(ar[i],ar[i+1])){
          at o = ar[i];
          ar[i]=ar[i+1];
          ar[i+1]=o;
          result=true;
        }
      }catch (ArrayIndexOutOfBoundsException _){}
    }
    return result;
  }  
}