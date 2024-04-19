package com.finan.orcamento;

import com.finan.orcamento.model.Casa;
import com.finan.orcamento.model.builder.casa.Casa2Quartos;
import com.finan.orcamento.model.builder.casa.Casa2Quartos2BanheirosChurrasqueira;
import com.finan.orcamento.model.builder.casa.IBuilderCasa;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class PatternsBuildApplication {
    public static void main(String[] args) {

        /**
         * ApplicationContext context = SpringApplication.run(TesteMain.class, args);
         * OrcamentoService orcamentoService = context.getBean(OrcamentoService.class);
         */

        SpringApplication.run(PatternsBuildApplication.class, args);
        IBuilderCasa builderCasa1 = new Casa2Quartos();
        builderCasa1.buildQuartos();
        builderCasa1.buildBanheiros();
        builderCasa1.buildChurrasqueira();
        Casa casa1 = builderCasa1.getCasa();

        System.out.println("Casa 1: ");
        System.out.println("Quartos " + casa1.getQuartos());
        System.out.println("Banheiros " + casa1.getBanheiros());
        System.out.println("Churrasqueira: " + casa1.isChurrasqueira());

        System.out.println("------------------------------------------");

        IBuilderCasa builderCasa2 = new Casa2Quartos2BanheirosChurrasqueira();
        builderCasa2.buildQuartos();
        builderCasa2.buildBanheiros();
        builderCasa2.buildChurrasqueira();
        Casa casa2 = builderCasa2.getCasa();

        System.out.println("Casa 2: ");
        System.out.println("Quartos " + casa2.getQuartos());
        System.out.println("Banheiros " + casa2.getBanheiros());
        System.out.println("Churrasqueira: " + casa2.isChurrasqueira());

    }
}
