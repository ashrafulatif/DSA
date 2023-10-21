
#include <iostream>
using namespace std;

int getPivot(int arr[], int n)
{

    int f = 0;
    int l = n - 1;
    int mid = f + (l - f) / 2;

    while(f<l)
    {
        if(arr[mid]>arr[0])
        {
            f=mid+1;
        }
        else 
        {
            l=mid;
        }
        mid = f + (l - f) / 2;
    }
    return f;

}

int main()
{
    int arr[] = {1, 7, 3, 6, 5,6};
    int n = sizeof(arr)/sizeof(arr[0]);
    cout << "Pivot is " << getPivot(arr, n) << endl;
}