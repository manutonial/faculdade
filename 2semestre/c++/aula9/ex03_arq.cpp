/*
Exercicio 3: user escolhe um arquivo e o programa retorna:
- quantidade de linhas
- quantidade de espaços
- quantidade de vírgulas
- quantidade de caracteres válidos (letras e números)
*/

#include <iostream>
#include <fstream>
#include <string>

int main ()
{
    std::string nome_arquivo;
    std::cout << "Digite o nome do arquivo:";
    std::cin >> nome_arquivo;
    std::ifstream File(nome_arquivo);

    if(File.is_open()) 
    {
        char c;
        int quant_linhas = 1;
        int quant_espacos = 0;
        int quant_virgulas;
        int quant_carac_validos;

        while (!File.eof())
        {
            c = File.get();
            if (c == ' ')  
                quant_espacos++;
            else if (c == ',')
                quant_virgulas++;
            else if (c == '\n')
                quant_linhas++;
            else if (isalnum(c)) 
                quant_carac_validos++;
        }

        std::cout << "Quantidade de linhas: " << quant_linhas << std::endl;
        std::cout << "Quantidade de espacos: " << quant_espacos << std::endl;
        std::cout << "Quantidade de viruglas: " << quant_virgulas << std::endl;
        std::cout << "Quantidade de caracteres validos: " << quant_carac_validos << std::endl;

    } 
    else 
        std::cout << "Erro ao abrir arquivo";
    
    
    return 0;
}