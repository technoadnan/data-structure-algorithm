#include <bits/stdc++.h>
using namespace std;

int main()
{
   string s = "PPLPLLP";
   int a = 0;
   int l = 0;
   int cntl = 0;
   for(int i = 0; i < s.size(); ++i) {
      if(s[i] == 'A'){
            a++;
            cntl = 0;
      } else if(s[i] == 'L'){
            cntl++;
            // return ASAP otherwise the cntl might lost the previous record
            if(cntl >= 3) return false;
      } else {
            cntl = 0;
      }
   }
   if(a > 1 || cntl >= 3) {
      cout << "False" << endl;
   } else {
      cout << "true" << endl;
   }
}