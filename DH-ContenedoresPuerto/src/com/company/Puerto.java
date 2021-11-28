package com.company;

import java.util.*;

public class Puerto {
    private String nombre;
    private List<Contenedor> contenedores;

    public Puerto(String nombre, List<Contenedor> contenedores) {
        this.nombre = nombre;
        this.contenedores = contenedores;
    }

    public Puerto(String nombre) {
        this.nombre = nombre;
        this.contenedores = new ArrayList<>();
    }

    public void agregarContenedor(Contenedor contenedor) {
        contenedores.add(contenedor);
    }

    public void mostarContedoresOrdenados() {
        contenedores.sort(null);
        for (Contenedor contenedor : contenedores) {
            System.out.println(contenedor);

        }
    }

    public int cantidadContenedoresPeligroso(){
        int cantidad = 0;
        for (Contenedor contenedor : contenedores) {
            if (contenedor.isTransportePeligroso() && (contenedor.getPaisProcedencia() == "Desconocida")) {
                cantidad++;
            }
        }
        return cantidad;
    }
}
