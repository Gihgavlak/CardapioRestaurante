package br.com.zup;


public class Ingredientes {
    private String addIngredientes;
    private int qtd_ingredientes;

    public Ingredientes() {
    }

    public Ingredientes(String addIngredientes, int qtd_ingredientes) {
        this.addIngredientes = addIngredientes;
        this.qtd_ingredientes = qtd_ingredientes;
    }

    public String getAddIngredientes() {
        return addIngredientes;
    }

    public void setAddIngredientes(String addIngredientes) {
        this.addIngredientes = addIngredientes;
    }

    public int getQtd_ingredientes() {
        return qtd_ingredientes;
    }

    public void setQtd_ingredientes(int qtd_ingredientes) {
        this.qtd_ingredientes = qtd_ingredientes;
    }

    @Override
    public String toString() {
        return "Ingredientes{" +
                "addIngredientes='" + addIngredientes + '\'' +
                ", qtd_ingredientes=" + qtd_ingredientes +
                '}';
    }
}
