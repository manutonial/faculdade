#include <iostream>

int incremento(int valor)
{
    valor++;
    return valor;
}

// int é endereço de uma variavel inteira
int ptr_incremento(int* valor)
{
    (*valor)++;
    return (*valor);
}

int main()
{
    int numero = 15;
    int resultado;

    std::cout << "Numero (antes): " << numero <<std::endl;
    resultado = incremento(numero);
    std::cout << "Numero (depois): " << numero << std::endl;
    std::cout << "Numero (depois): " << resultado<< std::endl;

    std::cout << "Numero (antes): " << numero <<std::endl;
    resultado = ptr_incremento(&numero);
    std::cout << "Numero (depois): " << numero << std::endl;
    std::cout << "Numero (depois): " << resultado<< std::endl;

    return 0;
}