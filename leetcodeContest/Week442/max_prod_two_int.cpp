#include <bits/stdc++.h>
using namespace std;

int main() {
   int n = 267;
   vector<int> digits;

   while (n > 0) {
      digits.push_back(n % 10);
      n /= 10;
   }

   int res = 0;
   int size = digits.size();

   // Try all pairs
   for (int i = 0; i < size; ++i) {
      for (int j = i + 1; j < size; ++j) {
         int ans = digits[i] * digits[j]; // i is the first number, j is the second number 
         res = max(res, ans);
      }
   }

   cout << res << endl;
   return 0;
}
