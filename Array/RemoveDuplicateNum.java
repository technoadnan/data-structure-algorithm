public class RemoveDuplicateNum {
    public static int removeDuplicates(int[] nums) {
        int ptr = 0;
        for(int i=0; i<nums.length;i++) {
            if(nums[ptr] != nums[i]){
                ptr++;
                nums[ptr] = nums[i];
            }
        }
        return ptr+1;
     }
    public static void main(String[] args) {
        int arr[] = {3,2,33,2,12,445,46,878,2,12};
        removeDuplicates(arr);   
    }
}
