import java.util.Arrays;

public class RoatateArrayByNPlace {
   public static void reverse(int[] arr, int left, int right){
      // 🎯 two pointer
      
      while(left<= right){ // two pointer
         int temp = arr[left];
         arr[left] = arr[right];
         arr[right] = temp;
         right--;
         left++;
      }

   }

   
   public static void BruteForceSolution(int[] nums, int k){

      // 🎯 brute force 
      // 👉🏻 store into temp arr for k elements
      // 👉🏻 shift elements that are occur after k at beginning 
      // 👉🏻 shift elements of temp after kth index

      // nums = [1,2,3,4,5,6,7], k = 3
      int[] temp = new int[k];
      int n = nums.length;
      k = k % n;
      System.arraycopy(nums, 0, temp, 0, k);
      // equlivant to 
      // for(int i = 0; i < k; i++) temp[i] = nums[i];
      for (int i = k; i < n; i++) {
         nums[i-k] = nums[i];
      }
      for(int i = 0; i < k; i++) {
         nums[n - k + i] = temp[i];
      }
      System.out.println(Arrays.toString(nums));

   }

   public static void optimalSolution(int[] nums, int k){
      // 🎯 Optimal Solution 
      // 👉🏻 reverse an array for 0 -> k
      // 👉🏻 reverse an array for k -> n
      // 👉🏻 reverse the entire array

      int n = nums.length;
      k = k % n;


      // left by k
      reverse(nums, 0, k - 1);
      reverse(nums, k, n - 1);
      reverse(nums, 0, n - 1);

      // right by k
      // reverse(nums, 0, n-1);
      // reverse(nums, 0, k-1);
      // reverse(nums, k, n-1);

   }

   public static void main(String[] args) {
      int[] nums = {1,2,3,4,5,6,7};
      optimalSolution(nums,2); // [3, 4, 5, 6, 7, 1, 2]
      for (int i : nums) System.out.println(i);

   }
}
