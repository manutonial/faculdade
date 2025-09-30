#include <iostream>
#include <iomanip>

int main () {
    int num = 567;

    std::cout << num << "\n";
    // mudança de base
    std::cout << std::hex << num << "\n";
    std::cout << std::oct << num << "\n";
    std::cout << std::dec << num << "\n";
    std::cout << std::hex << std::showbase << num << "\n";
    std::cout << std::oct << std::showbase << num << "\n";
    
    // formatação de float
    double valor = 1786.576;
    std::cout << valor << "\n";
    std::cout << std::setprecision(4) << std::fixed << valor << "\n";

    double numeros[] = {1.75, 13.1, 14.567, 120.2, 1300.68, 890};
    for (double numero : numeros) {
        std::cout << std::setw(9) << numero << "\n";
    }
    std::string frutas[] = {"uva", "banana", "figo", "laranja", "fruta-do-conde"};
    for(std::string fruta : frutas) {
        std::cout << std::setw(15) << std::left << fruta << "--- \n";
    }

    bool opcao = true;
    bool outro = false;
    // usando o padrão da output em 0/1
    std::cout << opcao << std::endl;
    std::cout << false << std::endl;
    
    // com std::boolalpha ele mostra como true or false
    std::cout << std::boolalpha << opcao << "\n";
    std::cout << outro << "\n";
    return 0;
}