#include <iostream>
#include <fstream>

int main()
{
    system("cls");

    std::ofstream arquivo;
    arquivo.open("teste2.txt", std::ios::app);
    arquivo << "Hello world!";
    arquivo.close();

    return 0;
}