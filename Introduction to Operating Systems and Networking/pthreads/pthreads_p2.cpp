//TA helped
#include <pthread.h>
#include <iostream>

using namespace std;

int arr[10];

void *countNegative(void *arg)
{

int negativeNumbers = 0;

for(int i = 0; i < 10; i++)
{

   if(arr[i] < 0)
   {
      negativeNumbers = negativeNumbers + 1;
   }


}

   cout<< "Total negative numbers: "<<negativeNumbers << " "<<endl;
}//end method

void *average(void *arg)
{

int averageHolder = 0;

for(int i = 0; i < 10; i++)
{

 averageHolder += arr[i];




}

cout<< "Average: " << averageHolder/10 << " " << endl;

}//end method average




void *reverse(void *arg)
{

   cout<< "This is the reverse: ";

   for(int i = 9; i >= 0; i--)
   {
      cout<< arr[i] << " "<< endl;
   }

   
}//end method reverse

// This function implements the routine that is
// executed by the thread
void *routineName(void *arg)
{
   // TODO: Add code that implements
   //       the thread's functionality
   cout << "Thread is running..." << endl;
   return 0;
}


int main()
{

//takes in user input and adds to a global array
for(int i = 0; i < 10; i++)
{
   int x;
   cout<< "Type a number: ";
   std::cin>> x;

   arr[i] = x;

}






   // id is used to store a unique thread identifier,
   // returned by the call to create a new POSIX thread
   pthread_t id;
   
   // rc is used to store the code returned by the
   // call to create a new POSIX thread. The value is
   // zero (0) if the call succeeds.
   int rc;
   
   
   // TODO: Add code to perform any needed initialization
   //       or to process user input

   
   // Create thread(s)
   // TODO: Modify according to assignment requirements
   rc = pthread_create(&id, NULL, routineName, NULL);

   if (rc){
      cout << "ERROR; return code from pthread_create() is " << rc << endl;
      return -1;
   }

for (int count = 0; count < 100000; count++);

//count negative



rc = pthread_create(&id, NULL, countNegative, NULL);

 if (rc)
   {
      cout << "ERROR; return code from pthread_create() is " << rc << endl;
      return -1;
   }


for (int count = 0; count < 100000; count++);




rc = pthread_create(&id, NULL, average, NULL);

 if (rc)
   {
      cout << "ERROR; return code from pthread_create() is " << rc << endl;
      return -1;
   }



for (int count = 0; count < 100000; count++);




rc = pthread_create(&id, NULL,reverse, NULL);

 if (rc)
   {
      cout << "ERROR; return code from pthread_create() is " << rc << endl;
      return -1;
   }



for (int count = 0; count < 100000; count++);

   

   // NOTE: Using exit here will immediately end execution of all threads
   pthread_exit(0);
}