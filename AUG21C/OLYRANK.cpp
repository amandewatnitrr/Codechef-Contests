#include<bits/stdc++.h>
using namespace std;
int main()
{
  int t;
  cin>>t;
  while(t--)
  {
    int g1,s1,b1,g2,s2,b2,countryOne,countryTwo;
    cin >> g1 >> s1 >> b1 >> g2 >> s2 >> b2;
    countryOne = g1+s1+b1;
    countryTwo = g2+s2+b2;
    if(countryOne > countryTwo) {
        cout << "1" << endl;
    } else {
        cout << "2" << endl;
    }
  }
  return 0;
}
