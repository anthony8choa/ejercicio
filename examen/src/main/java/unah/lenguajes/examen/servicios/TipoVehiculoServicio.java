package unah.lenguajes.examen.servicios;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import unah.lenguajes.examen.modelos.TipoVehiculo;
import unah.lenguajes.examen.repositorios.TipoVehiculoRepositorio;

@Service
public class TipoVehiculoServicio {
    
    @Autowired
    private TipoVehiculoRepositorio tipoVehiculoRepositorio;

    public TipoVehiculo crearNuevoTipoVehiculo(TipoVehiculo tipoVehiculo){
        TipoVehiculo nvoTipoVehiculo = tipoVehiculo;

        return this.tipoVehiculoRepositorio.save(nvoTipoVehiculo);

    }

}
