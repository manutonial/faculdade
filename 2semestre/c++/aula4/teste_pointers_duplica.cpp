#include <iostream>

void duplica(int vetor[], int tam)
{
    for(int i = 0; i < tam; i++)
    {
        vetor[i] = vetor[i] * 2;
    }
}

int main(int tam)
{
    int vetor[] = {8, 5, 3};
    duplica(vetor, 3);
    for(int i = 0; i < tam; i++)
    {
        std::cout << vetor[i] << std::endl;
    }
}