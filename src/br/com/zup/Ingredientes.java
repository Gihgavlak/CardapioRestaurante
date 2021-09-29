package br.com.zup;


public class Ingredientes {
    private String addIngredientes;

    public Ingredientes() {
    }

    public Ingredientes(String addIngredientes) {
        this.addIngredientes = addIngredientes;
    }

    public String getAddIngredientes() {
        return addIngredientes;
    }

    public void setAddIngredientes(String addIngredientes) {
        this.addIngredientes = addIngredientes;
    }


    @Override
    public String toString() {
        StringBuilder retorno = new StringBuilder();
        retorno.append("\n Nome do ingrediente: "+ addIngredientes);
        return retorno.toString();
    }
}
