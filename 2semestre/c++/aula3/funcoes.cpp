#include <iostream>

int soma(int a, int b)
{
    return a + b;
}

int soma(int a, int b, int c)
{
    return a + b + c;
}

int main()
{
    std::cout << soma(7, 9, 3) << std::endl;

    return 0;
}