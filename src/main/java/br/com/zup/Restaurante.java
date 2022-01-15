package br.com.zup;

import java.util.Scanner;

public class Restaurante {

    private static Scanner capturarDados(String mensagem) {
        System.out.println(mensagem);
        return new Scanner(System.in);
    }

    public static void menu() {
        System.out.println(java.util.ResourceBundle.getBundle("strings").getString("DIVIDER"));
        System.out.println(java.util.ResourceBundle.getBundle("strings").getString("RESTAURANT_NAME"));
        System.out.println(java.util.ResourceBundle.getBundle("strings").getString("CHOOSE_OPTION"));
        System.out.println(java.util.ResourceBundle.getBundle("strings").getString("ADD_DISH"));
        System.out.println(java.util.ResourceBundle.getBundle("strings").getString("SHOW_MENU"));
        System.out.println(java.util.ResourceBundle.getBundle("strings").getString("EXIT"));

    }

    public static Prato cadastrarPrato() {
        String nome = capturarDados(java.util.ResourceBundle.getBundle("strings").getString("WRITE_DISH_NAME")).nextLine();
        double valorPrato = capturarDados(java.util.ResourceBundle.getBundle("strings").getString("WRITE_DISH_VALUE")).nextDouble();
        Prato prato1 = new Prato(nome, valorPrato);
        return prato1;
    }

    public static Ingredientes cadastrarIngredientes() {
        String nome = capturarDados(java.util.ResourceBundle.getBundle("strings").getString("WRITE_INGREDIENTS")).nextLine();
        Ingredientes ingredientes = new Ingredientes(nome);
        return ingredientes;
    }

    public static void apresentacao() {
        Cardapio cardapio = new Cardapio();
        boolean menu = true;

        while (menu) {
            menu();
            int opcaoUsuario = capturarDados(java.util.ResourceBundle.getBundle("strings").getString("CHOOSE_OPTION")).nextInt();

            if (opcaoUsuario == 1) {
                Prato prato = cadastrarPrato();
                cardapio.addPrato(prato);

                int qtdIngredientes = capturarDados(java.util.ResourceBundle.getBundle("strings").getString("WRITE_INGREDIENTS_QTY")).nextInt();

                for (int i = 0; i < qtdIngredientes; i++) {

                    Ingredientes ingredientes = cadastrarIngredientes();
                    prato.adicionarIngrediente(ingredientes);

                }

            } else if (opcaoUsuario == 2) {
                System.out.println(cardapio);
                System.out.println(java.util.ResourceBundle.getBundle("strings").getString("DIVIDER"));

            } else if (opcaoUsuario == 3) {
                System.out.println(java.util.ResourceBundle.getBundle("strings").getString("FAREWELL"));
                break;
            }

        }

    }

}
