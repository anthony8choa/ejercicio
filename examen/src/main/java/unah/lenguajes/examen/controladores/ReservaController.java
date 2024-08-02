package unah.lenguajes.examen.controladores;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import unah.lenguajes.examen.servicios.ReservaServicio;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;



@RestController
@RequestMapping("/api/reserva")
public class ReservaController {
    
    @Autowired
    private ReservaServicio reservaServicio;

    @PostMapping("/crear")
    public String crearReserva(@RequestParam long codigoCliente,
     @RequestParam long codigoVehiculo, @RequestParam Integer dias) {
        //TODO: process POST request
        
        return this.reservaServicio.crearReserva(codigoCliente, codigoVehiculo, dias);
    }
    
}
