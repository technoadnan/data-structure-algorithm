
import java.util.ArrayList;

public class MergeTwo2DArrayBySumming {
   public static int[][] sum2(int[][] nums1, int[][] nums2){
      int left = 0, right = 0;
      ArrayList<int[]> arr = new ArrayList<>();

      // System.out.println(nums1[left][0]);
      // System.out.println(Arrays.asList(nums1[left]));

      // for (int i = 0; i < nums1.length; i++) {
      while (left < nums1.length && right < nums2.length) {
         if(nums1[left][0] < nums2[right][0]) {
            // int[] temp = {nums1[left][0],(nums1[left][1] + nums2[right][1])}; 
            // System.out.println();
            arr.add(nums1[left]);
            left++;
         }
         else if(nums1[left][0] > nums2[right][0]){
            arr.add(nums2[right]);
            right++;
         }
         else{
            int[] temp = {nums1[left][0],(nums1[left][1] + nums2[right][1])}; 
            arr.add(temp);
            left++;
            right++;
         }
      }

      while (left < nums1.length) {
         arr.add(nums1[left]);
         left++;
      }


      while(right < nums2.length) {
         arr.add(nums2[right]);
         right++;
      }

      return arr.toArray(new int[arr.size()][]);

      // System.out.println(arr);
      // int[][] result = new int[arr.size()][2];
      // for (int i = 0; i < arr.size(); i++) {
      //    result[i] = arr.get(i);
      // }
      // return result;
      
   }
   
   public static void main(String[] args) {
      
      int[][] nums1 = new int[][]{{2,4},{3,6},{5,5}};
      int[][] nums2 = new int[][]{{1,3},{4,3}};

      int[][] n = sum2(nums1, nums2);
      for (int[] i : n) System.out.println(i[0] + " " + i[1]);
      

   }
}
