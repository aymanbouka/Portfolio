//Ayman Boukharraz
//Got help from TA Nyree, and TA Brijesh
//resources I've looked at https://www.geeksforgeeks.org/c-program-swap-two-numbers/

#include <iostream>
using namespace std;

//void swapints(int* nums1, int* nums2);
void swapints(int *first, int *second)
{
    int temp;
    
    temp = *first;

    *first = *second;

    *second = temp;

    cout<< *first << " " << *second << " ";




}

int main()
{

    
int num1,num2;

cout << "Type a number: ";
cin >> num1;





cout << "Type a number: ";
cin >> num2;


//swapping in memmory adresses
swapints(&num1, &num2);


}

