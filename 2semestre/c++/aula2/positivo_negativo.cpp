#include <iostream>

int main () 
{
    double num;
    std::cout <<"Digite um valor:";
    std::cin >> num;

    if (num > 0)
    {
        std::cout << "O numero eh positivo";
    }
    else if (num == 0) 
    {
        std::cout << "O numero é igual a zero";
    }
    else 
    {
        std::cout << "O numero eh negativo";
    }
}