package com.finan.orcamento.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name="casa")
public class Casa implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name = "quartos")
    private int quartos;
    @Column(name = "banheiros")
    private int banheiros;
    @Column(name = "churrasqueira")
    private boolean churrasqueira;

    public Casa(int quartos, int banheiros, boolean churrasqueira){
        this.id = id;
        this.quartos = quartos;
        this.banheiros = banheiros;
        this.churrasqueira = churrasqueira;
    }

    public boolean getChurrasqueira(){
        return churrasqueira;
    }


}
