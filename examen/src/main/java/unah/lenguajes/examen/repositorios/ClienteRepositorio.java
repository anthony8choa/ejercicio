package unah.lenguajes.examen.repositorios;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import unah.lenguajes.examen.modelos.Cliente;

@Repository
public interface ClienteRepositorio extends JpaRepository<Cliente, Long> {
    
}
