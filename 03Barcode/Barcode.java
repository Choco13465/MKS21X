import java.util.*;

public class Barcode// implements Comparable<Barcode>{
{
    private String _zip;
    private int _checkDigit;
    public String _code;

//constructor
    public Barcode(String zip){
      testZip(zip);
      _zip = zip;
    }
    
//exceptions    
    public static void testZip(String zip){
      if (zip.length() != 5){
        throw new IllegalArgumentException("zip is not the correct length");
      }
      for (int i = 0; i < zip.length(); i++){
        if (zip.charAt(i) < '0' || zip.charAt(i) > '9'){
          throw new IllegalArgumentException("zip contains a non digit");
        }
      }
    }
    
    public static void testCode(String code){
      if (code.length() != 32){
        throw new IllegalArgumentException("code is not the correct length");
      }
      for (int i = 0; i < code.length(); i++){
        if (code.charAt(i) != '|' || code.charAt(i) != ':'){
          throw new IllegalArgumentException("non barcode characters were used");
        }
      }
      if (code.charAt(0) != '|' || code.charAt(31) != '|'){
        throw new IllegalArgumentException("guard rails are incorrect");
      }
      zel = "" + code.substring(1, 30);
      for (//unfinished
    }
    
//methods
    public static String checkSum(String zip){
      testZip(zip);
      int zel = 0;
      for (int i = 0; i < zip.length(); i++){
        zel += zip.charAt(i);
      }
      zel = zel % 10;
      return zel + "";
    }
    
    public static String toString(String zip){
      testZip(zip);
      String zel = "";
      zel = zel + zip + checkSum(zip) + " " + toCode(zip);
      return zel;
    }
       
    public static String toCode(String zip){
      testZip(zip);
      String zel = "|";
      for (int i = 0; i < zip.length(); i++){
        switch(zip.charAt(i)-'0'){
          case 1: zel += ":::||";
          break;
          case 2: zel += "::|:|";
          break;
          case 3: zel += "::||:";
          break;
          case 4: zel += ":|::|";
          break;
          case 5: zel += ":|:|:";
          break;
          case 6: zel += ":||::";
          break;
          case 7: zel += "|:::|";
          break;
          case 8: zel += "|::|:";
          break;
          case 9: zel += "|:|::";
          break;
          case 0: zel += "||:::";
          break;
        }
      }
      zel += "|";
      return zel;
    }
    
/*    public static String toZip(String code){
      errortestcode(code);
      for (int i = 1; i < code.length() - 6; i += 5){
   if (code.substring(i,i+5) 
*/   
    
    /*
    public int compareTo(String zip, String zip2){
      int temp = 0;
      for (int i = 0; i < zip.length() || temp != 0; i++){
        //find substring, ssubtract, set as variable, return if temp != 0
      }
      return temp;
    }
    */
}
