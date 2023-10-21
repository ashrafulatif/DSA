#include <iostream>
using namespace std;

int binary_search(int arr[], int n, int key)
{
    int f = 0;
    int l = n - 1;
    int mid = (f + l) / 2;

    while (f <= l)
    {
        if (arr[mid] == key)
        {
            return mid;
        }
        else if (key > arr[mid])
        {
            f = mid + 1;
        }
        else if (key < arr[mid])
        {
            l = mid - 1;
        }
        mid = (f + l) / 2;
    }
    return -1;
}

int main()
{
    int ar[7] = {10, 3, 5, 6, 100, 104, 27};
   
    int n = sizeof(ar) / sizeof(ar[0]);
    int index = binary_search(ar, n, 11);
    cout << "index: " << index;
}