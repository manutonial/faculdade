#include <iostream>
#include <fstream>
#include <string>

struct Tabela
{
    int num_linha;
    int prioridade;
    std::string categoria;
    std::string descricao;
};

// Função para obter a última linha do arquivo e determinar o próximo número de linha
int proximo_num_linha(const std::string &nome_arquivo)
{
    std::ifstream file(nome_arquivo);
    std::string linha;
    int ultimo_num = 0;

    while (std::getline(file, linha))
    {
        size_t pos = linha.find(',');
        if (pos != std::string::npos)
        {
            try
            {
                ultimo_num = std::stoi(linha.substr(0, pos));
            }
            catch (...) {}
        }
    }

    return ultimo_num + 1;
}

int main()
{
    std::string nome_arquivo = "tabela_anotacoes.csv";

    // Abre para leitura e escrita, cria se não existir
    std::fstream File(nome_arquivo, std::ios::in | std::ios::out | std::ios::app);
    if (!File.is_open())
    {
        std::cerr << "Erro ao abrir/criar o arquivo!" << std::endl;
        return 1;
    }

    // Lê e exibe as linhas existentes
    std::string linha;
    std::cout << "Linha | Prioridade | Categoria | Descricao" << std::endl;
    std::cout << "-------------------------------------------" << std::endl;

    while (std::getline(File, linha))
    {
        std::cout << linha << std::endl;
    }

    // Solicita novos dados ao usuário
    Tabela novo_item;
    novo_item.num_linha = proximo_num_linha(nome_arquivo);

    std::cout << "\nDigite a prioridade: ";
    std::cin >> novo_item.prioridade;
    std::cin.ignore(); // descarta o '\n' do buffer

    std::cout << "Digite a categoria: ";
    std::getline(std::cin, novo_item.categoria);

    std::cout << "Digite a descricao: ";
    std::getline(std::cin, novo_item.descricao);

    // Escreve no arquivo (append)
    File.clear(); // limpa flags de EOF
    File << novo_item.num_linha << ","
         << novo_item.prioridade << ","
         << novo_item.categoria << ","
         << novo_item.descricao << std::endl;

    std::cout << "Anotacao adicionada com sucesso!" << std::endl;

    File.close();
    return 0;
}
