#include <iostream>
#include <fstream>

int main()
{
    system("cls");

    std::ofstream arquivo;
    arquivo.open("teste1.txt");
    arquivo << "Hello world!";
    arquivo.close();

    return 0;
}