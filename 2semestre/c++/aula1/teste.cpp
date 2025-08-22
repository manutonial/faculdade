#include <iostream>

int main() 
{
    double num1, num2;

    std::cout << "num 1:";
    std::cin >> num1;

    std::cout << "num 2:";
    std::cin >> num2;

    // lendo os dois valores seguidamente
    //std::cin >> num1 >> num2;

    double media = (num1 + num2) / 2;

    if (media > 5.5) 
    {
        std::cout << "O cara é foda! sua media e: " << media <<  std::endl;
    } 
    else 
    {
        std::cout << "Fracassado! Sua media e:  " << media << std::endl;
    }

    return 0;
}