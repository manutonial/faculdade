#include <fstream>

int main () {
    // Criando um arquivo com o nome teste.txt
    std::ofstream arquivo("teste.txt");
    arquivo << "Alguns dados" <<  "\n";
    arquivo << 12345 <<  "\n";
    arquivo << 2.768 <<  "\n";
    
    arquivo.close()
}   