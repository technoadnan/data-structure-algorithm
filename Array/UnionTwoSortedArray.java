
import java.util.ArrayList;

public class UnionTwoSortedArray {
   /*
    * Input: a[] = [1, 2, 3, 4, 5], b[] = [1, 2, 3, 6, 7]
      Output: 1 2 3 4 5 6 7
      Explanation: Distinct elements including both the arrays are: 1 2 3 4 5 6 7.
      Input: a[] = [2, 2, 3, 4, 5], b[] = [1, 1, 2, 3, 4]
      Output: 1 2 3 4 5
      Explanation: Distinct elements including both the arrays are: 1 2 3 4 5.
      Input: a[] = [1, 1, 1, 1, 1], b[] = [2, 2, 2, 2, 2]
      Output: 1 2
      Explanation: Distinct elements including both the arrays are: 1 2.
    */


   public static ArrayList<Integer> findUnion(int a[], int b[]){

      ArrayList<Integer> arr = new ArrayList<>();


      // two pointer 
      int left = 0;
      int right = 0;


      while(left < a.length && right < b.length) { // two pointer's the main approach

         if (a[left] < b[right]){
            if(arr.isEmpty() || a[left] != arr.get(arr.size() - 1)) {
               arr.add(a[left]);
            }
            left++; // outer if b/c regardless of num adds in arr, it will increase from left 
         }
         else if(b[right] < a[left]){
            if(arr.isEmpty() || b[right] != arr.get(arr.size() - 1)) {
               arr.add(b[right]);
            }
            right++;
         }
         else{ // if both number are same, then we will run left side
            /* if(a[left] != arr.get(arr.size()-1) || arr.isEmpty()){ */
            // this line will throw err cuz if arr is empty then size-1 is Invalid
            // Assciativity left to right
            // arr.isEmpty() should be a left; to restrain err for empty arr
            if(arr.isEmpty() || a[left] != arr.get(arr.size()-1)){
               arr.add(a[left]);
            }
            right++;
            left++;
         }

      }


      // if one of the side become exhausted

      while(left < a.length){
         if(a[left] != arr.get(arr.size() - 1)) {
            arr.add(a[left]);
         }
         left++;
      }
      while (right < b.length) {
         if(a[right] != arr.get(arr.size() - 1)) {
            arr.add(a[right]);
         }
         right++;
      }

      return arr;
      
   }

   public static void main(String[] args) {
      int[] a = {2, 2, 3, 4, 5};
      int[] b = {1, 1, 2, 3, 4};
      ArrayList<Integer> arr = findUnion(a, b);
      for (int i : arr) System.out.println(i);  
   }
}
