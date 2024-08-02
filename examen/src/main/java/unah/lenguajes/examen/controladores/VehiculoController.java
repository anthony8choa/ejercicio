package unah.lenguajes.examen.controladores;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import unah.lenguajes.examen.modelos.Vehiculo;
import unah.lenguajes.examen.servicios.VehiculoServicio;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;




@RestController
@RequestMapping("/api/vehiculo")
public class VehiculoController {
    
    @Autowired
    private VehiculoServicio vehiculoServicio;

    @PostMapping("/crear")
    public Vehiculo postMethodName(@RequestBody Vehiculo nvoVehiculo) {
        
        return this.vehiculoServicio.crearNuevo(nvoVehiculo);
    }

    @GetMapping("/obtener/todos")
    public List<Vehiculo> obtenerTodos() {
        return this.vehiculoServicio.obtenerVehiculos();
    }

    @GetMapping("/obtener/{codigo}")
    public Vehiculo obtenerPorId(@PathVariable(name = "codigo") long codigoVehiculo) {
        return this.vehiculoServicio.obtenerPorId(codigoVehiculo);
    }
    
    
    

}
