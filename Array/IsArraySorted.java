public class IsArraySorted {
   public static boolean  solution(int[] arr) {
      if (arr.length < 2) {
         return false;
      }
      int min = arr[0];
      for (int i = 1; i < arr.length; i++) {
         if (arr[i] > min) {

         }
         else{
            return false;
         }
      }
      return true;
   }
   public static void main(String[] args) {
      int arr[] = {1, 2, 3, 4, 5};
      // int arr[] = {3,2,33,445,46,878,2,12};
      for (int i : arr) System.out.println(i);
      System.out.println(solution(arr));
   }
}
