package unah.lenguajes.examen.modelos;

import java.time.LocalDate;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Table(name="cliente")
@Data
public class Cliente {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="codigocliente")
    private long idCliente;

    private String nombre;

    private String apellido;

    @Column(name = "fechaingreso")
    private LocalDate fechaIngreso;

    @ManyToOne
    @JoinColumn(name="idtipocliente", referencedColumnName = "idtipocliente")
    private TipoCliente tipocliente;

}
