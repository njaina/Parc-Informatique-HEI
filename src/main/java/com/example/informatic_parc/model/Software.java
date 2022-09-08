package com.example.informatic_parc.model;

import lombok.*;

import javax.persistence.*;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Entity
public class Software {
    @Id
    @Column(name = "id_software")
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Integer idSoftware;
    @Column(name = "name", length = 50, nullable = false)
    private String SoftwareName;
    @Column(name = "version",nullable = false)
    private String SoftwareVersion;

}
