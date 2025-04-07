class Solution(object):
    def firstUniqChar(self, s):
        cnt = {} # empty dict 
        for char in s:
            cnt[char] = cnt.get(char, 0) + 1 # using cnt to count the number of times a char appears
        for i, c in enumerate(s): # looking is there is a char that appears only once
            if cnt[c] == 1:
                return i
        return -1
        