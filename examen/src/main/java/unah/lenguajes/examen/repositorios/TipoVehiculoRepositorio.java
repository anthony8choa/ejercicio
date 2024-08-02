package unah.lenguajes.examen.repositorios;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import unah.lenguajes.examen.modelos.TipoVehiculo;

@Repository
public interface TipoVehiculoRepositorio extends JpaRepository<TipoVehiculo, Long> {
    
}
