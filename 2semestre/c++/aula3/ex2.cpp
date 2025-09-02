#include <iostream>

int main ()
{   
    int num1, num2, verificacao(1);
    int soma;
    
    while(verificacao != 0)
    {
        std::cout << "Digite o primeiro valor: " << std::endl;
        std::cin >> num1;

        std::cout << "Digite o primeiro valor: " << std::endl;
        std::cin >> num2;
        
        soma = num1 + num2;
        std::cout << "A soma eh: " << soma << std::endl;

        std::cout << "Digite 1 para continuar e 0 para parar: " << std::endl;
        std::cin >> verificacao;
    }
}