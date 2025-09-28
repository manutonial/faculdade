/*
Etapa 1-

Considere uma situação que é necessário implementar algumas funcionalidades de um diário
escolar. Para esse momento, só são permitidos para uso os tipos de dados primitivos e arrays.
O diário precisa considerar o aramzenamento das seguintes informaçoes:
- codigo do aluno
- nome do aluno
- as notas das avaliações (min 2, max 10)
- numero de faltas
- media

Fazer um codigo cpp que declare essas estruturas de dados

Etapa 2-
Implemente uma ou mais funções que permitam ler a quantidade de alunos e de avaliações do semestre.
Em seguida, crie essas estruturas

Etapa 3- Implemente uma ou mais funções que permitam ler o código e o nome dos alunos
e armazene-os nas esturutras de dados criadas
*/
#include <iostream>
#include <string>

std::string *codigo;
std::string *nome;
double **notas;
int *faltas;
double *media;

void criar_alunos(int quant)
{
    codigo = new std::string[quant];
    nome = new std::string[quant];
    notas = new double *[quant];
    faltas = new int[quant];
    media = new double[quant];
}

void criar_notas(int alunos, int quantidade_notas)
{
    for (int i = 0; i < alunos; i++)
    {
        notas[i] = new double[quantidade_notas];
    }
}

void ler_aluno(int indice)
{
    std::cout << "Codigo" << indice << ": ";
    std::cin >> codigo[indice];
    std::cout << "Aluno" << indice << ": ";
    std::cin >> nome[indice];
}

void ler_alunos(int numero_alunos)
{
    for (int i = 0; i < numero_alunos; i++)
    {
        ler_aluno(i);
    }
}

void ler_avalicao(int numero_alunos, int numero_notas)
{
    for (int i = 0; i < numero_notas; i++)
    {
        std::cout << "Aluno: " << nome[i] << std::endl;
        std::cout << "Nota: " <<
    }

    void ler_todas_avaliacoes(int numero_alunos, int numero_notas)
    {
        for (int i = 0; i < numero_notas; i++)
        {
            ler
        }
    }
}
int main()
{

    return 0;
}