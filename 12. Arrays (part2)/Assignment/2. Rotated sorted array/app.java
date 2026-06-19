public class app {

  public static int rotatedSorted(int arr[] , int tar){
    int st=0 ,end = arr.length-1;
    while(st <= end){
      int mid = st +(end-st)/2;
      if(arr[mid] == tar){ //if mid is equal to target value
        return mid;
      }
      if(arr[st]<=arr[mid]){//left side is sorted
        if(arr[st]<=tar && tar <=arr[mid]){
          end = mid-1;
        }
        else{
          st = mid+1;
        }

      }
      else {//right side is sorted

        if(arr[mid]<= tar && tar<=arr[end]){
          st =mid+1;
        }
        else{
          end = mid-1;
        }
      }

    }
    return -1;
  }


  public static void main(String[] args) {
    int arr[] = { 3,4,5,7,1,2};
    int tar = 0;
    int present =rotatedSorted(arr, tar);
    if(present == -1){
      System.out.println("value not found");
    }
    else{
      System.out.println("value is present in the array");
    }
  }
}
