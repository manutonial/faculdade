#include <iostream>

int main()
{
    double nota;

    std::cout << "Digite a nota do aluno: ";
    std::cin >> nota;

    while(nota < 0 || nota > 10)
    {  
    std::cout << "Nota invalida!" << std::endl;

    std::cout << "Digite a nota do aluno: ";
    std::cin >> nota;
    }
}