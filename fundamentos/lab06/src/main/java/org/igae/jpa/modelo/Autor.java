package org.igae.jpa.modelo;

import java.util.List;

import javax.persistence.*;

@Entity
public class Autor {
    @Id
    private Integer id;
    private String nombre;
    private String apellidos;
    @Transient // el ORM no guardará este atributo en la tabla Autor
    private int edad;
 
    @OneToMany(mappedBy = "autor")
    private List<Libro> libros;
    
    @PrePersist 
    @PreUpdate 
    private void validar() { 
        // validar parametros antes de persistir/actualizar la entidad 
    } 
}