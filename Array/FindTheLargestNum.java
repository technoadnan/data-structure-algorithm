public class FindTheLargestNum {
   public static int solution(int[] arr){
      int max = arr[0];
      for(int i = 0; i < arr.length; i++){
         if (arr[i] > max){
            max = arr[i]; 
         }
      }
      return max;
   }
   public static void main(String[] args) {
      int arr[] = {4,543,534,5,345};
      int num = solution(arr);
      System.out.println(num);
      // for (int i : arr) System.out.println(i);
   }
}
