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
public class Network {
    @Id
    @Column(name = "id_network")
    private Integer id;
    @Column(name = "network_name", nullable = false)
    private String name;
    @Column(name = "network_type",nullable = false)
    private String type;
}
