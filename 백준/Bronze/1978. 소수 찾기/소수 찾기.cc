#include <iostream>
using namespace std;

int isPrime(int n) {
	int count = 0;
	for (int i = 1; i <= n; i++)
	{
		if (n % i == 0) count++;
	}
	if(count == 2) return 1;
	return 0;
}

int main() {
	int T, n, count = 0;
	cin >> T;
	for (int i = 0; i < T; i++)
	{
		cin >> n;
		if (isPrime(n) == 1) count++;
	}
	cout << count;
}