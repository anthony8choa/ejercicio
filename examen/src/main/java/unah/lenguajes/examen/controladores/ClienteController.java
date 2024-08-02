package unah.lenguajes.examen.controladores;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import unah.lenguajes.examen.modelos.Cliente;
import unah.lenguajes.examen.servicios.ClienteServicio;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;




@RestController
@RequestMapping("/api/cliente")
public class ClienteController {
    
    @Autowired
    private ClienteServicio clienteServicio;

    @PostMapping("/crear")
    public Cliente crearCliente(@RequestBody Cliente nvoCliente) {
        
        return this.clienteServicio.crearCliente(nvoCliente);
    }

    @GetMapping("/obtener/todos")
    public List<Cliente> obtenerTodos(){
        return this.clienteServicio.obtenerTodos();
    }

    @GetMapping("/obtener/{codigo}")
    public Cliente obtenerPorId(@PathVariable(name = "codigo") long codigoCliente) {
        return this.clienteServicio.obtenerPorId(codigoCliente);
    }
    
    
    

}
