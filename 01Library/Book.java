public class Book{
    private string Author;
    private string Title;
    private string ISBN;

    public Book(){
    }
    public Book(string a, string t, string i){
    }

    public string Getauthor(){
	return Author;
    }
    public string Gettitle(){
	return Title;
    }
    public string Getisbn(){
	return ISBN;
    }
    public void Setauthor(string a){
	Author = a;
    }
    public void Settitle(string t){
	Title = t;
    }
    public void Setisbn(string i){
	ISBN = i;
    }
  /*    
public string toString(){
System.out.println ("+Title", "+Author", "+ISBN+");
}
  */
}
