
public class LowerBoundSearch {

   public static int lowerBound(int[] arr, int n, int x) {
      // Write your code here
      int low = 0;
      int high = n;
      int res = n;

      while (low <= high) {
         int mid = (low+high) / 2;
         if(arr[mid] >= x) {
            res = mid;
            high = mid - 1;

         }
      }
      return res;
   }

   public static void main(String[] args) {
      int[] arr = {1, 2, 2, 3};

      System.out.println(lowerBound(arr, 4, 2));
   }
}
