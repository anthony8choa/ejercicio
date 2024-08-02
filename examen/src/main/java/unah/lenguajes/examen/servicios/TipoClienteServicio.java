package unah.lenguajes.examen.servicios;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import unah.lenguajes.examen.modelos.TipoCliente;
import unah.lenguajes.examen.repositorios.TipoClienteRepositorio;

@Service
public class TipoClienteServicio {
    
    @Autowired
    TipoClienteRepositorio tipoClienteRepositorio;

    public TipoCliente crearTipoCliente(String descripcion){
        TipoCliente tipoCliente = new TipoCliente();

        tipoCliente.setDescripcion(descripcion);

        return this.tipoClienteRepositorio.save(tipoCliente);
    }

}
