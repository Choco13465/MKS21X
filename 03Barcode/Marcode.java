public class Marcode {
  public static void main (String [] args) {
    Barcode s = new Barcode("00010");
    
    System.out.println (s.toCode("77777"));
    System.out.println (s.toZip("|||:::|::|::|::|:|:|::::|||::|:|"));
    System.out.println (s.toString("77777"));
    System.out.println (s.compareTo("01890", "01890"));
    System.out.println (s.compareTo("00000", "90001"));
  }
  
}