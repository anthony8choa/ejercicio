package unah.lenguajes.examen.servicios;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import unah.lenguajes.examen.modelos.Cliente;
import unah.lenguajes.examen.repositorios.ClienteRepositorio;
import unah.lenguajes.examen.repositorios.TipoClienteRepositorio;

@Service
public class ClienteServicio {
    
    @Autowired
    private ClienteRepositorio clienteRepositorio;

    @Autowired
    private TipoClienteRepositorio tipoClienteRepositorio;

    public Cliente crearCliente(Cliente nvoCliente){
        long codigoTipoCliente = nvoCliente.getTipocliente().getIdTipoCliente();
        if(this.tipoClienteRepositorio.existsById(codigoTipoCliente)){
            nvoCliente.setTipocliente(this.tipoClienteRepositorio.findById(codigoTipoCliente).get());
            return this.clienteRepositorio.save(nvoCliente);
        } else{
            return null;
        }
    }

    public List<Cliente> obtenerTodos(){
        return this.clienteRepositorio.findAll();
    }

    public Cliente obtenerPorId(long codigoCliente){
        return this.clienteRepositorio.findById(codigoCliente).get();
    }
}
