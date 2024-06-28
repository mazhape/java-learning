The absolute difference between two integers,  and , is written as . The maximum absolute difference between two integers in a set of positive integers, , is the largest absolute difference between any two integers in .

The Difference class is started for you in the editor. It has a private integer array () for storing  non-negative integers, and a public integer () for storing the maximum absolute difference.

Task
Complete the Difference class by writing the following:

A class constructor that takes an array of integers as a parameter and saves it to the  instance variable.
A computeDifference method that finds the maximum absolute difference between any  numbers in  and stores it in the  instance variable.
Input Format

You are not responsible for reading any input from stdin. The locked Solution class in the editor reads in  lines of input. The first line contains , the size of the elements array. The second line has  space-separated integers that describe the  array.

Constraints

, where 
Output Format

You are not responsible for printing any output; the Solution class will print the value of the  instance variable.

Sample Input

STDIN   Function
-----   --------
3       __elements[] size N = 3
1 2 5   __elements = [1, 2, 5]
Sample Output

4
Explanation

The scope of the  array and  integer is the entire class instance. The class constructor saves the argument passed to the constructor as the  instance variable (where the computeDifference method can access it).

To find the maximum difference, computeDifference checks each element in the array and finds the maximum difference between any  elements: 


The maximum of these differences is , so it saves the value  as the  instance variable. The locked stub code in the editor then prints the value stored as , which is .



#include <cmath>
#include <cstdio>
#include <vector>
#include <iostream>
#include <algorithm>

using namespace std;

class Difference {
    private:
    vector<int> elements;
  
  	public:
  	int maximumDifference;

	// Add your code here

}; // End of Difference class

int main() {
    int N;
    cin >> N;
    
    vector<int> a;
    
    for (int i = 0; i < N; i++) {
        int e;
        cin >> e;
        
        a.push_back(e);
    }
    
    Difference d(a);
    
    d.computeDifference();
    
    cout << d.maximumDifference;
    
    return 0;
}


Explanation:
Constructor: The constructor takes a vector of integers and initializes the elements vector with it.
computeDifference Method: This method calculates the maximum difference between the maximum and minimum elements in the elements vector.
max_element(elements.begin(), elements.end()): Finds the maximum element in the vector.
min_element(elements.begin(), elements.end()): Finds the minimum element in the vector.
abs(maxElement - minElement): Computes the absolute difference between the maximum and minimum elements.
Usage:
The main function reads the input size N and the elements of the array.
An instance of the Difference class is created with the input elements.
The computeDifference method is called to calculate the maximum difference.
Finally, the result is printed.
This implementation ensures that the Difference class computes the maximum absolute difference correctly and efficiently.

#include <cmath>
#include <cstdio>
#include <vector>
#include <iostream>
#include <algorithm>

using namespace std;

class Difference {
    private:
    vector<int> elements;
  
  	public:
  	int maximumDifference;

	// Add your code here
// Constructor
    Difference(vector<int> elements) {
        this->elements = elements;
    }

    // Compute the maximum difference
    void computeDifference() {
        int minElement = *min_element(elements.begin(), elements.end());
        int maxElement = *max_element(elements.begin(), elements.end());
        maximumDifference = maxElement - minElement;
    }
}; // End of Difference class

int main() {
    int N;
    cin >> N;
    
    vector<int> a;
    
    for (int i = 0; i < N; i++) {
        int e;
        cin >> e;
        
        a.push_back(e);
    }
    
    Difference d(a);
    
    d.computeDifference();
    
    cout << d.maximumDifference;
    
    return 0;
}