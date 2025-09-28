#include <iostream>
#include <set>

int main() {
    // usando greater fica do maior para o menor
    std::set <int, std::greater <int>> conjunto = {1, 2, 90, 1, 4, 5};
    // esse output mostra que nao inseriu o '1' repetido
    std::cout << "Tamanho atual: " << conjunto.size() << std::endl;

    // ao realizar o for-each, os elementos ficam em ordem
    for(int c : conjunto) {
        std::cout << c << std::endl; 
    }

    conjunto.insert(2);
    std::cout << "Tamanho atual: " << conjunto.size() << std::endl;
    conjunto.insert(3);
    std::cout << "Tamanho atual: " << conjunto.size() << std::endl;
    
    for(int c : conjunto) {
        std::cout << c << std::endl; 
    }

    // apagando o elemento '90' da estrutura
    conjunto.erase(90);
    std::cout << "Tamanho atual: " << conjunto.size() << std::endl;
    for(int c : conjunto) {
        std::cout << c << std::endl; 
    }
}