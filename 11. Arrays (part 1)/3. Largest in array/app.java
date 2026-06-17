public class app {
  public static int[] largestNo(int arr[]){

    int lagrest = Integer.MIN_VALUE;
    int smallest = Integer.MAX_VALUE; 
    int index = -1;
    for(int i = 0 ; i< arr.length; i++){
      if(lagrest <= arr[i]){
        lagrest = arr[i];
        index = i;
      }
    }
    for(int i=0; i<arr.length; i++){
      if(smallest >= arr[i]){
        smallest = arr[i];
      }
    }
    return new int[]{lagrest ,index, smallest} ;
  }
  public static void main(String[] args) {
    int arr[] = { 2,5,35,20,5,3,49,20};

    int[] result =  largestNo(arr);
    System.out.println("Largest no is :" + result[0]);
    System.out.println("Index no is:" + result[1]);
    System.out.println("Smallest no is:"+ result[2]);
  }
}
