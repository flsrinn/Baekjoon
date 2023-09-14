#include <iostream>
using namespace std;

int findSquare(int n) {
	for (int i = 1; i <= n; i++)
	{
		if (i * i == n) return 1;
	}
	return 0;
}

int main() {
	int M, N, sum = 0, s0;
	cin >> N;
	cin >> M;
	for (int i = N; i <= M; i++)
	{
		if (findSquare(i) == 1) {
			if (sum == 0) s0 = i;
			sum += i;
		}
	}
	if (sum == 0) cout << "-1" << endl;
	else {
		cout << sum << endl;
		cout << s0 << endl;
	}
}