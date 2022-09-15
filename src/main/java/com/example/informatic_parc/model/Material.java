package com.example.informatic_parc.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Entity
public class Material {
    @Id
    @Column(name = "id_material")
    private Integer idMaterial;
    @Column(name = "material_name", nullable = false, length = 100)
    private String name;
}
