#include <pthread.h>
#include <iostream>

using namespace std;

const char* my_messages[4] = { "English: Hello!", "Japanese: Konnichiwa!", "Spanish: Hola!", "German: Guten Tag!"};

void *printMessage(void *index)
{

int b = *((int*)index);
 
  std::cout << my_messages[b] <<endl;
  
  return 0;
}




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
   // id is used to store a unique thread identifier,
   // returned by the call to create a new POSIX thread
   pthread_t id;
   
   // rc is used to store the code returned by the
   // call to create a new POSIX thread. The value is
   // zero (0) if the call succeeds.
   int rc;
   
   
   // TODO: Add code to perform any needed initialization
   //       or to process user input
int arr[4] = {0, 1, 2, 3};
   //for loop
for(int i = 0; i < 4;i++)
{


rc = pthread_create(&id, NULL, printMessage, (void*)&arr[i]);

 if (rc)
   {
      cout << "ERROR; return code from pthread_create() is " << rc << endl;
      return -1;
   }


}
   
   // Create thread(s)
   // TODO: Modify according to assignment requirements
   // rc = pthread_create(&id, NULL, routineName, NULL);

  
   

   // NOTE: Using exit here will immediately end execution of all threads
   pthread_exit(0);
}