package org.igae.lab02.general.herencia.polimorfismo;

// Un interface es una definicion funcional. Es basico para poder crear clases "polimorficas"

// Es la base para construir API's y obligar a cierto fabricantes a cumplir con el contrato funcional
// Ej. En el API JDBC (acceso a BBDD relacional), interface Driver (lo definio Sun) ...
// ... y obligo a Microsoft por ej a implementarlo en sus clases.
//  Ej. public class SqlServerDriver implements Driver
//  Ej. public class MysqlServerDriver implements Driver

public interface Poliza {
    void registrarSiniestro(String causa);
    void recalcularPrima();
}
