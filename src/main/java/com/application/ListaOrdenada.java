package com.application;

class ListaOrdenada {
    int[] elementos;
    int tamanho;
    int capacidade;

    //O tamanho M inicial deve ser definido pelo usuário no início do uso da aplicação (parâmetro).

    ListaOrdenada(int m) {
        capacidade = m;
        tamanho = 0;
        elementos = new int[capacidade];
    }
// também satisfaz a letra C pois a lista está sendo iniciada vazia

    // (Impressão)
    void visualizar() {
        System.out.println("Capacidade: " + capacidade);
        System.out.println("Tamanho: " + tamanho);
        System.out.print("Elementos: [");

        for (int i = 0; i < capacidade; i++) {
            if (i < tamanho) {
                System.out.print(elementos[i]);
            } else {
                System.out.print("NIL");
            }

            if (i < capacidade - 1) {
                System.out.print(", ");
            }
        }
        System.out.println("]");
    }
// “NIL” está sendo imprimido como um nome “NIL” para seguir a questão já que na linguagem java é retornado 0 ou Null.

    // (BUSCA)
    int buscar(int valor) {
        // Busca sequencial (pode parar quando encontrar valor maior)
        for (int i = 0; i < tamanho; i++) {
            if (elementos[i] == valor) {
                return i; // Encontrado
            }
            if (elementos[i] > valor) {
                break; // Não precisa continuar, já passou
            }
        }
        return -1; // Não encontrado
    }


    // (INSERÇÃO)
    void inserir(int valor) {
        // Verifica se a lista está cheia
        if (tamanho == capacidade) {
            redimensionar();
        }

        // Encontra a posição correta para manter ordem crescente
        int posicao = 0;
        while (posicao < tamanho && elementos[posicao] < valor) {
            posicao++;
        }

// Abre espaço: move elementos para direita

        for (int i = tamanho; i > posicao; i--) {
            elementos[i] = elementos[i - 1];
        }

        // Insere o elemento na posição correta
        elementos[posicao] = valor;
        tamanho++;

        System.out.println("Elemento " + valor + " inserido com sucesso na posição " + posicao);
    }

    // Redimensiona o array quando fica cheio (duplica capacidade)
    void redimensionar() {
        int novaCapacidade = capacidade * 2;
        int[] novoArray = new int[novaCapacidade];

        // Copia todos os elementos para o novo array
        for (int i = 0; i < tamanho; i++) {
            novoArray[i] = elementos[i];
        }

        // Substitui o array antigo pelo novo
        elementos = novoArray;
        capacidade = novaCapacidade;

        System.out.println("Nova capacidade: " + capacidade);
    }

    //(REMOÇÃO)
    void remover(int valor) {
        // Busca o elemento
        int posicao = buscar(valor);

        // Verifica se encontrou
        if (posicao == -1) {
            System.out.println("Elemento " + valor + "não encintrado");
            return;
        }

        // Remove: move elementos para esquerda
        for (int i = posicao; i < tamanho - 1; i++) {
            elementos[i] = elementos[i + 1];
        }

        tamanho--;
        System.out.println("Elemento " + valor + " removido ");
    }
}
