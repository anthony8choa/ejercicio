package unah.lenguajes.examen.servicios;

import java.time.LocalDate;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import unah.lenguajes.examen.modelos.Cliente;
import unah.lenguajes.examen.modelos.Reserva;
import unah.lenguajes.examen.modelos.Vehiculo;
import unah.lenguajes.examen.repositorios.ClienteRepositorio;
import unah.lenguajes.examen.repositorios.ReservaRepositorio;
import unah.lenguajes.examen.repositorios.VehiculoRepositorio;

@Service
public class ReservaServicio {
    
    @Autowired
    private ReservaRepositorio reservaRepositorio;

    @Autowired
    private VehiculoRepositorio vehiculoRepositorio;

    @Autowired
    private ClienteRepositorio clienteRepositorio;

    public String crearReserva(long codigoCliente, long codigoVehiculo, Integer dias){

        Reserva nvaReserva = new Reserva();

        if(this.vehiculoRepositorio.existsById(codigoVehiculo) && this.clienteRepositorio.existsById(codigoCliente)){
            Vehiculo vehiculo = this.vehiculoRepositorio.findById(codigoVehiculo).get();
            Cliente cliente = this.clienteRepositorio.findById(codigoCliente).get();

            if(vehiculo.isDisponible()){
                double totalCalculado;

                totalCalculado = (dias * 24) * vehiculo.getTipovehiculo().getPrecioXhora();

                nvaReserva.setCliente(cliente);
                nvaReserva.setDias(dias);
                nvaReserva.setFecha(LocalDate.now());
                nvaReserva.setTotal(totalCalculado);
                nvaReserva.setVehiculo(vehiculo);

                vehiculo.setDisponible(false);
                this.reservaRepositorio.save(nvaReserva);

                return "Reserva insertada en la base de datos";
            } else{
                return "Vehiculo ya rentado";
            }

        } else{
            return "Vehiculo/Cliente no existentes";
        }

        
    }
}
