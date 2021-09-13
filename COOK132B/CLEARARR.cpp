#include <iostream>
#include <bits/stdc++.h>
using namespace std;

#define ll                  long long
#define new1(n)             ll int  n;cin>>n;
#define new2(n,k)           ll int  n,k;cin>>n>>k;
#define new3(a,b,c)         ll int a,b,c;cin>>a>>b>>c;
#define new4(a,b,c,d)       ll int a,b,c,d;cin>>a>>b>>c>>d;
#define fl(n,i)             for(ll int  i=0;i<n;i++)
#define revfl(n)            for(ll int i=n-1;i>=0;i--)
#define mod                 1000000007
#define mp                  make_pair
#define pb                  push_back
#define test                new1(t);while(t--)
#define take(arr,n)         ll arr[n];fl(n,i) cin>>arr[i];
#define INF                 0x3f3f3f3f


void func(int l,int r,int val,vector<int>&vect)
{
    if(l>r)return;
    if(l==r)vect[l]=val;
    else
    {
        int mid=(r-l+1)/2+l;
        vect[mid]=val;
        func(l,mid-1,val+1,vect);
        func(mid+1,r,val+1,vect);
    }
}

int main()
{
    test
    {
        new3(n,k,x);
        take(arr,n);
        sort(arr,arr+n);
        reverse(arr,arr+n);
        ll sum=0,ct=0;
        for(int i=0;i<n-1,k>0;i++)
        {
            if(arr[i]+arr[i+1]>x)
            {
                k--;
                sum+=x;
                i++;
                ct+=2;
            }
            else break;
        }
        for(int i=0;i<n;i++)
        sum+=arr[i];
        for(int i=0;i<ct;i++)
        sum-=arr[i];
        cout<<sum<<"\n";
    }
    return 0;
}
