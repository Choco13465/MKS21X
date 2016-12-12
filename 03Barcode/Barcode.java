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
      for (int i = 1; i < code.length() - 6; i += 5){
        if (code.substring(i,i+5).equals(":::||") == false ||
            code.substring(i,i+5).equals("::|:|") == false ||
            code.substring(i,i+5).equals("::||:") == false ||
            code.substring(i,i+5).equals(":|::|") == false ||
            code.substring(i,i+5).equals(":|:|:") == false ||
            code.substring(i,i+5).equals(":||::") == false ||
            code.substring(i,i+5).equals("|:::|") == false ||
            code.substring(i,i+5).equals("|::|:") == false ||
            code.substring(i,i+5).equals("|:|::") == false ||
            code.substring(i,i+5).equals("||:::") == false){
          throw new IllegalArgumentException("encoded ints are invalid");
        }
      }
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
    
    public static String toZip(String code){
      testCode(code);
      String zel = "";
      for (int i = 1; i < code.length() - 6; i += 5){
          switch(code.substring(i,i+5)){
            case ":::||": zel += 1;
            break;
            case "::|:|": zel += 2;
            break;
            case "::||:": zel += 3;
            break;
            case ":|::|": zel += 4;
            break;
            case ":|:|:": zel += 5;
            break;
            case ":||::": zel += 6;
            break;
            case "|:::|": zel += 7;
            break;
            case "|::|:": zel += 8;
            break;
            case "|:|::": zel += 9;
            break;
            case "||:::": zel += 0;
            break;
          }
       }
      if (checkSum(zel.substring(0, zel.length())) != zel.substring(zel.length()-1)){
        throw new IllegalArgumentException("checksum is invalid");
      }
      return zel;
    }
       
    public static int compareTo(String zip, String zip2){
      testZip(zip);
      testZip(zip2);
      int temp = 0;
      for (int i = 0; i < zip.length(); i++){
        temp = zip.charAt(i) - zip2.charAt(i);
        if (temp != 0) {
          break;
        }
      }
      return temp;
    }
}




























