#include <iostream>
#include <unordered_set>
#include <string>
using namespace std;

int lengthOfLongestSubstring(string s) {
   int maxLength = 0;

   // Loop over each possible starting index of the substring
   for (int i = 0; i < s.length(); ++i) {
      // Create an unordered set to store unique characters
      unordered_set<char> charSet;

      // Loop over each possible ending index of the substring
      for (int j = i; j < s.length(); ++j) {
         // If character is already in the set, break out of the loop
         if (charSet.find(s[j]) != charSet.end()) {
               break;
         }
         // Add character to set
         charSet.insert(s[j]);

         // Update the maximum length of the substring found so far
         maxLength = max(maxLength, j - i + 1);
      }
   }

   return maxLength;
}

int main() {
   string s;

   // Test the function with example cases
   s = "abcabcbb";
   cout << "Input: " << s << "\nOutput: " << lengthOfLongestSubstring(s) << endl;  // Output: 3

   s = "bbbbb";
   cout << "Input: " << s << "\nOutput: " << lengthOfLongestSubstring(s) << endl;  // Output: 1

   s = "pwwkew";
   cout << "Input: " << s << "\nOutput: " << lengthOfLongestSubstring(s) << endl;  // Output: 3

   return 0;
}
