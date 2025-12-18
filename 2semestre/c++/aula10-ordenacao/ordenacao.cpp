#include <iostream>
#include <vector>

void insertArray(std::vector<int>& array, const int tamanho) {
    for(int i = 0; i < tamanho; i++) {
        std::cout << "Valor da posicao " << i << ": ";
        int valor;
        std::cin >> valor;
        array.push_back(valor);
    }
}

void readArray(const std::vector<int>& array) {
    for (int elem : array) {
        std::cout << elem << " ";
    }
    std::cout << "\n";
}

void bubbleSort(std::vector<int>& array) {
    int n = array.size();
    bool trocou;
    for (int i = 0; i < n - 1; i++) {
        trocou = false;
        for (int j = 0; j < n - i - 1; j++) {
            if (array[j] > array[j + 1]) {
                std::swap(array[j], array[j + 1]);
                trocou = true;
            }
        }
        if (!trocou) break;
    }
}

void insertionSort(std::vector<int>& array) {
    int n = array.size();
    for (int i = 1; i < n; i++) {
        int chave = array[i];
        int j = i - 1;
        while (j >= 0 && array[j] > chave) {
            array[j + 1] = array[j];
            j--;
        }
        array[j + 1] = chave;
    }
}

void selectionSort(std::vector<int>& array) {
    int n = array.size();
    for (int i = 0; i < n - 1; i++) {
        int indiceMenor = i;
        for (int j = i + 1; j < n; j++) {
            if (array[j] < array[indiceMenor]) {
                indiceMenor = j;
            }
        }
        if (indiceMenor != i) {
            std::swap(array[i], array[indiceMenor]);
        }
    }
}

int main() {
    const int tamanho = 5;
    std::vector<int> vetOrdenar;

    insertArray(vetOrdenar, tamanho);
    std::cout << "Original: ";
    readArray(vetOrdenar);

    bubbleSort(vetOrdenar);
    std::cout << "Bubble Sort:   ";
    readArray(vetOrdenar);

    insertionSort(vetOrdenar);
    std::cout << "Insertion Sort:";
    readArray(vetOrdenar);

    selectionSort(vetOrdenar);
    std::cout << "Selection Sort:";
    readArray(vetOrdenar);

    return 0;
}