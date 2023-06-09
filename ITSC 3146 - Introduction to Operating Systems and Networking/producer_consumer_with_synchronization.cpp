//I recieved help from TA: Brijesh Patel
#include <pthread.h>
#include <iostream>
#include <unistd.h>
#include <cstdlib>

using namespace std;

#define MAX 10
#define N 4

pthread_mutex_t data_mutex = PTHREAD_MUTEX_INITIALIZER; // creating data_mutex
pthread_mutex_t console_mutex = PTHREAD_MUTEX_INITIALIZER; // creating console_mutex
pthread_cond_t not_empty = PTHREAD_COND_INITIALIZER; //default condition variable
pthread_cond_t not_full = PTHREAD_COND_INITIALIZER; // default condition variable

// Data structure to represent a simplified Order 
// that has an order number and an item number.
struct Order
{
	int order_num;
	int item_num;	
};

Order new_orders [N];		// array of elements of type Order to be used as a shared buffer
int num_new_orders = 0;		// count of number of new (i.e., unprocessed) orders
int order_num = 0;			// global variable used to generate unique order numbers

// TODO: Define and initialize necessary mutex and condition variables here

void* takeOrders(void* arg)
{
	int item;
	int index = 0;
	
	for(int i = 0; i < MAX; ++i) {
		// Beginning of critical region 1

		//locking console_mutex
		pthread_mutex_lock(&console_mutex);
		
		

        // Get user input
		cout << "Enter a menu item number between 1 and 50: ";
		cin >> item;

        // Print new order's details
		cout << "Got new order! Order number is " << order_num << " and item number: " << item << std::endl;
		
		// End of critical region 1

		//unlocking concole_mutex
		pthread_mutex_unlock(&console_mutex);


		// Beginning of critical region 2

		//locking data
		pthread_mutex_lock(&data_mutex);

		//checks if new_num_order is equal to N(Buffer)
		if(num_new_orders == N)
		   pthread_cond_wait(&not_full,&data_mutex);
        // Put new order into new orders buffer and update number of new orders
        new_orders[index].order_num = order_num;
	    new_orders[index++].item_num = item;
    	++num_new_orders;
    	
    	// End of critical region 2

		// calls pthread_cond_signal()
		pthread_cond_signal(&not_empty);

		//unlocking data
	    pthread_mutex_unlock(&data_mutex);
    	
		
    	// Update order number so that next order gets a different number
    	++order_num;
    	
    	// If the end of the new orders buffer is reached, wrap back around
    	if(index == N)
    		index = 0;
	}

	pthread_exit(NULL);
}

void* processOrders(void* arg)
{
	int item;
	int index = 0;
	int o_num;

	for(int i = 0; i < MAX; ++i) {
		// Beginning of critical region 3
		pthread_mutex_lock(&data_mutex);

		//checks if new_new_orders is equal to 0
		if(num_new_orders == 0)
		// calls pthread_cond_wait()
        	pthread_cond_wait(&not_empty,&data_mutex);
        // Retrieve new order details from buffer and update number of new orders
        o_num = new_orders[index].order_num;
	    item = new_orders[index++].item_num;
        --num_new_orders;

		// End of critical region 3
		//calls pthread_cond_signal()
	    pthread_cond_signal(&not_full);

		// unlocks data_mutex
	    pthread_mutex_unlock(&data_mutex);

		
		// Beginning of critical region 4
		//locks console_mutex
        pthread_mutex_lock(&console_mutex);


        // Print retrieved order's details
		cout << "Processing order number " << o_num << " with item number: " << item << std::endl;

		// End of critical region 4

		//unlocks console_mutex
		pthread_mutex_unlock(&console_mutex);

		// Suspend self for 1 second
		sleep(1);
		
    	// If the end of the new orders buffer is reached, wrap back around
    	if(index == N)
    		index = 0;
	}

	pthread_exit(NULL);
}

int main()
{
    // Create threads to take and process orders
	pthread_t id1, id2;
	pthread_create(&id1, NULL, processOrders, NULL);
	pthread_create(&id2, NULL, takeOrders, NULL);
	
	// TODO: Add code to wait for both threads to finish

	//wait for both pthreads to be complete
	 pthread_join(id1,NULL);
	 pthread_join(id2,NULL);
	

	// Print goodbye message
	cout << "Phew! Done with orders for today!" << endl;

	pthread_exit(NULL);
}
