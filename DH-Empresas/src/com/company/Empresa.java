package com.company;


import java.util.*;


public class Empresa {

    private String razonSocial;

    private List<Empleado> empleados = new ArrayList<>();


    public void incorporarEmpleado(Empleado empleado) {

        empleados.add(empleado);

    }


    public int cantidadEmpleados() {

        return empleados.size();

    }


    public String getRazonSocial() {

        return razonSocial;

    }


    public void setRazonSocial(String razonSocial) {

        this.razonSocial = razonSocial;
    }
}