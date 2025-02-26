public class RemoveZeroFromEnd {
   // [1,0,2,3,2,0,0,4,5,1]
   // 🎯 return a new array
   // ⌛ T.C -> o(n)
   // 🚀 S.C -> o(n)
   public static void brute(int[] arr, int n){
      // this solution works because if there is nothing at the end of the array then it gets filled with 0
      int[] temp = new int[n];
      int cnt = 0;
      for (int i = 0; i < arr.length; i++) {
         if(arr[i] != 0){
            temp[cnt] = arr[i];
            cnt++;
         }
      }
      for (int i : temp) System.out.println(i+" ");  
      System.arraycopy(temp, 0, arr, 0, temp.length);
   }


   // language independent 
   // if the lang don't support any zeros at empty space 
   // or if Q. said to fill the empty place with smth else
   public static void brute2(int[] arr, int n){
      int[] temp = new int[n];
      int tempSize = 0;

      //👉🏻 collecting val of temp non-zero
      for (int i = 0; i < arr.length; i++) {
         if(arr[i] != 0){
            temp[tempSize] = arr[i];
            tempSize++;
         }
      }

      //👉🏻 fill main array with non-zero
      for (int i = 0; i < tempSize; i++) {
         arr[i] = temp[i];
      }

      //👉🏻 fill rest of the main array with the zeros
      for (int i = tempSize; i < arr.length; i++) {
         arr[i] = 0;
      }

      for (int i : arr) System.out.println(i);
   }

   public static void optimal(int n, int[] arr){
      int ptr = 0;
      
      // 👉🏻 find the first zero

      for (int i = 0; i < arr.length; i++) {
         if(arr[i] == 0){
            ptr = i;
            break;
         }
      }

      // based on the first zero we're going to swap it
      for (int i = ptr; i < arr.length; i++) {
         if(arr[i] != 0){
            // swap non-zero with zero
            int temp = arr[ptr];
            arr[ptr] = arr[i];
            arr[i] = temp;
            ptr++;
         }   
      }

      for (int i : arr) System.out.println(i);
      
   }



   public static void main(String[] args) {
      int arr[] = {0, 0, 0, 1, 0, 2, 3, 2, 0, 0, 4, 5, 1, 0, 0};
      int n = arr.length;
      // brute(arr, n);
      // brute2(arr, n);
      optimal(n, arr);
   }
}
