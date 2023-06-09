//Ayman Boukharraz
//Got help from TA Nyree, and TA Brijesh
#include <iostream>
using namespace std;

int main()
{


int myInt = 15;

int* myPointer = &myInt;
// printing memory adress
cout<< "myInt Memory Adress: ";
cout << &myInt;
cout << " \n ";

cout<< "The value contained in myPointer: ";
cout << myPointer;
cout << " \n ";

cout<< "myInt number: ";
cout << myInt;
cout << " \n ";

cout<< "The value pointed to my pointer: ";
cout << *myPointer;
cout << " \n ";


myInt = 10;

cout<< "myInt Memory Adress: ";
cout << &myInt;
cout << " \n ";

cout<< "The value contained in myPointer: ";
cout << myPointer;
cout << " \n ";

cout<< "myInt number: ";
cout << myInt;
cout << " \n ";

cout<< "The value pointed to my pointer: ";
cout << *myPointer;
cout << " \n ";
}