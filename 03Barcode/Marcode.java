public class Marcode {
  public static void main (String [] args) {
    Barcode s = new Barcode("00010");
    
    System.out.println (s.toCode("77777"));
    System.out.println (s.toString("77777"));
    System.out.println (s.checkSum("01890"));
  }
  
}