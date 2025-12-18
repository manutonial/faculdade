# Manipulação de Arquivos em C++ (`<fstream>` e `<filesystem>`)

Guia que contém os principais metódos para manipulação de arquivos em c++.

---

## 1. Biblioteca `<fstream>`

Usada para **abrir, ler e escrever arquivos**.

### Tipos principais

| Tipo            | Uso                | Descrição                                |
|-----------------|--------------------|--------------------------------------------|
| `std::ifstream` | Leitura            | Abre arquivo para entrada                  |
| `std::ofstream` | Escrita            | Abre arquivo para saída                    |
| `std::fstream`  | Leitura + Escrita  | Permite ambas as operações                 |

### Modos de abertura (flags)

| Flag              | Significado                   |
|-------------------|-------------------------------|
| `std::ios::in`    | Leitura                       |
| `std::ios::out`   | Escrita                       |
| `std::ios::app`   | Adiciona ao final             |
| `std::ios::trunc` | Apaga o conteúdo existente    |
| `std::ios::binary`| Abertura em modo binário      |

---

### Exemplo: Ler arquivo linha a linha
	#include <fstream>
	#include <iostream>
	#include <string>

	int main() {
	    std::ifstream file("dados.txt");
	    std::string linha;

	    if (file.is_open()) {
	        while (std::getline(file, linha)) {
	            std::cout << linha << "\n";
	        }
	    }
	}

---

### Exemplo: Escrever em arquivo
	#include <fstream>

	int main() {
	    std::ofstream file("saida.txt", std::ios::app);
	    file << "Nova linha no arquivo.\n";
	}

---

## 2. Biblioteca `<filesystem>` (C++17+)

Usada para **verificar, criar, mover e remover arquivos e diretórios**.

	#include <filesystem>
	namespace fs = std::filesystem;

### Funções mais comuns

| Função                     | Propósito                        | Exemplo                                      |
|---------------------------|----------------------------------|----------------------------------------------|
| `fs::exists(path)`        | Verifica se existe               | `fs::exists("arquivo.txt")`                  |
| `fs::is_directory(path)`  | Checa se é diretório             | `fs::is_directory("pasta/")`                 |
| `fs::create_directory(p)` | Cria diretório                   | `fs::create_directory("nova_pasta")`         |
| `fs::remove(path)`        | Remove arquivo                   | `fs::remove("a.txt")`                        |
| `fs::remove_all(path)`    | Remove diretório recursivamente  | `fs::remove_all("pasta/")`                   |
| `fs::copy(a, b)`          | Copia arquivos/pastas            | `fs::copy("a.txt", "b.txt")`                 |
| `fs::rename(a, b)`        | Renomeia ou move                 | `fs::rename("velho.txt", "novo.txt")`        |
| `fs::file_size(path)`     | Obtém tamanho em bytes           | `auto s = fs::file_size("a.txt");`           |
| `fs::current_path()`      | Obtém caminho atual              | `std::cout << fs::current_path();`           |

---

### Exemplo: Criar diretório se não existir
	#include <iostream>
	#include <filesystem>

	namespace fs = std::filesystem;

	int main() {
	    if (!fs::exists("logs")) {
	        fs::create_directory("logs");
	        std::cout << "Pasta criada.\n";
	    }
	}

---

### Exemplo: Listar arquivos de um diretório
	#include <filesystem>
	#include <iostream>

	namespace fs = std::filesystem;

	int main() {
	    for (auto& entry : fs::directory_iterator(".")) {
	        std::cout << entry.path() << "\n";
	    }
	}

---

## 3. Resumo Geral

| Biblioteca     | Função Principal                           | Quando usar |
|----------------|---------------------------------------------|------------|
| `<fstream>`     | Abrir, ler e escrever conteúdo de arquivos  | Manipular dados internos do arquivo |
| `<filesystem>`  | Gerenciar arquivos e diretórios no sistema  | Estrutura, existência, cópia, remoção |

---

## Referências

- https://en.cppreference.com/w/cpp/io/basic_fstream  
- https://en.cppreference.com/w/cpp/filesystem  

