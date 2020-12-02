package soluciones.informacticas.project.data.model.dto;


import com.sun.istack.NotNull;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;


@Data
@NoArgsConstructor
@AllArgsConstructor

public class UsuarioDto {

    private String nombreUsuario;

   // private String contrasena;

    private String nombre;

    private String apellido;

    private String documento;

    private String celular;

    private String tipoDocumento;

    private String email;

    private String activo;

    private Date fechaActualizacion;

}
