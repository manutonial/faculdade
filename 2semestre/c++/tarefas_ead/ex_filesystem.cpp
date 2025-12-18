#include <iostream>
#include <fstream>
#include <filesystem>
#include <map>

namespace fs = std::filesystem;

int main() {
    
    std::string nomeArquivo = "arquivo.txt";
    std::ofstream arq(nomeArquivo);
    arq << "Este é um arquivo criado para testar fstream e filesystem.\n";
    arq << "Podemos escrever quantas linhas quisermos aqui.\n";
    arq.close();
    std::cout << "Arquivo criado: " << nomeArquivo << std::endl << std::endl;

    fs::path p = nomeArquivo;
    if(fs::exists(p)){
        std::cout << "Nome do arquivo: " << p.filename() << std::endl;
        std::cout << "Extensão: " << p.extension() << std::endl;
        std::cout << "Tamanho (bytes): " << fs::file_size(p) << std::endl;
        std::cout << "Caminho absoluto: " << fs::absolute(p) << std::endl;
    } else {
        std::cout << "Erro: arquivo nao encontrado!" << std::endl;
        return 1;
    }

    std::cout << "\nDigite um caminho/pasta para listar arquivos: ";
    std::string caminho;
    std::cin >> caminho;

    if (!fs::exists(caminho)) {
        std::cout << "Caminho invalido!" << std::endl;
        return 1;
    }

    int cont_arquivos = 0, cont_pastas = 0;
    std::map<std::string,int> cont_ext;

    std::cout << "\nConteúdo da pasta:\n";
    for (const auto &item : fs::directory_iterator(caminho)) {
        std::cout << " - " << item.path().filename().string() << std::endl;

        if (item.is_directory()) cont_pastas++;
        else if (item.is_regular_file()) {
            cont_arquivos++;
            cont_ext[item.path().extension().string()]++;
        }
    }

    std::cout << "\nQuantidade de arquivos: " << cont_arquivos << std::endl;
    std::cout << "Quantidade de pastas: " << cont_pastas << std::endl;

    std::cout << "\nQuantidade de extensoes diferentes: " << cont_ext.size() << std::endl;

    std::cout << "\nQuantidade de arquivos por extensão:\n";
    for (auto &par : cont_ext) {
        std::cout << par.first << " : " << par.second << std::endl;
    }

    return 0;
}
