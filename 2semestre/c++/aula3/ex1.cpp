#include <iostream>

int main()
{
    int n1(0), n2(1), prox_n(0);
    int n;

    std::cout << "Digite um valor para mostrar sua sequencia de fibonacci: ";
    std::cin >> n;

    std::cout << "Sequencia de Fibonacci ate " << n << ": ";

    std::cout << n1 << ", " << n2;

    prox_n = n1 + n2;
    while (prox_n < n)
    {
        std::cout << ", " << prox_n;
        n1 = n2;
        n2 = prox_n;
        prox_n = n1 + n2;
    }

    std::cout << std::endl;
    return 0;
}