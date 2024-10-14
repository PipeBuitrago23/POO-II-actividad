package com.mycompany.actividad_1;

public class ReportesDesempeño {
    private Empleados empleado;
    private String observaciones;

    public ReportesDesempeño(Empleados empleado, String observaciones) {
        this.empleado = empleado;
        this.observaciones = observaciones;
    }

    public Empleados getEmpleado() {
        return empleado;
    }

    public void setEmpleado(Empleados empleado) {
        this.empleado = empleado;
    }

    public String getObservaciones() {
        return observaciones;
    }

    public void setObservaciones(String observaciones) {
        this.observaciones = observaciones;
    }
    
    public void generarReporte(){
        System.out.println("Reporte de Desempeno");
        System.out.println("Reporte empleado: "+Empleados.getNombres());
        System.out.println("Reporte departamento: "+observaciones);
    }
    
}
