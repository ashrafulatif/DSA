#include <iostream>
using namespace std;

int sqrt(int n)
{
    int f = 0;
    int l = n;
    int mid = (f + l) / 2;
    int ans = -1;

    while (f <= l)
    {
        if ((mid * mid) > n)
        {
            l = mid - 1;
        }
        else if ((mid * mid) < n)
        {
            ans = mid;
            f = mid + 1;
        }
        else if ((mid * mid) == n)
        {
            return mid;
        }
        mid = (f + l) / 2;
    }
    return ans;
}

double fraction(int n, int tf, int tmp_sol)
{
    double factor = 1;
    double ans = tmp_sol;

    for (int i = 0; i < tf; i++)
    {
        factor = factor / 10;
        for (double j = ans; j * j < n; j=j + factor)
        {
            ans = j;
        }
    }
    return ans;
}

int main()
{
    int n;
    cout << " Enter number:";
    cin >> n;
    int val = sqrt(n);
    double Fsqrt = fraction(n, 2, val);
    cout << " The answer is: " << Fsqrt << endl;
}