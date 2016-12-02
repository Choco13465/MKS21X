public class Book{
    private String Author;
    private String Title;
    private String isbn;

    public Book(){
    }
    public Book(String a, String t, String i){
      Setauthor(a);
      Settitle(t);
      Setisbn(i);
    }

    public String Getauthor(){
 return Author;
    }
    public String Gettitle(){
 return Title;
    }
    public String Getisbn(){
 return isbn;
    }
    public void Setauthor(String a){
 Author = a;
    }
    public void Settitle(String t){
 Title = t;
    }
    public void Setisbn(String i){
 isbn = i;
    }
 
  public String toString(){
    String s = "" + Gettitle() + ", " + Getauthor() + ", " + Getisbn();
    return s;
  }

}
