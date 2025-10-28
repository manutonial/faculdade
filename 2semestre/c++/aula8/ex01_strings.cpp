/*
Dada uma string contendo um nome completo, realize as seguintes operações
1. imprimir o primeiro nome
2. imprimir o ultimo sobrenome
3. imprima o nome invertido
*/

#include <iostream>
#include <string>
#include <algorithm>

int main()
{
    std::string nome = "Emanuel Dagostini Tonial";

    std::string primeiraPalvra = nome.substr(0, nome.find(" "));
    std::cout << primeiraPalvra << std::endl;

    std::string ultimaPalavra = nome.substr(18, nome.find(" "));
    std::cout << ultimaPalavra<< std::endl;
    
    std::string nomeInvertido = "";

    for (int i = nome.length() - 1; i >= 0; i--)
    {
        nomeInvertido += nome.at(i);
    }
    std::cout << nomeInvertido;


    // // jeito preguiçoso do reverse
    // std::reverse(nome.begin(), nome.end());
    // std::cout << nome << std::endl;

    return 0;
}