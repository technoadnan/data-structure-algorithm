// {34, 7, 23, 32, 5, 62, 23, 1, 7}
import java.util.*;

public class MergeSort {

   public static void merge(int[] arr, int low, int mid, int high) {
      ArrayList<Integer> temp = new ArrayList<>(); // temporary array
      int left = low;
      int right = mid+1;

      while(left <= mid && right <= high) {
         if(arr[left] <= arr[right]){
            temp.add(arr[left]);
            left++;
         }
         else{
            temp.add(arr[right]);
            right++;
         }
      }

      while(left <= mid) {
         temp.add(arr[left]);
         left++;
      }

      while(right <= high) {
         temp.add(arr[right]);
         right++;
      }

      for(int i = low; i <= high; i++){
         arr[i] = temp.get(i - low);
      }


   }


   public static void ms(int[] arr, int low, int high) {
      if(low >= high) return;


      int mid = (low+high) / 2;
      
      ms(arr, low,mid);
      ms(arr, mid+1,high);
      merge(arr, low,mid, high);

   }

   

   public static void main(String ars[]){
      int[] arr = {34, 7, 23, 32, 5, 62, 23, 1, 7};
      int n = arr.length - 1 ;
      ms(arr,0, n);

      for(int i: arr){
         System.out.println(i);   
      }

   }
}
