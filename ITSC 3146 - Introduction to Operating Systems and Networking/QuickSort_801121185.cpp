//
// Got help from TA Brijesh Patel
//  QuickSort_Skeleton.cpp
//
//  Created by Bahamon, Julio on 6/25/19.
//  UNC Charlotte
//  Copyright © 2019 Bahamon, Julio. All rights reserved.
//

#include <iostream>
#include <cstdlib>
#include <cstring>

using namespace std;

//  Declaring a new struct to store patient data
struct patient {
    int age;
    char name[20];
    float balance;
};


//  TODO:
//  IMPLEMENT A FUNCTION THAT COMPARES TWO PATIENTS BY AGE

//  THE FUNCTION RETURNS AN INTEGER AS FOLLOWS:
//      -1 IF THE AGE OF THE FIRST PATIENT IS LESS
//         THAN THE SECOND PATIENT'S AGE
//       0 IF THE AGES ARE EQUAL
//       1 OTHERWISE


int comparePatientsByAge(const void* p1, const void* p2)
{
	patient* person1 = (patient*)p1;
	
	patient* person2 = (patient*)p2;
	
	if((*person1).age < (*person2).age)
	{
		return -1;
		
	}
	else if((*person1).age == (*person2).age)
	{
		return 0;
	}
	else
	{
		return 1;
	}
	
}


//  TODO:
//  IMPLEMENT A FUNCTION THAT COMPARES TWO PATIENTS BY BALANCE DUE

//  THE FUNCTION RETURNS AN INTEGER AS FOLLOWS:
//      -1 IF THE BALANCE FOR THE FIRST PATIENT IS LESS
//         THAN THE SECOND PATIENT'S BALANCE
//       0 IF THE BALANCES ARE EQUAL
//       1 OTHERWISE
int comparePatientsByBalance(const void* p1, const void* p2)
{
	patient* person1 = (patient*)p1;
	
	patient* person2 = (patient*)p2;
	
	if((*person1).balance < (*person2).balance)
	{
		return -1;
		
	}
	else if((*person1).balance == (*person2).balance)
	{
		return 0;
	}
	else
	{
		return 1;
	}
	
}

//  TODO:
//  IMPLEMENT A FUNCTION THAT COMPARES TWO PATIENTS BY NAME

//  THE FUNCTION RETURNS AN INTEGER AS FOLLOWS:
//      -1 IF THE NAME OF THE FIRST PATIENT GOES BEFORE
//         THE SECOND PATIENT'S NAME
//       0 IF THE AGES ARE EQUAL
//       1 OTHERWISE
//
//  HINT: USE THE strncmp FUNCTION
//  (SEE http://www.cplusplus.com/reference/cstring/strncmp/)

int comparePatientsByName(const void* name1, const void* name2)
{
	patient* string1 = (patient*) name1 ;
	patient* string2 = (patient*) name2;
	
	return strncmp(string1->name,string2->name,20) ;
	
	
	
	
}
//prints out array of patients
void displayPatientList(patient arr[])
{
	for(int i = 0; i < 6; i++)
	{
		cout << arr[i].age << "\t" << arr[i].name << "\t" << arr[i].balance <<endl;
		
	}
	
	
	
}
//  The main program
int main()
{
    int total_patients = 6;
    
    //  Storing some test data
    struct patient patient_list[6] = {
        {25, "Juan Valdez   ", 1250},
        {15, "James Morris  ", 2100},
        {32, "Tyra Banks    ", 750},
        {62, "Mario O'Donell", 375},
        {53, "Pablo Picasso ", 615},
        {}
    };
    //code for creating a new object
    patient newPatient;
    cout << "What is your age?: ";
    cin >> (newPatient).age;

    cout << "What is your name?: ";
    cin >> (newPatient).name;
    
    cout << "What is your balance?: ";
    cin >> (newPatient).balance;
    
     patient_list[5] = newPatient;
    
     
    cout << "Patient List: " << endl;
    
    //  TODO:
    //  IMPLEMENT THE CODE TO DISPLAY THE CONTENTS
    //  OF THE ARRAY BEFORE SORTING
     displayPatientList(patient_list);

    cout << endl;
    
    
    cout << "Sorting..." << endl;
    
    //  TODO:
    //  CALL THE qsort FUNCTION TO SORT THE ARRAY BY PATIENT AGE
    qsort(patient_list,total_patients,sizeof(patient),comparePatientsByAge);
    cout << "Patient List - Sorted by Age: " << endl;
    
    //  TODO:
    //  DISPLAY THE CONTENTS OF THE ARRAY
    //  AFTER SORTING BY AGE
    
    displayPatientList(patient_list);
    
    cout << endl;
    
    
    cout << "Sorting..." << endl;
    
    //  TODO:
    //  CALL THE qsort FUNCTION TO SORT THE ARRAY BY PATIENT BALANCE
    //sorting 
    qsort(patient_list,total_patients,sizeof(patient),comparePatientsByBalance);
    cout << "Patient List - Sorted by Balance Due: " << endl;
    
    //  TODO:
    //  DISPLAY THE CONTENTS OF THE ARRAY
    //  AFTER SORTING BY BALANCE
    displayPatientList(patient_list);
    cout << endl;
    
    
    cout << "Sorting..." << endl;
    
    //  TODO:
    //  CALL THE qsort FUNCTION TO SORT THE ARRAY BY PATIENT NAME
    //sort
    qsort(patient_list,total_patients,sizeof(patient),comparePatientsByName);
    cout << "Patient List - Sorted by Name: " << endl;
    
    //  TODO:
    //  DISPLAY THE CONTENTS OF THE ARRAY
    //  AFTER SORTING BY NAME
    displayPatientList(patient_list);
    cout << endl;
    
    return 0;
}
