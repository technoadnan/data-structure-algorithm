#include <bits/stdc++.h>
using namespace std;


int main(int argc, char const *argv[])
{
   unordered_map<char, int> freq;
   std::vector<int> freqval;


   for(char c: s) {
      freq[c]++;
   }

   if (freq.size() <= k) {
      return 0;
   }
    
   for (const auto& entry : freq) {
      freqval.push_back(entry.second);
   }
   std::sort(freqval.begin(), freqval.end());

   int del = 0;
   int rem = freqval.size() - 1;

   for (int i = 0; i < rem; ++i)
   {
      del += freqval[i];
   }

   

   return 0;
}
