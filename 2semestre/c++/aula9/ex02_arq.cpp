#include <iostream>
#include <fstream>
#include <string>

int main ()
{
    std::string nome_arquivo;
    std::cout << "Digite o nome do arquivo: ";
    std::cin >> nome_arquivo;
    std::ifstream File(nome_arquivo);

    // maneira 1: le linha a linha
    std::string linha;
    while(std::getline(File, linha))
    {
        std::cout << linha << std::endl;
    }

    // maneira 2: ler uma palavra por vez
    // std::string palavra;
    // while(!File.eof())
    // {
    //     File >> palavra;
    //     std::cout << palavra;
    // }


    // maneira 3: letra a letra
    // while(!File.eof())
    // {
    //     std::cout << (char)File.get();
    // }
    
    return 0;
}   