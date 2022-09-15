package com.example.informatic_parc.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import java.io.Serializable;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Entity
public class Material_Software implements Serializable {
    @Id
    private Integer id;
    @ManyToOne
    @JoinColumn(name = "id_material",nullable = false)
    private Material material;
    @ManyToOne
    @JoinColumn(name = "id_software", nullable = false)
    private Software software;
}
