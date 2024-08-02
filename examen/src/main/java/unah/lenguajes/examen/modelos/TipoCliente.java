package unah.lenguajes.examen.modelos;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnore;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Table(name = "tipocliente")
@Data
public class TipoCliente {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idtipocliente")
    private long idTipoCliente;

    private String descripcion;

    @JsonIgnore
    @OneToMany(mappedBy = "tipocliente", cascade = CascadeType.ALL)
    private List<Cliente> clientes;

}
