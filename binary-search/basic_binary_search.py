from typing import List


class Solution:
   def search(nums: List[int], target: int) -> int:
      start = 0
      end = len(nums) - 1

      while start <= end:
         mid = (start + end) // 2  # truncate div
         if nums[mid] == target:
               return mid
         elif nums[mid] < target:
               start = mid + 1
         else:
               end = mid - 1
      
      return -1


nums = [-1,0,3,5,9,12]
t = 9
print(Solution.search(nums=nums, target=t))
