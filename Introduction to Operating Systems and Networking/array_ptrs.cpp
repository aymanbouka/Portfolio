//Ayman Boukharraz
//Got help from TA Nyree, and TA Brijesh
//https://www.youtube.com/watch?v=U55UWqreCNI for bubble sort using pointers
#include <iostream>
using namespace std;



int main()
{

int my_ints[4];
int x;



for (int i = 0; i < 4; i++)
    {

        cout << "Type a number: ";
        cin >> x;

        my_ints[i] = x;
    }

//prints out the array that users populated

    for (int x = 0; x < 4; x++)
    {

        cout << " ";
        cout << my_ints[x];
    }

//initalizing the pointer my_ptrs to the memory adress of my_ints
int *my_ptrs[4];
cout << " ";
cout << "printing array my_ints" << endl;
for(int i = 0; i < 4; i++)
{
    
    my_ptrs[i] = &my_ints[i];
    cout << " ";
    
}





int *temp;
//trying to do bubble sort
 for (int i = 0; i < 4; i++)
    {
        
        for (int j = 0; j < 4 - i - 1; j++)
        {

            if (*my_ptrs[j] > *my_ptrs[j+1])
            {
                 temp = my_ptrs[j];
                my_ptrs[j] = my_ptrs[j+1];
                my_ptrs[j+1] = temp;
            }
        }
    }


//printing out the array of ptrs
cout << " ";
cout << " printing value of pointer" << endl;
for(int i = 0; i < 4; i++)
{
    
    //my_ptrs[i] = &my_ints[i];
    cout << " ";
    cout << *my_ptrs[i] << " ";
}


}