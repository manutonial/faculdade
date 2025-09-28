#include <vector>
#include <iostream>

int main() {
    std::vector<std::string> frutas = 
    {"uva", "banana", 
        "maça", "abacate"};

    std::cout << frutas[0] << std::endl;
    std::cout << frutas.at(0) << std::endl;
    std::cout << frutas.front() << std::endl;
    std::cout << frutas.back() << std::endl;

    for (std::string fruta : frutas) {
        std::cout << fruta << std::endl;
    }

    std::cout << frutas.at(2) << std::endl;
    frutas[2] = "kiwi";
    std::cout << frutas.at(2) << std::endl;
    
    std::cout << "Inserção com PUSH_BACK" << std::endl;
    frutas.push_back("banana");
    for (std::string fruta : frutas) {
        std::cout << fruta << std::endl;
    }

    std::cout << "remoção com POP_BACK" << std::endl;
    frutas.pop_back();
    for (std::string fruta : frutas) {
        std::cout << fruta << std::endl;
    }

    std::cout << "tamanho (numero de elementos): " << frutas.size() << std::endl;
    std::cout << "Está vazia?" << frutas.empty() << std::endl;

    return 0;
}