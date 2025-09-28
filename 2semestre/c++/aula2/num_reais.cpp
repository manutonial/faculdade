#include <iostream>
#include <string>

int main()
{   
    std::string continuar = "";
    do
    {
        double real1, real2;
        int num;

        std::cout << "Digite o valor do primeiro numero real:";
        std::cin >> real1;

        std::cout << "Digite o valor do segundo numero real:";
        std::cin >> real2;

        std::cout << "Digite o valor do primeiro numero inteiro:";
        std::cin >> num;

        // if (num == 1)
        // {
        //     int soma = real1 + real2;
        //     std::cout << "A soma dos numeros eh " << soma;
        // }
        // else if (num == 2)
        // {
        //     double mult = real1 * real2;
        //     std::cout << "A multiplicacao eh " << mult;
        // }
        // else if (num == 3)
        // {
        //     double sub = real1 - real2;
        //     std::cout << "A subtracao resulta: " << sub;
        // }

        switch (num)
        {
        case 1:
        {
            double soma = real1 + real2;
            std::cout << "A soma dos numeros eh " << soma << std::endl;
        }
        break;

        case 2:
        {
            double mult = real1 * real2;
            std::cout << "A multiplicacao eh " << mult << std::endl;
        }
        break;

        case 3:
        {
            double sub = real1 - real2;
            std::cout << "A subtracao resulta: " << sub << std::endl;
        }
        break;
        }
        
        std::cout << "Deseja continuar? (Gabriel para parar)";
        std::cin >> continuar;
        
    } while (continuar != "Gabriel");
}