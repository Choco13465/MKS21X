public class Barcode implements Comparable<Barcode>{
    private String _zip;
    private int _checkDigit;

    public Barcode(String zip){
      errortest(zip);
      _zip = zip;
    }
    
    
    public void errortest(String zip){
      if (zip.length() < 5 || zip.length() > 5) {
        throw new IllegalArguementException("zip is not the correct length");
      }
      try {
        int a = 0;
        for (int 1 = 0; i < zip; i++){
          a = (int)(zip.substring(i))
        }
      }
      catch {//???
      }
      
        
    }
    
    private int CheckSum(){
      int check = -1;
      int zel = 0;
      for (int i = 0; i < _zip.length; i++){
        zel +=  _zip.substring(i);
      }
      check = zel % 10;
      _checkDigit = check;
    }

    public statc int toCode(String zip){
      errortest(zip);
      //use if switch statements for zip --> code
    }
    
    public static String toZip(String code){
      errortestcode(code);
      for (int i = 1; i < code.length() - 6; i += 5){
        if (code.substring(i) == |) {
          if (code.substring(i+1) == |{
            if code.substring
    
    public String toString(){}
    
    public int compareTo(String zip, String zip2){
      int temp = 0;
      for (int i = 0; i < zip.length() || temp != 0; i++){
        //find substring, ssubtract, set as variable, return if temp != 0
      }
      return temp;
    }
    
}
