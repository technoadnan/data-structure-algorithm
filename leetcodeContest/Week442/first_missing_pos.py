
class Solution:
    def firstMissingPositive(self, nums: List[int]) -> int:
        nums = sorted(nums)
        pos_nums = []
        for n in nums:
            if n > 0:
                if len(pos_nums) == 0 or pos_nums[-1] != n:  # remove duplicates
                    pos_nums.append(n)
    
        res = 1
        for i in range(len(pos_nums)):
            if pos_nums[i] != res:
                return res
            res += 1
    
        return res