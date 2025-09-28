#include <iostream>
#include <deque>

int main() {
    
    // da para acessar pelo indice
    // é uma mistura de vector e list
    // da para acessar tanto pelo indice, 
    // quanto fazer inserção no front - back
    std::deque<std::string> frutas = {
        "uva", "banana",
        "morango", "maca"};

        std::cout << "elemento de indice 2" << std::endl;
        std::cout << frutas[2] << std::endl;
        std::cout << frutas.at(2) << std::endl;

        std::cout << "Fazendo for-each:" << std::endl;
        for(std::string fruta : frutas) {
            std::cout << fruta << std::endl;
        }

        std::cout << "Alterando o elemento de indice 2:" << std::endl;
        frutas.at(2) = "laranja";
        std::cout << frutas[2] << std::endl;

        std::cout << "Consultando o FRONT e o BACK:" << std::endl;
        std::cout << frutas.front() << std::endl;
        std::cout << frutas.back() << std::endl;

        std::cout << "Inserção com PUSH_FRONT e PUSH_BACK: ";
        frutas.push_front("abacate");
        frutas.push_back("kiwi");

        std::cout << "Fazendo for-each:" << std::endl;
        for(std::string fruta : frutas) {
            std::cout << fruta << std::endl;
        }

        std::cout << "Tamanho atual:" << frutas.size() << std::endl;
        std::cout << "Removendo com POP_FRONT e POP_BACK():" << std::endl;
        frutas.pop_front();
        frutas.pop_back();
        for(std::string fruta : frutas) {
            std::cout << fruta << std::endl;
        }

        std::cout << "Tamanho apos remocao: " << frutas.size() << std::endl;


    return 0;
}