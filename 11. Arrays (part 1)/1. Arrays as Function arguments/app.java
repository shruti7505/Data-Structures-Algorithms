public class app{

  public static void update(int arr[], int nonChangable){
    nonChangable = 30;
    for(int i=0; i<arr.length; i++){
      arr[i] = arr[i] + 1;
    }
  }
  public static void main(String[] args) {
    int arr[] = {20,26,30};
    
    int nonChangable = 50;
    update(arr,nonChangable);
    System.out.println(nonChangable+ "nonchangable after passing argument");
    for(int i = 0; i<arr.length ; i++){
      System.out.println(arr[i] + "");
    }
  }
}