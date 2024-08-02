package unah.lenguajes.examen.repositorios;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import unah.lenguajes.examen.modelos.Vehiculo;

@Repository
public interface VehiculoRepositorio extends JpaRepository<Vehiculo, Long> {

    
}
