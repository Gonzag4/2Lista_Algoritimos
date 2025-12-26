//Questão 1:

//Defina as Estruturas de Dados básicas necessárias.

package com.application; //pacote onde a classe está localizada
import java.util.Scanner;


// método Main para a interação com o usuário:






// Classe principal com menu de interação
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Solicita capacidade inicial
        System.out.print("Digite a capacidade inicial M da lista: ");
        int m = scanner.nextInt();

        // Cria a lista
        ListaOrdenada lista = new ListaOrdenada(m);

        // Menu de interação
        int opcao;
        do {
            System.out.println("\n MENU ");
            System.out.println("1 - Visualizar lista");
            System.out.println("2 - Buscar elemento");
            System.out.println("3 - Inserir elemento");
            System.out.println("4 - Remover elemento");
            System.out.println("0 - Sair");
            System.out.print("Escolha uma opção: ");
            opcao = scanner.nextInt();

            switch (opcao) {
                case 1:
                    lista.visualizar();
                    break;

                case 2:
                    System.out.print("Digite o valor a buscar: ");
                    int valorBusca = scanner.nextInt();
                    int pos = lista.buscar(valorBusca);
                    if (pos != -1) {
                        System.out.println("Elemento " + valorBusca + " encontrado na posição " + pos);
                    } else {
                        System.out.println("Elemento " + valorBusca + " não encontrado");
                    }
                    break;

                case 3:
                    System.out.print("Digite o valor a inserir: ");
                    int valorInsercao = scanner.nextInt();
                    lista.inserir(valorInsercao);
                    break;

                case 4:
                    System.out.print("Digite o valor a remover: ");
                    int valorRemocao = scanner.nextInt();
                    lista.remover(valorRemocao);
                    break;

                case 0:
                    System.out.println("Encerrando programa...");
                    break;

                default:
                    System.out.println("Opção inválida!");
            }
        } while (opcao != 0);

        scanner.close();
    }
}

// foi utilizada a biblioteca Scanner apenas para conseguir se feita a interação com o usuário já que a pseudolinguagem utiliza o comando “Leia”.





