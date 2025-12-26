package com.application;

import java.util.Scanner;

public class L2Q2 {

    // contador de chamdas para o MergeSort
    static int contadorChamadas = 0;

    /*
      Procedimento principal do MergeSort:

      vetor - array de inteiros a ser ordenado
      p - índice do limite inferior (esquerda)
      r - índice do limite superior (direita)
     */
    static void mergesort(int[] vetor, int p, int r) {
        // Incrementa contador de chamadas
        contadorChamadas++;

        // Imprime mensagem de empilhamento
        System.out.println("mergesort " + p + " " + r + ": empilhado");

        // Condição de para parar: se existe mais de um elemento
        if (p < r) {
            // Calcula o índice do meio
            int q = (p + r) / 2;

            // Ordena a primeira metade
            mergesort(vetor, p, q);

            // Ordena a segunda metade
            mergesort(vetor, q + 1, r);

            // Mescla as duas metades ordenadas
            merge(vetor, p, q, r);
        }

        // Imprime mensagem de desempilhamento
        System.out.println("mergesort " + p + " " + r + ": desempilhado!");
    }

    /*
      Procedimento Merge - mescla dois subvetores ordenados
       vetor - array original
       p - início do primeiro subvetor
       q - fim do primeiro subvetor / meio
       r - fim do segundo subvetor
     */
    static void merge(int[] vetor, int p, int q, int r) {
        // Imprime mensagem do merge
        System.out.println("merge " + p + " " + q + " " + r);

        // Calcula tamanhos dos subvetores
        int n1 = q - p + 1;  // Tamanho do subvetor esquerdo
        int n2 = r - q;      // Tamanho do subvetor direito

        // Cria arrays temporários
        int[] esquerda = new int[n1];
        int[] direita = new int[n2];

        // Copia dados para os arrays temporários
        for (int i = 0; i < n1; i++) {
            esquerda[i] = vetor[p + i];
        }
        for (int j = 0; j < n2; j++) {
            direita[j] = vetor[q + 1 + j];
        }

        // Mescla os arrays temporários de volta ao vetor original
        int i = 0;  // Índice inicial do subvetor esquerdo
        int j = 0;  // Índice inicial do subvetor direito
        int k = p;  // Índice inicial do vetor mesclado

        // Enquanto houver elementos em ambos os subvetores
        while (i < n1 && j < n2) {
            if (esquerda[i] <= direita[j]) {
                vetor[k] = esquerda[i];
                i++;
            } else {
                vetor[k] = direita[j];
                j++;
            }
            k++;
        }

        // Copia os elementos restantes de esquerda (se houver)
        while (i < n1) {
            vetor[k] = esquerda[i];
            i++;
            k++;
        }

        // Copia os elementos restantes de direita (se houver)
        while (j < n2) {
            vetor[k] = direita[j];
            j++;
            k++;
        }

        // Imprime o vetor após o merge
        imprimirVetor(vetor);
    }

    /**
     * Procedimento auxiliar para imprimir o vetor
     * @param vetor - array a ser impresso
     */
    static void imprimirVetor(int[] vetor) {
        System.out.print("[");
        for (int i = 0; i < vetor.length; i++) {
            System.out.print(vetor[i]);
            if (i < vetor.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println("]");
    }

    // Método Main:

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Solicita o tamanho do vetor
        System.out.print("Digite o tamanho M do vetor: ");
        int m = scanner.nextInt();

        // Cria o vetor estático
        int[] vetor = new int[m];

        // Preenche o vetor com dados do usuário
        System.out.println("Digite os " + m + " elementos do vetor:");
        for (int i = 0; i < m; i++) {
            System.out.print("Elemento [" + i + "]: ");
            vetor[i] = scanner.nextInt();
        }

        // Imprime o vetor original
        System.out.println("\nVetor original:");
        imprimirVetor(vetor);

        System.out.println("\n MERGESORT \n");

        // Executa o MergeSort
        mergesort(vetor, 0, m - 1);

        // Imprime o resultado final
        System.out.println("\n RESULTAD0");
        System.out.println("Vetor ordenado:");
        imprimirVetor(vetor);
        System.out.println("\nNúmero total de chamadas ao mergesort: " + contadorChamadas);

        scanner.close();
    }
}
