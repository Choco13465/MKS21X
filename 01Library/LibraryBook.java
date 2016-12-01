abstract class LibraryBook extends Book implements Comparable<LibraryBook>{
  private String callNumber;
    
  public LibraryBook (String a, String t, String i, String due){
    super();
  }
  
  public String Getcallnumber(){
    return callNumber;
  }
  public void SetcallNumber(String c){
    callNumber = c;
  }
  
  abstract void checkout(String patron, String due);
  abstract void returned();
  abstract String circulationStatus();
  
  public int compareTo(String c1, String c2){
    if (c1 == c2) {return 0;}
    else {
      if (c1 < c2) {return -1;}
      else {return 1;}}
  }
  
/*  
 * public String toString(){
 * super();
 * //additional stuff
 * }
 */
}