package unah.lenguajes.examen.controladores;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import unah.lenguajes.examen.modelos.TipoCliente;
import unah.lenguajes.examen.servicios.TipoClienteServicio;
import org.springframework.web.bind.annotation.PostMapping;


@RestController
@RequestMapping("/api/tipocliente")
public class TipoClienteController {
    
    @Autowired
    TipoClienteServicio tipoClienteServicio;

    @PostMapping("/crear")
    public TipoCliente crearNuevoTipoCliente(@RequestParam String descripcion) {
        
        return this.tipoClienteServicio.crearTipoCliente(descripcion);
    }
    
}
