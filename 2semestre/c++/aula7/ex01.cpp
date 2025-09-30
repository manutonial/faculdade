#include <iostream>
#include <iomanip>
#include <fstream>

int main () {
    std::ofstream arqProd("produtos.txt");
    std::string produtos[] = {"agua mineral", "refrigerante", "suco", "copo descartavel"};
    int quant[] = {120, 50, 60, 250};
    double precoUnitario[] = {0.69, 2.45, 5.7, 0.2};

    // Exibir um relatório formatado em espacos e casas decimais contendo:
    // PRODUTO QUANTIDADE PRECO_UNITARIO PRECO_TOTAL
    // std::cout << std::fixed;
    arqProd << std::left; 
    arqProd << std::setw(16) << "PRODUTO";
    arqProd << std::setw(11) << "QUANTIDADE";
    arqProd << std::setw(15) << "PRECO_UNITARIO";
    arqProd << std::setw(10) << "PRECO_TOTAL" << std::endl;

    double somaTotal = 0;
    for(int i = 0; i < 4; i++) {
        arqProd << std::setw(23) << produtos[i];
        arqProd << std::setw(14) << quant[i];
        arqProd << std::setw(12) << precoUnitario[i];
        double precoTotal = quant[i] * precoUnitario[i];
        somaTotal += precoTotal;
        arqProd << std::setw(15) << precoTotal << "\n";
    }
    arqProd << std::setw(43) << "" << "TOTAL: " << somaTotal;
    


}