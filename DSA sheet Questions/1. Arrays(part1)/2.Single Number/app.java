public class app{
  public static int singleNumber(int nums[]){
    int ans = 0;
    for(int num : nums){
      ans ^= num;
    }
    return ans;
  }
  public static void main(String[] args) {
    int nums[] = {2,2,5,6,7,3,5,7,3};
    System.out.println("single no is: "+singleNumber(nums));
  }
}