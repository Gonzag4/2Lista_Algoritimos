package com.application;

import java.util.Scanner;

public class L2Q3 {

    // Variável para trocas
    static int contadorTrocas = 0;

    // Procedimento para trocar dois elementos no vetor
    public static void trocar(int[] vetor, int i, int j) {
        int temp = vetor[i];
        vetor[i] = vetor[j];
        vetor[j] = temp;
        contadorTrocas = contadorTrocas + 1;
    }

    // imprimir o vetor
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

    // Procedimento particionar
    public static int particionar(int[] vetor, int p, int r) {
        System.out.println("particionar " + p + " " + r);

        int pivo = vetor[r];
        int i = p - 1;
        int j = p;

        while (j < r) {
            if (vetor[j] <= pivo) {
                i = i + 1;
                trocar(vetor, i, j);
            }
            j = j + 1;
        }

        trocar(vetor, i + 1, r);

        imprimirVetor(vetor, vetor.length);

        return i + 1;
    }

    // Procedimento quicksort
    public static void quicksort(int[] vetor, int p, int r) {
        System.out.println("quicksort " + p + " " + r + ": empilhado!");

        if (p < r) {
            int q = particionar(vetor, p, r);
            quicksort(vetor, p, q - 1);
            quicksort(vetor, q + 1, r);
        }

        System.out.println("quicksort " + p + " " + r + ": desempilhado!");
    }

    // main

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Leitura do tamanho do vetor
        System.out.print("Digite o tamanho do vetor: ");
        int M = scanner.nextInt();

        // Criação do vetor com alocação estática
        int[] vetor = new int[M];

        // Leitura dos elementos do vetor
        System.out.println("Digite os elementos do vetor:");
        int i = 0;
        while (i < M) {
            System.out.print("Elemento " + (i + 1) + ": ");
            vetor[i] = scanner.nextInt();
            i = i + 1;
        }

        // Impressão do vetor original
        System.out.println("Vetor original:");
        imprimirVetor(vetor, M);

        // Chamada ao quicksort
        System.out.println();
        quicksort(vetor, 0, M - 1);

        // Impressão do número total de trocas
        System.out.println();
        System.out.println("Numero total de trocas: " + contadorTrocas);

        scanner.close();
    }
}
