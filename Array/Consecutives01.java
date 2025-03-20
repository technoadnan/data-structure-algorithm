public class Consecutives01 {
    public static int findMaxConsecutiveOnes(int[] arr) {
        int zero = 0;
        int maxZero = 0;
        int one = 0;
        int maxOne = 0;
        
        for(int i = 0; i < arr.length; i++) {
            if(arr[i] == 0) {
                zero++;
                maxZero = Math.max(zero, maxZero);
            } else{
                zero = 0;
            }
            
            if (arr[i] == 1){
                one++;
                maxOne = Math.max(one, maxOne);
            } else {
                one = 0;
            }
        }
        
        return Math.max(maxOne, maxZero);
    }
}
