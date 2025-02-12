public class SecondLargestNumWithoutSorting {

   public static int solution2(int[] arr) {
      int small = Integer.MIN_VALUE;
      int secondSmall = Integer.MIN_VALUE;

      for (int i = 0; i < arr.length; i++) {
         if (arr[i] < secondSmall) {
            secondSmall = small;
            small = arr[i];
         } else if (arr[i] < secondSmall && arr[i] != small) {
            secondSmall = arr[i];
         }
      }

      return secondSmall;
   }

   // https://www.youtube.com/watch?v=eIm9ODShmCI
   // easier to read 
   // T.C -> o(n)
   // S.C -> o(n)
   public static int solution(int[] arr) {
      if (arr.length < 1) {
         return arr[arr.length - 1];
      }

      int max1 = Integer.MIN_VALUE, max2 = Integer.MIN_VALUE;

      if (arr[0] > arr[1]) {
         max1 = arr[0];
         max2 = arr[1];
      } else if (arr[1] > arr[0]) {
         max1 = arr[1];
         max2 = arr[0];
      }

      for (int i = 2; i < arr.length; i++) {
         if (arr[i] > max1) {
               max2 = max1;
               max1 = arr[i];
         // arr[i] != max1 
         // 10,5,10 -> max2 becomes 10 if arr[i] != max1 is not used
         } else if (arr[i] > max2 && arr[i] != max1) {
               max2 = arr[i];
         }

      }
      // 10, 10, 10
      if (max2 == Integer.MIN_VALUE || max1 == max2) {
         return -1;
      }

      return max2;
   }

   public static void main(String[] args) {
      // int[] arr = {3,43,443,4,45,7,6,56};
      // int[] arr = {10, 5, 10};
      int[] arr = {10, 10, 10};
      int a = solution(arr);
      int b = solution2(arr);
      System.out.println(b);

   }
}
