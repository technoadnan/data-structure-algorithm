#include<bits/stdc++.h>
using namespace std;

void increment(int n) {
   n++;
}

// pass by reference 
void incrementRef(int &n) {
   n++;
}

void numsRef(int a[]) {
   a[0] = 5;
}

/* // Invalid, 2d or >nd needs to define the size
   // nums[][30], nums[][2][3] 
void (int a[][]) {
     
}
*/

void numsRef2d(int a[][20]) {
   cout << a[2][10];
}



int main() {
   int a = 3;
   cout << a << endl;
   increment(a);
   // pass by value
   cout << a << endl; // 3

   // pass by reference
   incrementRef(a);
   cout << a << endl;

   // array is automatically pass by reference 
   // after 1d meaning 2d and more, skipping the size will result error
   int nums[10];
   nums[0] = 7;
   cout << nums[0] << endl;
   numsRef(nums);
   cout << nums[0] << endl; // pass by ref wasn't declared, still the val changed

   /* Pointers */
   int x = 4;
   int *ptr = &x; // address of x
   cout << "Addr of X: " << &x << endl;
   cout << "Addr of X: " << ptr;

   return 0;
}