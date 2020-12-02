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
public class RolesPermisosPk implements Serializable {

    @Column(name = "id_rol")
    private String idRol;

    @Column(name = "id_permiso")
    private String idPermiso;

}
