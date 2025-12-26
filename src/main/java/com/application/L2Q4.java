package com.application;

import java.util.Scanner;

public class L2Q4 {

    // Variaveis globais para contadores
    static int contadorTrocas = 0;
    static int contadorMaxHeapify = 0;
    static int tamanhoHeap = 0;

    // Procedimento para trocar dois elementos no vetor
    public static void trocar(int[] vetor, int i, int j) {
        int temp = vetor[i];
        vetor[i] = vetor[j];
        vetor[j] = temp;
        contadorTrocas = contadorTrocas + 1;
    }

    // Procedimento para imprimir o vetor
    public static void imprimirVetor(int[] vetor, int tamanho) {
        int i = 0;
        while (i < tamanho) {
            System.out.print(vetor[i]);
            if (i < tamanho - 1) {
                System.out.print(" ");
            }
            i = i + 1;
        }
        System.out.println();
    }

    // Procedimento para obter o indice do filho esquerdo
    public static int esquerdo(int i) {
        return 2 * i + 1;
    }

    // Procedimento para obter o indice do filho direito
    public static int direito(int i) {
        return 2 * i + 2;
    }

    // Procedimento maxHeapify
    public static void maxHeapify(int[] vetor, int i) {
        System.out.println("maxheapfy " + i);
        contadorMaxHeapify = contadorMaxHeapify + 1;

        int esq = esquerdo(i);
        int dir = direito(i);
        int maior = i;

        if (esq < tamanhoHeap) {
            if (vetor[esq] > vetor[maior]) {
                maior = esq;
            }
        }

        if (dir < tamanhoHeap) {
            if (vetor[dir] > vetor[maior]) {
                maior = dir;
            }
        }

        if (maior != i) {
            trocar(vetor, i, maior);
            imprimirVetor(vetor, vetor.length);
            maxHeapify(vetor, maior);
        } else {
            imprimirVetor(vetor, vetor.length);
        }
    }

    // Procedimento construirMaxHeap
    public static void construirMaxHeap(int[] vetor, int tamanho) {
        tamanhoHeap = tamanho;
        int i = tamanho / 2 - 1;

        while (i >= 0) {
            maxHeapify(vetor, i);
            i = i - 1;
        }
    }

    // Procedimento heapsort
    public static void heapsort(int[] vetor, int tamanho) {
        construirMaxHeap(vetor, tamanho);

        System.out.println("Vetor apos construirMaxHeap:");
        imprimirVetor(vetor, tamanho);
        System.out.println();

        int i = tamanho - 1;
        while (i > 0) {
            trocar(vetor, 0, i);
            tamanhoHeap = tamanhoHeap - 1;
            maxHeapify(vetor, 0);
            i = i - 1;
        }
    }

    // Procedimento principal
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Leitura do tamanho do vetor
        System.out.print("Digite o tamanho do vetor: ");
        int M = scanner.nextInt();

        // Criacao do vetor com alocacao estatica
        int[] vetor = new int[M];

        // Leitura dos elementos do vetor
        System.out.println("Digite os elementos do vetor:");
        int i = 0;
        while (i < M) {
            System.out.print("Elemento " + (i + 1) + ": ");
            vetor[i] = scanner.nextInt();
            i = i + 1;
        }

        // Impressao do vetor original
        System.out.println();
        System.out.println("Vetor original:");
        imprimirVetor(vetor, M);
        System.out.println();

        // Chamada ao heapsort
        heapsort(vetor, M);

        // Impressao dos contadores
        System.out.println();
        System.out.println("Numero total de trocas: " + contadorTrocas);
        System.out.println("Numero total de chamadas ao maxHeapify: " + contadorMaxHeapify);

        scanner.close();
    }
}
