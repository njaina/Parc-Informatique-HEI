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
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Integer idSource;
    @Column(name = "network_name", nullable = false)
    private String name;
    @ManyToOne
    @JoinColumn(name = "type", nullable = false)
    private Network_Types networkType;
}
