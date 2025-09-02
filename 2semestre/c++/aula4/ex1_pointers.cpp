/*
Escreva uma função com a seguinte assinatura:
int recupera(double original[], double novas[], int quant[], double * media)
- deve verificar se no array 'novas' se o valor é maior que o valor de 'original', se for substitui
quant: quantidade de notas em cada array
- atualize a media com a media apos todas as substituições
- retorne quantas notas foram recuperadas.
*/

#include <iostream>

int recupera(double original[], double novas[], int quant, double * media)
{
    int notas_rec = 0;
    double soma = 0;

    for(int i = 0; i < quant; i++)
    {
        if(original[i] < novas[i])
        {
            notas_rec++;
            original[i] = novas[i];
        }
        soma += original[i];
    }
    (*media) = soma / quant;
    return notas_rec;
}


int main()
{
    double orig[] = {6.7, 9.0, 3.5};
    double nov[] = {7.5, 8.8, 5.5};
    double media = 0.0;

    int troca = recupera(orig, nov, 3, &media);
    std::cout << "Notas recuperadas: " << troca <<std::endl;
    std::cout << "Nova media: " << media <<std::endl;
    for(int i = 0; i < 3; i++)
    {
        std::cout << "Nota" << i << ":" << orig[i] << std::endl;
    }

    return 0;
}