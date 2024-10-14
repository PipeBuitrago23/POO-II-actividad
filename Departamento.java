package com.mycompany.actividad_1;

import java.util.ArrayList;
import java.util.List;

public class Departamento {
    private String nombre;
    private List<Empleados> empleados;

    public Departamento(String nombre) {
        this.nombre = nombre;
        this.empleados = new ArrayList<>();
        
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public List<Empleados> getEmpleados() {
        return empleados;
    }

    public void setEmpleados(List<Empleados> empleados) {
        this.empleados = empleados;
    }
    
     public void agregarEmpleado(Empleados empleado) {
        empleados.add(empleado);
        empleado.setDepartamento(this);
     }
     
    
     public void eliminarEmpleado(Empleados empleado) {
        empleados.remove(empleado);
        empleado.setDepartamento(null);
    }

    
}
