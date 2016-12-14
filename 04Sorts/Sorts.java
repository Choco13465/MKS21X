public class Sorts{
  public static String name(){
    return "09.Wang.Emily";
  }
  
  
  public static void selectionSort(int[] data){
    int zel = data[0];
    int lin = 0;
    /*
    for (int i = 1; i < data.length; i++){
      if (zel > data[i]){
        zel = data[1];
        lin = i;
      }
    }
    */
    for (int i = 0; i < data.length-1; i++){
      for (int x = i+1; x < data.length; x++){
        if (data[i] > data[x]){
          zel = data[x];
          lin = x;
        }
      }
      data[lin] = data[i];
      data[i] = zel;
    }
  }
}