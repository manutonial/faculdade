#include <iostream>

int main () 
{
    int num;
    std::cin >> num;

    if (num % 2 == 0) 
    {
        std::cout << "O numero" << num << "eh par";
    }
    else 
    {
        std::cout << "O numero" << num << "eh impar";
    }
    
}