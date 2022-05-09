package org.igae.jpa.modelo;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Editorial {
    @Id
    private Integer id;
    private String nombre;
    private String direccion;
}
