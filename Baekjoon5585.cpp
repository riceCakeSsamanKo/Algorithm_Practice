#include<iostream>
using namespace std;

const int THOUSNAD = 1000;
int main() {
	int price, money;
	cin >> price;
	money = THOUSNAD - price;

	int coins[] = { 500,100,50,10,5,1 };
	int numOfEachCoins[6] = { 0, };
	int numOfCoin = 0;

	for (int i = 0; i < 6;i++) {
		numOfEachCoins[i] = money / coins[i];
		
		money -= coins[i] * numOfEachCoins[i];
		numOfCoin += numOfEachCoins[i];
	}

	cout << numOfCoin;

}