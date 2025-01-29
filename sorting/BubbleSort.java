public class BubbleSort {
   public static void main(String[] args) {
      int[] arr = {3,434,534,5,435};
      // int min = arr[0];
      for (int i = 0; i < arr.length - 2; i++) {
         if (arr[i] > arr[i+1]) {
            int temp = arr[i+1];
            arr[i+1] = arr[i];
            arr[i] = temp; 
         }
      }
      for(int i: arr){
         System.out.println(i);
      }
   }
}
