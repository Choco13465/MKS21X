public class Barcode implements Comparable<Barcode>{
    private String _zip;
    private int _checkDigit;

    public Barcode(String zip){
      errortest(zip);
      _zip = zip;
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
    public void errortest(String zip){
      if (zip.length() < 5 || zip.length() > 6) {
        throw new IllegalArguementException("zip is not the correct length");
      }
     // 4 more exceptions to throw 
    }
    public statc int toCode(String zip){
      errortest(zip);
      //use if switch statements for zip --> code
    }
    //public String toString(){}
    public int compareTo(String zip, String zip2){
      int temp = 0;
      for (int i = 0; i < zip.length() || temp != 0; i++){
        //find substring, ssubtract, set as variable, return if temp != 0
      }
      return temp;
    }
    //more methods...?
}
