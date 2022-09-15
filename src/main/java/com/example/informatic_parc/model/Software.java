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
public class Software {
    @Id
    @Column(name = "id_software")
    private Integer id;
    @Column(name = "software_name", length = 50, nullable = false)
    private String name;
}
