//Ayman Boukharraz
//Got help from TA Nyree, and TA Brijesh

#include <iostream>
#include <cmath>
using namespace std;

//Data Structure CartesianCoordinate
struct CartesianCoordinate
{
    float x;
    float y;
};

// creating a function that calculates the distance
float calculateDistance(CartesianCoordinate *p1, CartesianCoordinate *p2)
{

     return sqrt(pow((p1-> x) - (p2 -> x),2) + pow(p1->y - p2->y,2));
}


int main()
{

CartesianCoordinate p1;

CartesianCoordinate p2;

cout << "point value of p1: ";
cin >> p1.x;

cout << "second point value of p1: ";
cin >> p1.y;

cout << "point value of p2: ";
cin >> p2.x;

cout << "second point value of p2: ";
cin >> p2.y;

// sets results = to the function result of calculateDistance()
float result = calculateDistance(&p1, &p2);

cout << "results: ";
cout << result << " ";

}


