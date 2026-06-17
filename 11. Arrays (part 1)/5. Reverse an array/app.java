public class app {
  public static void Reverse(int arr[]){
     int first = 0, last= arr.length-1;
     while(first<last){
      int temp = arr[first];
      arr[first] = arr[last];
      arr[last] = temp;
       first++;
       last--;
     }
  }

  public static void main(String[] args) {
    int arr[] = {2,44,54,4,5,7,9};
     Reverse(arr);
     for(int i=0; i<arr.length;i++){
      System.out.println(arr[i]+"");
     }

  }
}
