import java.util.*;

public class ReferenceBook extends LibraryBook{
  private String collection;
  
  public ReferenceBook(String a, String t, String i, String ca, String co){
    super(a, t, i, ca);
    Setcollection(co);
  }
  
  public String Getcollection(){
    return collection;
  }
  public void Setcollection(String co){
    collection = co;
  }
  public void checkout(String patron, String due){
    throw new IllegalArgumentException("Cannot check out a reference book!");
  }
  public void returned(){
    throw new IllegalArgumentException("Reference book could not have been checked out -- return impossible.");
  }
  public String circulatingStatus() {
    throw new IllegalArgumentException("non-circulating reference book");
  }
  public String toString() {
    String s = "" + super.toString() + Getcollection();
    return s;
  }
}
  