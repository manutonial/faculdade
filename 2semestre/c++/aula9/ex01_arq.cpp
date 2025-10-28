#include <iostream>
#include <fstream>

int main ()
{   
    int num;
    std::cin >> num;

    std::ofstream arquivo;
    arquivo.open("ex01.txt");

    for (int i = 0; i < num; i++) 
    {   
        arquivo << "Hello world!" << std::endl;
    }

    arquivo.close();
    
    return 0;
}