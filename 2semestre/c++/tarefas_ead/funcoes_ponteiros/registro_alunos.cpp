#include <string>
#include <iostream>

using namespace std;

/*
   Este trabalho mostra como usar funções junto com ponteiros em C++.
   A ideia é criar espaços na memória (com new) para guardar dados que
   só vamos saber em tempo de execução, como quantidade de alunos e
   número de notas.

   Os ponteiros servem para acessar e manipular esses dados em qualquer
   função do programa. Por exemplo:
   - string* e int* guardam listas simples (nomes, códigos, faltas).
   - double** cria uma matriz dinâmica para as notas (alunos x avaliações).
   - cada função trabalha sobre os mesmos ponteiros, por isso todas as
	 alterações ficam disponíveis no programa inteiro.

   Assim conseguimos um programa flexível, que cresce de acordo com a
   entrada do usuário, sem precisar de arrays fixos. O exercício serve
   justamente para treinar alocação dinâmica, manipulação de arrays e
   uso de ponteiros em funções.
*/

string *codigo;
string *nome;
double **notas;
int *faltas;
double *media;

void criaAlunos(int quant)
{
	codigo = new string[quant];
	nome = new string[quant];
	notas = new double *[quant];
	faltas = new int[quant];
	media = new double[quant];
}

void criaNotas(int alunos, int quantNotas)
{
	for (int i = 0; i < alunos; i++)
	{
		notas[i] = new double[quantNotas];
	}
}

void leituraAluno(int indice)
{
	cout << "Codigo[" << indice << "]: ";
	cin >> codigo[indice];
	cout << "Aluno[" << indice << "]: ";
	cin >> nome[indice];
}

void leituraAlunos(int numAlunos)
{
	for (int i = 0; i < numAlunos; i++)
	{
		leituraAluno(i);
	}
}

void leituraAvaliacao(int numAlunos, int numAvaliacao)
{
	for (int i = 0; i < numAlunos; i++)
	{
		cout << "Aluno: " << nome[i] << endl;
		cout << "Nota " << numAvaliacao + 1 << ": ";
		cin >> notas[i][numAvaliacao];
	}
}

void leituraTodasAvaliacoes(int numAlunos, int numNotas)
{
	for (int i = 0; i < numNotas; i++)
	{
		leituraAvaliacao(numAlunos, i);
	}
}

void atualizaMedia(int numAlunos, int numNotas)
{
	double soma;
	for (int a = 0; a < numAlunos; a++)
	{
		soma = 0;
		for (int n = 0; n < numNotas; n++)
		{
			soma += notas[a][n];
		}
		media[a] = soma / numNotas;
	}
}

void leituraFaltas(int numAlunos)
{
	for (int i = 0; i < numAlunos; i++)
	{
		cout << "Faltas do aluno " << nome[i] << ": ";
		cin >> faltas[i];
	}
}

void relatorio(int numAlunos)
{
	cout << "\n--- RELATORIO FINAL ---\n";
	for (int i = 0; i < numAlunos; i++)
	{
		cout << "Codigo: " << codigo[i]
			 << " | Nome: " << nome[i]
			 << " | Media: " << media[i]
			 << " | Faltas: " << faltas[i]
			 << endl;
	}
}

int main()
{
	int numAlunos, numNotas;

	cout << "Quantos alunos? ";
	cin >> numAlunos;
	cout << "Quantas avaliacoes? ";
	cin >> numNotas;

	criaAlunos(numAlunos);
	criaNotas(numAlunos, numNotas);
	leituraAlunos(numAlunos);
	leituraTodasAvaliacoes(numAlunos, numNotas);
	atualizaMedia(numAlunos, numNotas);
	leituraFaltas(numAlunos);
	relatorio(numAlunos);

	return 0;
}
