// {34, 7, 23, 32, 5, 62, 23, 1, 7}
// {34, 7, 23, 32, 5, 62, 23, 1, 7}
// {34, 5, 23, 32, 1, 62, 23, 7, 7}


public class QuickSort {
   
   public static int partition(int[] arr, int low, int high) {
      int pivot = arr[high];
      int partitionIndex = low;

      for(int i = low; i < high; i++){

         if(arr[i] <= pivot){
            int temp = arr[i];
            arr[i] = arr[partitionIndex];
            arr[partitionIndex] = temp;
            partitionIndex++;
         }

      }

      // swap the pivot in actual position

      int temp = arr[partitionIndex];
      arr[partitionIndex] = arr[high];
      arr[high] = temp;

      return partitionIndex;


   }
   
   public static void qs(int[] arr, int low, int high){
      if(low >= high) return;
      int partitionIndex = partition(arr, low, high);
      qs(arr,low, partitionIndex - 1);
      qs(arr, partitionIndex + 1, high);
   }

   
   public static void main(String args[]){
      int[] arr = {23,2,334,23,34,5,6};
      qs(arr,0,arr.length - 1);
      for(int i: arr){
         System.out.println(i);
      }
      
   }
}
