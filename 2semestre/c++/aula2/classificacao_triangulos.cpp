#include <iostream>

int main () 
{
    int a, b, c;

    std::cout << "Digite o valor do lado 'a': " << std::endl;
    std::cin >> a;

    std::cout << "Digite o valor do lado 'b': " << std::endl;
    std::cin >> b;

    std::cout << "Digite o valor do lado 'c': " << std::endl;
    std::cin >> c;

    // verificando se eh um triangulo
    if (a < b + c && b < a + c && c < a + b)
    {
        if (a == b && b == c)
        {
            std::cout << "Eh um triangulo equilatero";
        }        
        else if (a == b && b != c || a == c && a != b || b == c && b != a )
        {
            std::cout << "Eh um triangulo isoceles";
        }
        else 
        {
            std::cout << "É um triangulo escaleno";
        }
    } 
}