public class Sorts{
  public static String name(){
    return "09.Wang.Emily";
  }
  
  
  public static void selectionSort(int[] data){
    int zel = 0;
    for (int i = 0; i < data.length-1; i++){
      for (int x = i+1; x < data.length; x++){
        if (data[i] > data[x]){
          zel = data[i];
          data[i] = data[x];
          data[x] = zel;
        }
      }
    }
  }
  
  public static void insertionSort(int[] data){
    int zel = data[0];
    for (int i = 1; i < data.length-1; i++){
      zel = data[i+1];
      for (int x = i+1; x>-1; x--){
        if (data[i] < data[x]){
          data[x] = zel;
        }
        else {
          data[x] = data[i];
        }
      }
    }
  }
          
}