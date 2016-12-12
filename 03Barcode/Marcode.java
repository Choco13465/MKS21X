public class Marcode {
  public static void main (String [] args) {
    Barcode s = new Barcode("00010");
    
    System.out.println (s.toCode("01234"));
    System.out.println (s.toString("01234"));
    System.out.println (s.toCode("12345"));
    System.out.println (s.toString("12345"));
    System.out.println (s.compareTo("00000", "90001"));
  }
  
}