/*
Escreva uma função que receba um array de inteiros e inverta a posição de valores:
da 0 para n - 1, 1 para n - 2, e assim por diante

ex: int vetor [] = {10, 15, 7, 0}
depois --> {0, 7, 15, 10}
*/

#include <iostream>

void inverteArray(int vetor[], int tam)
{   
    int temp;
    for(int i = 0; i < tam / 2; i++)
    {
        temp = vetor[i];
        vetor[i] = vetor[tam - i - 1];
        vetor[tam - i - 1] = temp;
    }
}

int main()
{
    int numeros[] = {10, 15, 25, 35 ,55};
    for(int n : numeros)
    {
        std::cout << n << " ";
    }

    
    std::cout << "------------------------------------" << std::endl;

    inverteArray(numeros, 5);
    
    for(int n : numeros)
    {
        std::cout << n << " ";
    }

    return 0;
}