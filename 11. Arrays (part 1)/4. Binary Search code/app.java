public class app {

  public static int binarySearch(int arr[] ,int key){

    int start = 0 , end = arr.length-1;
    while(start<= end){
      int mid = (start+end)/2;
      
      if(arr[mid] == key){
        return mid;
      } else if(arr[mid] <= key)//left 
      {
        start=mid+1;
      }else //right
      {
        end = mid-1;
      }
    }
    return -1;
  }
  public static void main(String[] args) {
    int arr[] = {2,7,9,15,30,40,50,55,60};
    int key  = 30;
    int index= binarySearch(arr, key);
    if(index== -1){
      System.out.println("key is not found"+key);
    }
    else{
      System.out.println("Key is successfully found "+ index);
    }
    
  }
}
