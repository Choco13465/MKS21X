public class CirculatingBook extends LibraryBook {
  private String currentHolder;
  private String dueDate;
  
  public CirculatingBook(String a, String t, String i, String ca){
    super(a, t, i, ca);
  }
  
  public String Getcurrentholder(){
    return currentHolder;
  }
  public String Getduedate(){
    return dueDate;
  }
  
  public String Setcurrentholder(String ch){
    currentHolder = ch;
  }
  public String Setduedate(String d){
    dueDate = d;
  }
  
  public void checkout(String patron, String due){
    Setcurrentholder(patron);
    Setduedate(due);
  }
  public void returned(){
    Setcurrentholder(null);
    Setduedate(null);
  }
  public String CirculatingStatus(){
    String s = "";
    if (Getcurrentholder() == null && Getduedate() == null){
      s = "Book available on shelves.";
    }
    else{
      s += Getcurrentholder() + Getduedate();
    }
    return s;
  }
  public String toString(){
    String s = "";
    if (Getcurrentholder() == null && Getduedate() == null) { 
      s += super.toString();
    }
    else {
      s += super.toString() + Getcurrentholder() + Getduedate();
    }
    return s;
  }
}
  
      
      
      
      
      
      
      