import java.util.*;

public class Barcode// implements Comparable<Barcode>{
{
    private String _zip;
    private int _checkDigit;

    public Barcode(String zip){
      if (zip.length() != 5){
        throw new IllegalArgumentException("zip is not the correct length");
      }
      _zip = zip;
    }
    public static String checkSum(String zip){
      int zel = 0;
      for (int i = 0; i < zip.length(); i++){
        zel += zip.charAt(i);
      }
      zel = zel % 10;
      return zel + "";
    }
    
    /*   public void errortest(String zip){
      if (zip.length() < 5 || zip.length() > 5) {
        throw new IllegalArguementException("zip is not the correct length");
      }
      try {
        int a = 0;
        for (int i = 0; i < zip; i++){
          a = (int)(zip.substring(i))
        }
      }
      catch {IllegalArguementException e){
        e.printStackTrace();
      }
      }
      
        
    }
    */
    /*
    public statc int toCode(String zip){
      errortest(zip);
      //use if switch statements for zip --> code
    }
*/    
/*    public static String toZip(String code){
      errortestcode(code);
      for (int i = 1; i < code.length() - 6; i += 5){
   if (code.substring(i,i+5) 
*/    
    //public String toString(){}
    
/*    public int compareTo(String zip, String zip2){
      int temp = 0;
      for (int i = 0; i < zip.length() || temp != 0; i++){
        //find substring, ssubtract, set as variable, return if temp != 0
      }
      return temp;
    }
*/    
}
