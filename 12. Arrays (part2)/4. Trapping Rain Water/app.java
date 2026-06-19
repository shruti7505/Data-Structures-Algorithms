public class app {
  public static int TrappedRainWater(int arr[]){
    int n = arr.length;

    //calculate left max boundary array
    int leftmax[] = new int[n];
    leftmax[0] = arr[0];
    for(int i=1; i<n ;i++){
      leftmax[i] = Math.max(arr[i] , leftmax[i-1]);
    } 

    //calculate right max boundary array
    int rightMax[] = new int[n];
    rightMax[n-1] = arr[n-1];
    for(int i=n-2 ; i>= 0; i--){
      rightMax[i] = Math.max(arr[i], rightMax[i+1]);
    }
     int trappedWater = 0;
    //loop
    for(int i=0 ; i<n ; i++){
      //waterlevel calculate
      int waterlevel = Math.min(leftmax[i],rightMax[i]);

      
    //trapped rainwater calculate
    trappedWater += waterlevel - arr[i];
    }
    return trappedWater ;
    
  }

  public static void main(String[] args) {
    int arr[] = {4,2,0,6,3,2,5};
    System.out.println("trapped water is : "+TrappedRainWater(arr));

  }
}
