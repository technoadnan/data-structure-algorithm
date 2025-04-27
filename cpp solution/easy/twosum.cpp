#include <bits/stdc++.h>
using namespace std;


class Solution {
public:
    vector<int> twoSum(vector<int>& nums, int target) {
        // brute force 
        unordered_map<int, int> mpp;
        for(int i = 0; i < nums.size(); ++i) {
            int need = target - nums[i];
            if(mpp.contains(need)) {
                return {mpp[need], i};
            }
            mpp[nums[i]] = i; // element, index 
        }
        return {};
    }
};

int main() {
    Solution solution;
    vector<int> nums = {2, 7, 11, 15};
    int target = 9;
    vector<int> result = solution.twoSum(nums, target);

    for (int index : result) {
        cout << index << " ";
    }
    cout << endl;
    return 0;
}
