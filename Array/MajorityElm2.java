
import java.util.ArrayList;
import java.util.List;

public class MajorityElm2 {

   public List<Integer> majorityElement(int[] nums) {
      // maj element 1 
      // (n / 2) -> majority will be 1 

      // (n / 3 ) - > majority will be 2 
      // (n / k) - > majority will be k - 1
      int maj1 = Integer.MAX_VALUE;
      int cnt1 = 0;

      int maj2 = Integer.MAX_VALUE;
      int cnt2 = 0;

      for (int num : nums) {
         if (num == maj1) {
            cnt1++;
         } else if (num == maj2) {
            cnt2++;
         } else if (cnt1 == 0) {
            maj1 = num;
            cnt1 = 1;
         } else if (cnt2 == 0) {
            maj2 = num;
            cnt2 = 1;
         } else {
            cnt1--;
            cnt2--;
         }
      }

      // for verifications
      cnt1 = 0;
      cnt2 = 0;

      for (int num : nums) {
         if (num == maj1) {
            cnt1++;
         } else if (num == maj2) {
            cnt2++;
         }
      }

      // adding the answers 
      // S.C is O(1) here since we know the most majority will be 2
      List<Integer> result = new ArrayList<>();
      int n = nums.length;
      if (cnt1 > (n / 3)) {
         result.add(maj1);
      }
      if (cnt2 > (n / 3)) {
         result.add(maj2);
      }

      return result;

   }
}
