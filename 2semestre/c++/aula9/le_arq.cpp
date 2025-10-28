#include <iostream>
#include <fstream>

int main()
{
    system("cls");
    
    // leitura em arquivo
    std::ifstream arq("teste3.txt");
    std::string texto1, texto2;
    arq >> texto1;
    arq >> texto2;
    
    std::cout << texto1 << texto2;
    
    arq.close();
    
    return 0;
}
