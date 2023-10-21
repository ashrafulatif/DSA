#include <iostream>
using namespace std;

int first_occ(int arr[], int n, int key)
{
    int f = 0;
    int l = n - 1;
    int mid = f + (l - f) / 2;

    int f_occ = -1; // for storing the value mid

    while (f <= l)
    {
        if (arr[mid] == key)
        {
            f_occ = mid;
            l = mid - 1;
        }
        else if (key > arr[mid])
        {
            f = mid + 1;
        }
        else if (key < arr[mid])
        {
            l = mid - 1;
        }

        mid = f + (l - f) / 2;
    }
    return f_occ;
}

int last_occ(int arr[], int n, int key)
{
    int f = 0;
    int l = n - 1;
    int mid = f + (l - f) / 2;

    int f_occ = -1; // for storing the value mid

    while (f <= l)
    {
        if (arr[mid] == key)
        {
            f_occ = mid;
            f = mid + 1;
        }
        else if (key > arr[mid])
        {
            f = mid + 1;
        }
        else if (key < arr[mid])
        {
            l = mid - 1;
        }

        mid = f + (l - f) / 2;
    }
    return f_occ;
}

int main()
{
    int arr1[] = {1, 2, 2, 3, 3, 3, 3, 5};
    int n = sizeof(arr1) / sizeof(arr1[0]);
    int f_index = first_occ(arr1, n, 3);
    cout << "first index : " << f_index << endl;

    int l_index = last_occ(arr1, n, 3);
    cout << "last index : " << l_index << endl;

    int total_occ = (l_index - f_index) + 1;

    cout << "total index: " << total_occ;
}