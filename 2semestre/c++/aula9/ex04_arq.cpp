#include <iostream>
#include <fstream>
#include <string>

struct Anotacao
{
    std::string descricao;
    std::string categoria;
    int prioridade;
};

int main()
{
    Anotacao nova;

    std::cout << "Digite a descricao da nota: ";
    std::getline(std::cin, nova.descricao);

    std::cout << "Digite a categoria da nota (casa, trabalho, lazer, pessoal): ";
    std::getline(std::cin, nova.categoria);

    std::cout << "Digite a prioridade da nota (1 a 5): ";
    std::cin >> nova.prioridade;

    std::ofstream File("bloco.csv", std::ios::app);
    if (!File)
    {
        std::cerr << "Erro ao abrir o arquivo!" << std::endl;
        return 1;
    }

    File << nova.descricao << "," << nova.categoria << "," << nova.prioridade << std::endl;

    std::cout << "Anotacao salva com sucesso em bloco.csv!" << std::endl;

    return 0;
}
