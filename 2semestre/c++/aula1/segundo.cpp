#include <iostream>

int main() 
{
    int num1, num2;

    std::cout << "Digite o primeiro valor:";
    std::cin >> num1;

    std::cout << "Digite o segundo valor:";
    std::cin >> num2;

    int soma = num1 + num2;

    if (soma > 10) 
    {
        std::cout << "A soma e de homem";
    }
    else 
    {
        std::cout << "A soma e de gabriel";
    }

    return 0;
}



