package br.com.zup;

import java.util.Scanner;
import java.util.List;
import java.util.Scanner;


public class Restaurante {

    private static Scanner capturarDados(String mensagem) {
        System.out.println(mensagem);
        return new Scanner(System.in);
    }

    public static void  menu(){
        System.out.println("-----------------------");
        System.out.println("Restaurante Enche Pança");
        System.out.println("Digite a opção desejada");
        System.out.println("1 -> Adicionar um prato");
        System.out.println("2 -> Exibir cardápio");
        System.out.println("3 -> Sair");

    }

    public static Prato cadastrarPrato(){
        String nome = capturarDados("Digite o nome do prato: ").nextLine();
        double valorPrato = capturarDados("Digite o valor do prato R$: ").nextDouble();
        Prato prato1 = new Prato(nome, valorPrato);
        return prato1;
    }

    public static Ingredientes cadastrarIngredientes(){
        String nome = capturarDados("Digite os ingredientes: ").nextLine();
        Ingredientes ingredientes = new Ingredientes(nome);
        return ingredientes;
    }

    public static void apresentacao(){
        Cardapio cardapio = new Cardapio();
        boolean menu = true;

        while (menu){
            menu();
            int opcaoUsuario = capturarDados("Digite a opção desejada: ").nextInt();

            if (opcaoUsuario == 1) {
                Prato prato = cadastrarPrato();
                cardapio.addPrato(prato);

                int qtdIngredientes = capturarDados("Digite a quantidade de ingredientes desse Prato: ").nextInt();

                for (int i = 0; i < qtdIngredientes; i++) {

                    Ingredientes ingredientes = cadastrarIngredientes();
                    prato.adicionarIngrediente(ingredientes);

                }

            } else if (opcaoUsuario == 2) {
                System.out.println(cardapio);
                System.out.println("------------------------");

            } else if (opcaoUsuario == 3) {
                System.out.println("Volte sempre! E traga mais Gente!");
                break;
            }

        }

    }


}

