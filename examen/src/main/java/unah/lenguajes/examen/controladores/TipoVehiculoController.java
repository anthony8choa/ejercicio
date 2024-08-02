package unah.lenguajes.examen.controladores;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import unah.lenguajes.examen.modelos.TipoVehiculo;
import unah.lenguajes.examen.servicios.TipoVehiculoServicio;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;


@RestController
@RequestMapping("/api/tipovehiculo")
public class TipoVehiculoController {

    @Autowired
    private TipoVehiculoServicio tipoVehiculoServicio;
    
    @PostMapping("/crear")
    public TipoVehiculo crearNuevo(@RequestBody TipoVehiculo tipoVehiculo) {
        
        return this.tipoVehiculoServicio.crearNuevoTipoVehiculo(tipoVehiculo);
    }
    

}
