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
	int M, N, sum = 0, min;
	cin >> N;
	cin >> M;
	for (int i = N; i <= M; i++)
	{
		if (isPrime(i) == 1) {
			if (sum == 0) min = i;
			sum += i;
		}
	}
	if (sum == 0)
		cout << "-1" << endl;
	else {
		cout << sum << endl;
		cout << min << endl;
	}
}