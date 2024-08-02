package unah.lenguajes.examen.repositorios;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import unah.lenguajes.examen.modelos.Reserva;

@Repository
public interface ReservaRepositorio extends JpaRepository<Reserva, Long>{
    
}
