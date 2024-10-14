
package com.mycompany.actividad_1;

public class Servicio_empleado {
     @Autowired
    private EmpleadosRepository empleadoRepository;

    public Empleados guardarEmpleado(Empleados empleado) {
        return empleadoRepository.save(empleado);
    }

    public List<Empleados> obtenerTodosLosEmpleados() {
        return empleadoRepository.findAll();
    }

    public Empleados actualizarEmpleado(Long id, Empleados empleadoActualizado) {
        Empleados empleado = empleadoRepository.findById(id).orElseThrow(() -> new ResourceNotFoundException("Empleado no encontrado"));
        empleado.setNombre(empleadoActualizado.getNombre());
        empleado.setTipoEmpleado(empleadoActualizado.getTipoEmpleado());
        empleado.setSalario(empleadoActualizado.getSalario());
        empleado.setDepartamento(empleadoActualizado.getDepartamento());
        return empleadoRepository.save(empleado);
    }

    public void eliminarEmpleado(Long id) {
        empleadoRepository.deleteById(id);
    }

}
