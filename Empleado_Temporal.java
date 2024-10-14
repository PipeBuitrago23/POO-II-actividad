package com.mycompany.actividad_1;

public class Empleado_Temporal extends Empleados {
    private double precio_Hora;
    private int horasTrabajadas;

    public Empleado_Temporal(int id, String nombres, String apellidos, int numero_identificacion, String genero, String fecha_nacimiento, char cargo, Departamento departamento, double precio_Hora, int horasTrabajadas) {
        super(id, nombres, apellidos, numero_identificacion, genero, fecha_nacimiento, cargo, departamento)
        this.precio_Hora = precio_Hora;
        this.horasTrabajadas = horasTrabajadas;
    }
    
    public double calcularSalario() {
        return precio_Hora * horasTrabajadas;
    }



}
