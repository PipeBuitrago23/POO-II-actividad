
package com.mycompany.actividad_1;

public class Empleados {
    private int id;
    private String nombres;
    private String apellidos;
    private int numero_identificacion;
    private String genero;
    private String fecha_nacimiento;
    private char cargo;
    private Departamento departamento;
    
    @Autowired
    private EmpleadoRepository empleadoRepository;

    public Empleados guardarEmpleado(Empleados empleado) {
        return empleadoRepository.save(empleado);
    }

    public List<Empleados> obtenerTodosLosEmpleados() {
        return empleadoRepository.findAll();
    }


    public Empleados(int id, String nombres, String apellidos, int numero_identificacion, String genero, String fecha_nacimiento, char cargo, Departamento departamento) {
        this.id = id;
        this.nombres = nombres;
        this.apellidos = apellidos;
        this.numero_identificacion = numero_identificacion;
        this.genero = genero;
        this.fecha_nacimiento = fecha_nacimiento;
        this.cargo = cargo;
        this.departamento = departamento;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombres() {
        return nombres;
    }

    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public int getNumero_identificacion() {
        return numero_identificacion;
    }

    public void setNumero_identificacion(int numero_identificacion) {
        this.numero_identificacion = numero_identificacion;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public String getFecha_nacimiento() {
        return fecha_nacimiento;
    }

    public void setFecha_nacimiento(String fecha_nacimiento) {
        this.fecha_nacimiento = fecha_nacimiento;
    }

    public char getCargo() {
        return cargo;
    }

    public void setCargo(char cargo) {
        this.cargo = cargo;
    }

    public Departamento getDepartamento() {
        return departamento;
    }

    public void setDepartamento(Departamento departamento) {
        this.departamento = departamento;
    }
}
   

