public class Marcode {
  public static void main (String [] args) {
    Barcode s = new Barcode("01010");
    
    System.out.println (s.checkSum("01010"));
  }
  
}