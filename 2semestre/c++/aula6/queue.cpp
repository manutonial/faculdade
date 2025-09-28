#include <iostream>
#include <queue>

int main() {
    
    // em filas a idéia é alterar/acrescentar um elemento por vez
    // sem criar uma lista pré-definida
    // não tem acesso front - back
    // filas apenas remove front e da push pelo back
    std::queue<std::string> frutas;
    frutas.push("uva");
    frutas.push("banana");
    frutas.push("figo");
    frutas.push("abacate");
    
    std::cout << frutas.front() << std::endl;
    std::cout << frutas.back() << std::endl;
    std::cout << frutas.size() << std::endl;
    
    frutas.pop();
    
    std::cout << frutas.front() << std::endl;
    std::cout << frutas.back() << std::endl;
    std::cout << frutas.size() << std::endl;

    return 0;
}