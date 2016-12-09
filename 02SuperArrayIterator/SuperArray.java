import java.util.Iterator;

public class SuperArray implements Iterable<String>{
    private String[] a;
 
    public SuperArray(){}
    
    public int get(int n) {
      return a[n];
    }
}