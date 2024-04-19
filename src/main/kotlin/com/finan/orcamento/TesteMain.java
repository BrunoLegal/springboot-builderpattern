package com.finan.orcamento;

import com.finan.orcamento.model.Casa;
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
        BuilderCasa builderCasa1 = new Casa2Quartos();
        builderCasa1.buildQuartos();
        builderCasa1.BuildBanheiros();
        builderCasa1.buildChurrasqueira();
        Casa casa1 - builderCasa1.getCasa();

        System.out.println("Casa 1:");
        System.out.println("Quartos: "+casa1.getQuartos());
        System.out.println("Banheiros " + casa1.getBanheiros());
        System.out.println("Churrasqueira: " + casa1.isChurrasqueira());

        System.out.println("------------------------------------------");
    }
}
