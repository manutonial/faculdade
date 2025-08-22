/* Leia 2 caracteristicas de um animal
A = 1 - mamifero, 2 - ave
B = 1 - herbivoro, 2 - carnivoro
Se o animal for mamifero e herbivoro, é uma vaca
mamifero e carnivaro uma onca
ave e herbivero um sabia
ave e carnivoro um gaviao

*/

#include <iostream>

int main ()
{
   
    int opcao_classe, opcao_dieta;
    
    std::cout << "1 - mamifero, 2 - ave";
    std::cin >> opcao_classe;

    std::cout << "1 - herbivoro, 2 - carnivoro";
    std::cin >> opcao_dieta;

    if (opcao_classe == 1 && opcao_dieta == 1) 
    {
        std::cout << "O animal eh uma vaca!";
    }
    else if (opcao_classe == 1 && opcao_dieta == 2)
    {
        std::cout << "O animal eh uma onca";
    }
    else if (opcao_classe == 2 && opcao_dieta == 1)
    {
        std::cout << "O animal eh um sabia";
    } 
    else if (opcao_classe == 2 && opcao_dieta == 2) 
    {
        std::cout << "O animal eh um gaviao";
    }
    else
    {
        std::cout << "Opcao invalida!";
    }
}