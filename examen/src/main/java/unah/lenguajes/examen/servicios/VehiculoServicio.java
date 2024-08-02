package unah.lenguajes.examen.servicios;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import unah.lenguajes.examen.modelos.Vehiculo;
import unah.lenguajes.examen.repositorios.TipoVehiculoRepositorio;
import unah.lenguajes.examen.repositorios.VehiculoRepositorio;

@Service
public class VehiculoServicio {
    
    @Autowired
    private VehiculoRepositorio vehiculoRepositorio;

    @Autowired
    private TipoVehiculoRepositorio tipoVehiculoRepositorio;

    public Vehiculo crearNuevo(Vehiculo nvoVehiculo){
        long codigoTipoVehiculo = nvoVehiculo.getTipovehiculo().getIdTipoVehiculo();

        if(this.tipoVehiculoRepositorio.existsById(codigoTipoVehiculo)){
            nvoVehiculo.setTipovehiculo(this.tipoVehiculoRepositorio.findById(codigoTipoVehiculo).get());
            return this.vehiculoRepositorio.save(nvoVehiculo);
        } else{
            return null;
        }
    }

    public List<Vehiculo> obtenerVehiculos(){
        return this.vehiculoRepositorio.findAll();
    }

    public Vehiculo obtenerPorId(long codigoVehiculo){
        return this.vehiculoRepositorio.findById(codigoVehiculo).get();
    }

}
