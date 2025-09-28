#include <iostream>
#include <list>

int main() {
    std::list<std::string> frutas = 
    {"uva", "banana", 
        "maça", "abacate"};

    // listas não são acessiveis por indice
    // std::cout << frutas[0] << std::endl;
    // std::cout << frutas.at(0) << std::endl;

    // acessa os elementos por front e back
    std::cout << frutas.front() << std::endl;
    std::cout << frutas.back() << std::endl;

    for (std::string fruta : frutas) {
        std::cout << fruta << std::endl;
    }

    // std::cout << frutas.at(2) << std::endl;
    // frutas[2] = "kiwi";
    // std::cout << frutas.at(2) << std::endl;
    
    
    std::cout << "Inserção com PUSH_BACK e PUSH_FRONT" << std::endl;
    frutas.push_back("banana");
    frutas.push_front("laranja");
    for (std::string fruta : frutas) {
        std::cout << fruta << std::endl;
    }

    std::cout << "remoção com POP_BACK e POP_FRONT" << std::endl;
    frutas.pop_back();
    frutas.pop_front();
    for (std::string fruta : frutas) {
        std::cout << fruta << std::endl;
    }

    std::cout << "tamanho (numero de elementos): " << frutas.size() << std::endl;
    std::cout << "Está vazia?" << frutas.empty() << std::endl;

    return 0;
}