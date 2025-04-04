import java.util.Arrays;

public class CeilFloor {
public int floor(int x, int[] arr) {
        int low = 0;
        int high = arr.length - 1;
        int res = -1;
        while(low <= high) {
            int mid = (low+high) / 2;
            if(arr[mid] <= x) {
                res = arr[mid];
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        
        return res;
    }
    
    
    public int ceil(int x, int[] arr) {
        int low = 0;
        int high = arr.length - 1;
        int res = -1;
        while(low <= high) {
            int mid = (low+high) / 2;
            if(arr[mid] >= x) {
                res = arr[mid];
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        
        return res;
    }
    
    
    
    
    
    
    public int[] getFloorAndCeil(int x, int[] arr) {
        // code here
        Arrays.sort(arr);
        // 5, 6, 8, 9, 6, 5, 5, 6
        // 5, 5, 5, 6, 6, 6, 8, 9
        
        int a = floor(x, arr);
        int b = ceil(x, arr);
        
        return new int[]{a,b};
        
        
    }
}
