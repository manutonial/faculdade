#include <iostream>
#include <string>

int main()
{
    std::string s = "Hello";

    // 1. append - concatenar no final
    s.append( "World");
    std::cout << s << std::endl;

    //2. at() - caractere na posicao
    std::cout << s.at(1) << std::endl;

    //3. back() - ultimo caractere
    std::cout << s.back() << std::endl;
  
    //4. front() - primeiro caractere
    std::cout << s.front() << std::endl;

    //5. compare() - comparação lexicografica
    std::string a = "abc", b = "abd";
    std::cout << "Comparacao: " << "\n";
    std::cout << a.compare(b) << std::endl; // negativo (a < b)
    std::cout << b.compare(a) << std::endl; // positivo (a > b)
    
    std::string t = "Example";
    //6. empty() - esta vazio?
    std::cout << t.empty() << std::endl;

    // 7. erase() - apagar caracteres
    t.erase(2,3);
    std::cout << t << std::endl;

    //8. find() - buscar a partir do inicio
    std::string x = "banana";
    std::cout << x.find("na") << std::endl; // 2
    
    //9. insert() - insere na string
    x.insert(3, "XYZ");
    std::cout << x << std::endl; // banXYZana
    
    // 11. operator[] - caractere na posicao (como at())
    std::cout << x[1] << std::endl; // a

    // 12. pop_back() - remove do final da "lista"
    x.pop_back();
    std::cout << x << std::endl; // banXYZan

    // 13. push_back() - insere no final da "lista"
    x.push_back('!');
    std::cout << x << std::endl; // banXYZan!

    // 14. replace() - substitui da posicao X, Y caracteres
    x.replace(3, 3, "++");
    std::cout << x << std::endl; // ban++an!

    // 15. rfind() - procura a partir do final
    std::cout << x.rfind("a") << std::endl; // última posição de 'a'

    // 16. resize() - redimensiona (diminui ou aumenta)
    x.resize(5);
    std::cout << x << std::endl; // ban++

    // 17. size() - tamanho da string
    std::cout << x.size() << std::endl; // 5

    // 18. substr() - retorna parte da string
    std::string y = "computacao";
    std::cout << y.substr(0, 5) << std::endl; // compu

    // 19. swap() - troca as strings de lugar
    std::string p = "abc", q = "xyz";
    std::cout << p << " " << q << std::endl; // xyz abc
    p.swap(q);
    std::cout << p << " " << q << std::endl; // xyz abc

    return 0;
}
