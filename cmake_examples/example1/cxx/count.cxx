#include <iostream>
#include <stdlib.h>

using namespace std; 

int main (int argc, char** argv) {
	int upto = 10;  // count to 10 by default
	int i;          // iterator

	// Notice the use of argv[0] (how do we know its the program name?)
	cout << "Inside program " << argv[0] << endl;

	if (argc > 1) { // use first argument
		upto = atoi(argv[1]);
	}

	// perform my count
	for (i = 1; i <= upto; i++) {
		cout << i << endl;
	}

	if (i > 20) {
		return 1;  // what effect does this have? 
	}

	return 0; // successful execution
}
