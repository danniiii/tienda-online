package soluciones.informacticas.project.data.security.pk;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import java.io.Serializable;

@Data
@NoArgsConstructor
@AllArgsConstructor

@Embeddable
public class UsuariosRolesPk implements Serializable {

    @Column(name = "nombre_usuario")
    private String nombreUsuario;

    @Column(name = "id_rol")
    private String idRol;

}
