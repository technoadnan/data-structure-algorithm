#include <climits>
class Solution {
public:
    int reverse(int x) {
        long long res = 0; // use long long to detect overflow
        while (x != 0) {
         // number system in digit follow Numerical 10-digit
            res = res * 10 + x % 10; // each time the place value increases by 10
            x /= 10;
        }

        // check if res fits in 32-bit signed int range
        if (res > INT_MAX || res < INT_MIN) return 0;
        return res;
    }
};