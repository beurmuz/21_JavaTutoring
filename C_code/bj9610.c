#include <iostream>
using namespace std;

int n;
int x, y;
int Q1, Q2, Q3, Q4, AXIS;

int main(void) {
	cin >> n;
	for (int i = 0; i < n; i++)
	{
		cin >> x >> y;

		if ((x == 0) || (y == 0))
			AXIS++;
		else if ((x > 0) && (y > 0))
			Q1++;
		else if ((x < 0) && (y > 0))
			Q2++;
		else if ((x < 0) && (y < 0))
			Q3++;
		else if ((x > 0) && (y < 0))
			Q4++;
	}
	cout << "Q1: " << Q1 << endl;
	cout << "Q2: " << Q2 << endl;
	cout << "Q3: " << Q3 << endl;
	cout << "Q4: " << Q4 << endl;
	cout << "AXIS: " << AXIS << endl;

	return 0;
}