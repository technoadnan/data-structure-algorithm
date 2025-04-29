#include <bits/stdc++.h>
using namespace std;
int main()
{
   int t;
   cin >> t;
   while (t-- > 0)
   {
      int least_sig_num = 1;
      int num;
      cin >> num;

      while (num-- > 0)
      {
         int n;
         cin >> n;
         least_sig_num = (least_sig_num * n) % 10; // each time, getting the last digit purposelfully because int excceds the value 
      }

      // why didn't 2 <= num <= 5 didn't  work
      // left to right associativity 
      // if (2 <= num && num <= 5) 

      if (least_sig_num == 2 || least_sig_num == 3 || least_sig_num == 5)
      {
         cout << "YES" << endl;
      }
      else
      {
         cout << "NO" << endl;
      }


   }
}