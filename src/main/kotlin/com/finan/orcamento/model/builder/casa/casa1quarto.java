package com.finan.orcamento.model.builder.casa;

import com.finan.orcamento.model.Casa;

public class Casa1quarto implements IBuilderCasa {

}   private Casa casa;

    public Casa1Quartos(){
        casa = new Casa(1, 1, false);
    }
    @Override
    public void BuildQuartos() {
        System.out.println("Quarto 1: 19x18 );}
    @Override
    public void BuildBanheiros() {
        System.out.println("Um banheiro 10x12");
    }
    @Override
    public void BuildChurrasqueira() {
        System.out.println("Sem churrasqueira");
    }
    @Override
    public Casa getCasa() {
        return casa;
    }
}
