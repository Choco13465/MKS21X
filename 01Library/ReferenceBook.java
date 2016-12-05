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
  public void checkout(String patron, String due) throws RefBkException{
    throw new RefBkException("Cannot check out a reference book!");
  }
  public void returned() throws RefBkException {
    throw new RefBkException("Reference book couldnot have been checked out -- return impossible.");
  }
  public String circulatingStatus() {
    System.out.println ("non-circulating reference book");
  }
  public String toString() {
    String s = "" + super.toString() + Getcollection();
    return s;
  }
}
  