package br.com.agromercantil.migration;

import javax.persistence.*;

@Entity
public class HelloWorld {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(nullable = false)
    private String name;
}