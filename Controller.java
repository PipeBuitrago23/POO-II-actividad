package com.mycompany.actividad_1;
@RestController
@RequestMapping("/api/empleados")

public class Controller {

        @Autowired
        private EmpleadosService empleadoService;

        @PostMapping
        public ResponseEntity<Empleados> crearEmpleado(@RequestBody Empleado empleado) {
            try {
                Empleados nuevoEmpleado = empleadoService.guardarEmpleado(empleado);
                return new ResponseEntity<>(nuevoEmpleado, HttpStatus.CREATED);
            } catch (Exception e) {
                throw new ResponseStatusException(HttpStatus.BAD_REQUEST, "Error al crear el empleado", e);
            }
        }

        @GetMapping
        public List<Empleados> obtenerTodosLosEmpleados() {
            return empleadoService.obtenerTodosLosEmpleados();
        }

        @PutMapping("/{id}")
        public ResponseEntity<Empleados> actualizarEmpleado(@PathVariable Long id, @RequestBody Empleado empleado) {
            try {
                Empleado empleadoActualizado = empleadoService.actualizarEmpleado(id, empleado);
                return new ResponseEntity<>(empleadoActualizado, HttpStatus.OK);
            } catch (ResourceNotFoundException e) {
                throw new ResponseStatusException(HttpStatus.NOT_FOUND, e.getMessage(), e);
            } catch (Exception e) {
                throw new ResponseStatusException(HttpStatus.BAD_REQUEST, "Error al actualizar el empleado", e);
            }
        }

        @DeleteMapping("/{id}")
        public ResponseEntity<Void> eliminarEmpleado(@PathVariable Long id) {
            try {
                empleadoService.eliminarEmpleado(id);
                return new ResponseEntity<>(HttpStatus.NO_CONTENT);
            } catch (Exception e) {
                throw new ResponseStatusException(HttpStatus.BAD_REQUEST, "Error al eliminar el empleado", e);
            }
        }
    }


