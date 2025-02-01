public class InsertionSort {
   public void sort(int arr[]){
      int n = arr.length;

      for (int i = 1; i < n; i++) {
         int key = arr[i];
         int j = i - 1;

         while (j >= 0 && arr[j] > key) {
            arr[j+1] = arr[j];
            j = j - 1;
         }
         arr[j+1] = key;
      }
   }

   public static void main(String[] args) {
      int[] arr = {3,43,432,54,435};
   
      InsertionSort ob = new InsertionSort();
      ob.sort(arr);
   
      for (int i : arr) {
         System.out.println(i);
      }
      
   }
}
   


// public class InsertionSort {
//    public void sort(int arr[]) {
//       int n = arr.length;

//       for (int i = 1; i < n; i++) {
//          int key = arr[i];
//          int j = i - 1;

//          while (j >= 0 && arr[j] > key) {
//             arr[j + 1] = arr[j];
//             j = j - 1;
//          }
//          arr[j + 1] = key;
//       }
//    }

//    public static void main(String[] args) {
//       int[] arr = {3, 43, 432, 54, 435};

//       InsertionSort ob = new InsertionSort();
//       ob.sort(arr);

//       // Print sorted array
//       for (int i : arr) {
//          System.out.print(i + " ");
//       }
//    }
// }