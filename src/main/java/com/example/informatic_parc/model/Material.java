package com.example.informatic_parc.model;

import lombok.*;

import javax.persistence.*;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Entity
public class Material {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Integer idMaterial;
    @Column(name = "material_name",nullable = false,length = 100)
    private String name;
}
