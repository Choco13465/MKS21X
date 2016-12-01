public class Book{
    private String Author;
    private String Title;
    private String ISBN;

    public Book(){
    }
    public Book(String a, String t, String i){
    }

    public String Getauthor(){
 return Author;
    }
    public String Gettitle(){
 return Title;
    }
    public String Getisbn(){
 return ISBN;
    }
    public void Setauthor(String a){
 Author = a;
    }
    public void Settitle(String t){
 Title = t;
    }
    public void Setisbn(String i){
 ISBN = i;
    }
//    public String toString(){
// System.out.println ("Title", "+Author", "+ISBN+");
//    }
}
