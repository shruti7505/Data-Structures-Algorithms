public class app{

  public static int linearSearch(int arr[], int key){
    for(int i= 0; i<arr.length; i++){
      if(arr[i] == key){
        return i;

      }
    }
    return -1;
  }

  public static void main(String[] args) {
    int arr[] ={10,20,30,40,50,60,70,80,90,100};
    int key = 35;

    int index= linearSearch(arr,key);
    if( index == -1){
      System.out.println("key is not found "+ key);
    }else
    System.out.println("index no is:"+ index);
  }
}