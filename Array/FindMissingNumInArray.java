// import java.lang.reflect.Array;
import java.util.Arrays;

public class FindMissingNumInArray {

   public static int bruteMissingNumber1(int[] nums) {
      // 👉🏻 T.c -> O(n^2)
      // 👉🏻 S.c -> O(1)
      for (int i = 0; i < nums.length; i++) {
         for (int j = 0; j <= nums.length; j++) {
            if(nums[j] != j){
               return j;
            }
         }
      }
      return 0;
   }

   public static int betterMissingNumber1(int[] nums) {
      // 🎯 Hashing 
      // 👉🏻 T.c -> O(n)
      // 👉🏻 S.c -> O(n)

      int n = nums.length;
      
      int[] hash = new int[n + 1]; // Hash array
      for (int i = 0; i < n; i++) {
         hash[nums[i]]++;
      }

      for(int i = 0; i < hash.length; i++) {
         if(hash[i] == 0) {
            return i;
         }
      }

      return -1;

      // for (int i : hash) System.out.println(i);


   }

   public static int betterMissingNumber2(int[] nums) {
      // 👉🏻 T.c -> O(n log n)
      // 👉🏻 S.c -> O(n) Merge sort 
      Arrays.sort(nums); // assuming sorting will take (n log n )
      for (int i = 0; i <= nums.length; i++) {
         if(nums[i] != i) {
            return i;
         }
      }
      return -1;
   }

   public static int optimalMissingNumber1(int[] nums){
      
      int n =  nums.length;
      
      // sum of natural number
      int sum = (n * (n+1)) / 2;
      
      int sumCurr = 0;
      for (int i = 0; i < n; i++) {
         sumCurr = sumCurr + i;
      }

      return sum - sumCurr;
   }

   // public static void optimalMissingNumber2(int[] nums){
   //    // 🎯 XOR 
   //    // 👉🏻 XOR of same num -> 0
   //    // 👉🏻 XOR of a num with 0 -> the num

   //    int xor1 = 0, xor2 = 0;
   //    int n = nums.length;

   //    for (int i = 0; i <= n; i++) {
   //       if(i < n){
   //          // xor1 = xor2 ^ nums[i];
   //          xor1 = nums[i] ^ xor1;
   //       }
   //       // xor2 = xor2 ^ i;
   //       xor2 = i^ xor2;
   //    }
   //    System.out.println(xor1^xor2);

   //    // System.out.println(xor1);
   //    // System.out.println(xor2);

   // }

   public static void optimalMissingNumber2(int[] nums){
         // 🎯 XOR 
         // 👉🏻 XOR of same num -> 0
         // 👉🏻 XOR of a num with 0 -> the num

      int xor1 = 0, xor2 = 0;
      int n = nums.length;

      for (int i = 0; i < nums.length+1; i++) {
         if(i != nums.length){   
            xor1 = nums[i] ^ xor1; // 1^0 -> 1
            // 1^2^..N
         }
         xor2 = i ^ xor2; // 1^2..N+1
      }
      System.out.println(xor1^xor2);

   }
  
   public static void main(String[] args) {
      int arr[] = {0, 1, 3, 4};
      // System.out.println(betterMissingNumber1(arr));
      // System.out.println(betterMissingNumber2(arr));
      optimalMissingNumber2(arr);

   }
}
