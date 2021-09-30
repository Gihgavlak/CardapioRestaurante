package br.com.zup;

import java.util.ArrayList;
import java.util.List;

public class Cardapio {
    private List<Prato> prato = new ArrayList<>();

    public Cardapio() {
    }

    public Cardapio(List<Prato> prato) {
        this.prato = prato;
    }

    public List<Prato> getPrato() {
        return prato;
    }

    public void setPrato(List<Prato> prato) {
        this.prato = prato;
    }

    public void addPrato (Prato pratoAdd){
        prato.add(pratoAdd);
    }

    @Override
    public String toString() {
      StringBuilder retorno = new StringBuilder();
      retorno.append("------------ CARDAPIO:------------ "+prato);
      return retorno.toString();
    }
}
