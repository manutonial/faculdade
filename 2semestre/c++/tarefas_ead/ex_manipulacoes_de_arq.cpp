#include <iomanip>
#include <iostream>
#include <fstream>

using namespace std;
int print_menu();
int main() {

	// Exercício 1: user digita uma quantidade, programa escreve "hello world" X vezes no arquivo, em cada linha
//	ofstream Arquivo;
//	Arquivo.open("teste.txt");
//	int i,qtd;
//	cout << "Digite a quantidade de vezes: ";
//	cin >> qtd;
//	for (i=0;i<qtd;i++)
//		Arquivo << "Hello world!" << endl;
//	Arquivo.close();

	// Exercício 2: user digita o nome do arquivo, o programa mostra no terminal o conteúdo do arquivo
//	string arq;
//	cout << "Digite o nome do arquivo para ler: ";
//	cin >> arq;
//	ifstream File(arq);

	// Maneira 1: leitura linha a linha
//	string linha;
//	while (getline(File,linha)){
//		cout << linha << endl;
//	}

	// Maneira 2: leitura palavra a palavra
//	string palavra;
//	while (!File.eof()){
//		File >> palavra;
//		cout << palavra;
//	}

	// Maneira 3: letra a letra:
//	string letra;
//	while (!File.eof()){
//		cout << (char)File.get();
//	}

	// independente da maneira, encerrar o arquivo ao final
//	File.close();

	// Exercício 3: user escolhe um arquivo e o programa retorna:
	// quantidade de linhas
	// quantidade de espaços
	// quantidade de vírgulas
	// quantidade de caracteres válidos (letras e números)
//	string arq;
//	cout << "Digite o nome do arquivo para ler: ";
//	cin >> arq;
//	ifstream File(arq);
//	if (File.is_open()){
//		char c;
//		int linhas = 0;
//		int espacos = 0;
//		int virgulas = 0;
//		int validos = 0;
//		while (!File.eof()){
//			c = File.get();
//			if (c == ' ') espacos++;
//			else if (c == ',') virgulas++;
//			else if (c == '\n') linhas++;
//			else if (isalnum(c)) validos++;
//		}
//		File.close();
//		cout <<"Linhas: "<<linhas<<endl;
//		cout <<"Espacos: "<<espacos<<endl;
//		cout <<"Virgulas: "<<virgulas<<endl;
//		cout <<"Alfanumericos: "<<validos<<endl;
//	}else{
//		cout << "Falha ao acessar o arquivo!";
//	}


	// Exercício 4: usuário escreve anotação, categoria e prioridade,
	// programa salva (append) as informações separadas por vírgula (arquivo.csv)
//	struct Anotacao{
//		string descricao,categoria;
//		int prioridade;
//	};
//	Anotacao nova;
//	cout << "Digite a descricao da nota: ";
//	getline(cin,nova.descricao);
//////cin >> nova.descricao;
//	cout << "Digite a categoria da nota (casa, trabalho, lazer, pessoal): ";
//	cin >> nova.categoria;
//	cout << "Digite a prioridade da nota (1 a 5): ";
//	cin >> nova.prioridade;
//
//	ofstream File("bloco.csv",ios::app);
//	File << nova.descricao << ',' << nova.categoria << ',' << nova.prioridade << endl;
//	File.close();

	// Exercício 5: Fazer a leitura de um arquivo .csv e mostrar cada entrada em uma tabela formatada
	// nro_linha	prioridade		categoria		descrição
//	struct Anotacao{
//		string descricao,categoria;
//		int prioridade;
//	};
//	Anotacao teste;
//	ifstream csv("bloco.csv");
//	cout << setw(7)<< "Ordem"<<setw(7)<<"Prio."<<setw(10)<<"Categoria"<<"\tDescricao"<<endl;
//	int num = 0;
//	string linha;
//	while (getline(csv,linha)){
//		int fim_desc = linha.find(',');
//		int fim_cat = linha.rfind(',');
//		teste.descricao = linha.substr(0,fim_desc);
//		teste.categoria = linha.substr(fim_desc+1,fim_cat-fim_desc-1);
//		teste.prioridade = stoi(linha.substr(fim_cat+1,1));
//		cout << setw(7) << ++num
//			<< setw(7) << teste.prioridade
//			<< setw(10) << teste.categoria
//			<< "\t" << teste.descricao <<endl;
//	}
//	csv.close();

	/** Exercício 6: Fazer um programa com menu de opções, onde o usuário pode:
	*		1) Ver anotações
	*		2) Criar uma anotação
	*		3) Buscar (ver) uma anotação
	**/
	struct Anotacao {
		string descricao,categoria;
		int prioridade;
	};
	fstream csv("bloco.csv",ios::app | ios::in);
	int op;
	do {
		op = print_menu();
		switch (op) {
			case 1: {
				Anotacao teste;
				cout << setw(7)<< "Ordem"<<setw(7)<<"Prio."<<setw(10)<<"Categoria"<<"\tDescricao"<<endl;
				int num = 0;
				string linha;
				while (getline(csv,linha)) {
					int fim_desc = linha.find(',');
					int fim_cat = linha.rfind(',');
					teste.descricao = linha.substr(0,fim_desc);
					teste.categoria = linha.substr(fim_desc+1,fim_cat-fim_desc-1);
					teste.prioridade = stoi(linha.substr(fim_cat+1,1));
					cout << setw(7) << ++num
					     << setw(7) << teste.prioridade
					     << setw(10) << teste.categoria
					     << "\t" << teste.descricao <<endl;
				}
				cout << endl << endl;
				system("pause");
				csv.clear();
				csv.seekg(0,ios_base::beg);
				
				break;
			}
			case 2: {
				Anotacao nova;
				cout << "Digite a descricao da nota: ";
				getline(cin,nova.descricao);
				cout << "Digite a categoria da nota (casa, trabalho, lazer, pessoal): ";
				cin >> nova.categoria;
				cout << "Digite a prioridade da nota (1 a 5): ";
				cin >> nova.prioridade;

				csv << nova.descricao << ',' << nova.categoria << ',' << nova.prioridade << endl;
				cout << endl << endl;
				cout << "Anotacao salva!" <<endl;
				cout << endl << endl;
				system("pause");
				break;
			}
			case 3: {
				Anotacao leitura;
				cout << "Digite a linha que deseja ler: ";
				int num_linha;
				int num = 0;
				string linha;
				cin >> num_linha;
				while (num <= num_linha && getline(csv,linha)) {
					if (num == num_linha) {
						int fim_desc = linha.find(',');
						int fim_cat = linha.rfind(',');
						leitura.descricao = linha.substr(0,fim_desc);
						leitura.categoria = linha.substr(fim_desc+1,fim_cat-fim_desc-1);
						leitura.prioridade = stoi(linha.substr(fim_cat+1,1));
						cout << "Numero: "<<num_linha<<endl;
						cout << "Descricao: "<<leitura.descricao<<endl;
						cout << "Categoria: "<<leitura.categoria<<endl;
						cout << "Prioridade: "<<leitura.prioridade<<endl;
					}
					num++;
				}
				if (num_linha >= num) cout << "O arquivo nao possui tantas linhas!"<<endl;
				cout << endl;
				system("pause");
				csv.clear();
				csv.seekg(0,ios_base::beg);
				break;
			}
			case 4: {
				cout << endl << endl;
				cout << "Encerrando..." << endl;
				break;
			}
			default: {
				cout << endl << endl;
				cout << "Opcao invalida!" << endl;
				cout << endl << endl;
				system("pause");
				break;
			}
		}
	} while (op != 4);
	
	csv.close();
	return 0;
}

int print_menu() {
	int ret;
	system("cls");
	cout<< "1) Ver anotacoes" << endl
	    << "2) Criar uma anotacao" << endl
	    << "3) Buscar (ver) uma anotacao"<<endl
	    << "4) Encerrar programa"<<endl
	    << "Opcao: ";
	cin >> ret;
	cout << endl << endl;
	return ret;
}