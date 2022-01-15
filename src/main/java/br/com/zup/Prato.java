package br.com.zup;

import java.util.ArrayList;
import java.util.List;

public class Prato {

    private String nomeDoPrato;
    private double valorDoPrato;
    private List<Ingredientes> ingredientes = new ArrayList<>();

    public Prato() {

    }

    public Prato(String nomeDoPrato, double valorDoPrato) {
        this.nomeDoPrato = nomeDoPrato;
        this.valorDoPrato = valorDoPrato;
    }

    public String getNomeDoPrato() {
        return nomeDoPrato;
    }

    public void setNomeDoPrato(String nomeDoPrato) {
        this.nomeDoPrato = nomeDoPrato;
    }

    public double getValorDoPrato() {
        return valorDoPrato;
    }

    public void setValorDoPrato(double valorDoPrato) {
        this.valorDoPrato = valorDoPrato;
    }

    public List<Ingredientes> getIngredientes() {
        return ingredientes;
    }

    public void adicionarIngrediente(Ingredientes novoIngredientes) {
        ingredientes.add(novoIngredientes);
    }

    @Override
    public String toString() {
        StringBuilder retorno = new StringBuilder();
        retorno.append('\n').append(java.util.ResourceBundle.getBundle("strings").getString("DISH_NAME") + nomeDoPrato);
        retorno.append('\n').append(java.util.ResourceBundle.getBundle("strings").getString("INGREDIENTS_LIST") + ingredientes);
        retorno.append('\n').append(java.util.ResourceBundle.getBundle("strings").getString("INGREDIENT_QUANTITY") + ingredientes.size());
        retorno.append('\n').append(java.util.ResourceBundle.getBundle("strings").getString("VALUE") + valorDoPrato);
        return retorno.toString();

    }
}
