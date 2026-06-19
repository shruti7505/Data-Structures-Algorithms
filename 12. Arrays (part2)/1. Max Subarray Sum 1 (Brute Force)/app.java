public class app {
  public static void SubarraySum(int arr[]){
    int curr = 0;
    int maxSum = Integer.MIN_VALUE;
    for(int i= 0; i<arr.length ; i++){
      int start = i;
      for(int j=i ; j<arr.length ; j++){
        int end = j ;
        curr = 0;
        for(int k= start; k<= end ; k++){
          //subArray sum
          curr += arr[k];
        }
        System.out.println("The current sum of the subarray is :" + curr);
        if(maxSum <curr){
          maxSum = curr ; 
        }
      }
    }
    System.out.println("The maximum sum of the subarray is : " + maxSum);
  }
  public static void main(String[] args) {
    int arr[] = {2,4,6,8,10};
    SubarraySum(arr);
  }
}
// time complaxity of this approach is O(n^3) but this approach is very simple or basic