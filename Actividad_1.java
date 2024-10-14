package com.mycompany.actividad_1;

public class Actividad_1 {

    public static void main(String[] args) {
        Departamento departamento = new Departamento("Desarrollo");

        Empleados Permanente = new Empleado_Permanente("Elvira Zaragoza", 1, 50000);
        Empleados Temporal = new Empleado_Temporal("Ana Gómez", 2, 20, 160);

        departamento.agregarEmpleado(permanente);
        departamento.agregarEmpleado(temporal);

        ReportesDesempeño reporte1 = new ReportesDesempeño(permanente, "Excelente");
        ReportesDesempeño reporte2 = new ReportesDesempeño(temporal, "Bueno");

        reporte1.generarReporte();
        reporte2.generarReporte();
    }
}