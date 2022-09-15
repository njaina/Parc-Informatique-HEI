package com.example.informatic_parc.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Entity
public class Material_Network {
    @Id
    private Integer id;
    @ManyToOne
    @JoinColumn(name = "id_material", nullable = false)
    private Material material;
    @ManyToOne
    @JoinColumn(name = "id_network", nullable = false)
    private Network network;
}
