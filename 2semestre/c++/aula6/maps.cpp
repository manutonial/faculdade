#include <iostream>
#include <map>

int main() {
    std::map<std::string,int> usuarios;

    usuarios["Daniel"] = 31;
    std::cout << "Tamanho da estrutura: " << usuarios.size() << std::endl;

    // coloca key - value
    usuarios.insert(
        {
            "Vitor", 19
        }
    );

    std::cout << usuarios["Vitor"] << std::endl;
    std::cout << usuarios["Daniel"] << std::endl;

    std::cout << "Usando for-each em MAPS:" << std::endl;
    for(auto usuario : usuarios) {
        std::cout << usuario.first << "-" << usuario.second << std::endl;
    }
}