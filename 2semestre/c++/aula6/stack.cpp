#include <iostream>
#include <stack>

    // listas não são acessiveis por indice
    // std::cout << frutas[0] << std::endl;
    // std::cout << frutas.at(0) << std::endl;


int main() {
    
    // em pilhas a idéia é alterar/acrescentar um elemento por vez
    // sem criar uma lista pré-definida
    // não tem acesso front - back
    std::stack<std::string> frutas;
    frutas.push("uva");
    frutas.push("banana");
    frutas.push("figo");
    frutas.push("abacate");

    std::cout << frutas.top() << std::endl;

    // remocao apenas com pop
    frutas.pop();
    std::cout << frutas.top() << std::endl;

    return 0;
}