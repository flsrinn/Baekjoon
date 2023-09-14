#include <iostream>
using namespace std;

int fib(int n) {
	int f0 = 0, f1 = 1, f2 = 1;
	for (int i = 2; i <= n; i++)
	{
		f2 = f0 + f1;
		f0 = f1;
		f1 = f2;
	}
	return f2;
}

int main() {
	int N;
	cin >> N;
	cout << fib(N) << endl;
}