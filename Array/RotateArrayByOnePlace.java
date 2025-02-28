public class RotateArrayByOnePlace {
   public static void main(String[] args) {
      int arr[] = {3,2,33,445,46,878,2,12};
      int temp = arr[0];
      for (int i = 1; i < arr.length; i++) {
         arr[i-1] = arr[i];
      }
      arr[arr.length-1] = temp;
      for (int i : arr) System.out.println(i);
   }
}
