public class PivotArray {
   public static int[]  pivotArr(int[] nums, int pivot){
      int left = 0;
      int right = nums.length;

      int i = 0;
      while (i <= right) {
         if(nums[i] < pivot) {
            int temp = nums[i];
            nums[i] = nums[left];
            nums[left] = temp;
            left++;  
         }
         i++;
      }
      // for (int j : nums) System.out.println(j);
      while (i >= left) {
         if(nums[i] > pivot) {
            int temp = nums[i];
            nums[i] = nums[right];
            nums[right] = temp;
            right--;  
         }
         i--;
      }

      return nums;


   }
   public static void main(String[] args) {
      int nums[] = {9,12,5,10,14,3,10};
      int pivot = 10;
      pivotArr(nums, pivot);
   }
}