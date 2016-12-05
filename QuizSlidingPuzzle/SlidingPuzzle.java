public class SlidingPuzzle {
  public int side;
  public int [] [] values;
  
  public SlidingPuzzle (int sideLength) {
    side = sideLength;
    values = new int[side] [side];
  }
  
  public void s(int i, int loc1, int loc2){
    values[loc1][loc2]=i;
  }
  
  public boolean isDone() {
    int counter = 1;
    boolean boo = true;
    for (int i = 0; i < side || boo == false; i++){
      for (int x = 0; x < side || boo == false; x++){
        if (values[i][x] != counter) {
          boo = false;}
        counter++;
      }
    }
    return boo;
  }
  /*
  public boolean isDone() {
    boolean boo = true;
    for (int i = 0; i < side || boo == false; i++){
      for (int x = 0; x < side - 1 || boo == false; x++){
        if (((values[i][x] + 1) != values[i][x+1]) && 
            values[i][x] != 0 && 
            values[i][x+1] != 0){
          boo = false;}
      }
    }
    return boo;
  }*/
}