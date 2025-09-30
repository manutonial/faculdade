/*
Implemente um programa que crie um arquivo com uma lista de tarefas.
Cada tarefa deve ter: descrição, categoria (casa, trabalho, lazer, pessoal) 
e prioridade (1 a 5)
*/
#include <iostream>
#include <fstream>
#include <vector>
#include <algorithm>

struct Tarefa {
    std::string descricao;
    std::string categoria;
    int prioridade;
};

int main() {
    std::vector <Tarefa> tarefas;

    std::cout <<"---- TODO LIST ----\n";

    char opcao;
    do {
        Tarefa t;

        std::cout << "Digite a descricao da tarefa: ";
        std::cin >> t.descricao;

        std::cout << "Digite a categoria da tarefa (casa, trabalho, lazer, pessoal): ";
        std::cin >> t.categoria;

        std::cout << "Digite a prioridade da tarefa (1 a 5): ";
        std::cin >> t.prioridade;

        tarefas.push_back(t);
        
        std::cout << "Deseja continuar (s/n)";
        std::cin >> opcao;

    } while(opcao == 's'|| opcao == 'S');

    std::sort(tarefas.begin(), tarefas.end(), [](const Tarefa& a, const Tarefa& b) {
        return a.prioridade > b.prioridade; // ordena pela maior prioridade
    });

    std::ofstream arquivo ("TODO.txt");
    for (size_t i = 0; i < tarefas.size(); i++) {
        arquivo << "Descricao: " << tarefas[i].descricao << "\n";
        arquivo << "Categoria: " << tarefas[i].categoria << "\n";
        arquivo << "Prioridade: " << tarefas[i].prioridade << "\n";
        arquivo << "-----------------------------\n";
    }
    arquivo.close();
    
    return 0;
}

