package soluciones.informacticas.project.data.model.entity;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;
import soluciones.informacticas.project.data.model.dto.UsuarioDto;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

@Data
@NoArgsConstructor
@AllArgsConstructor

@Entity
@EntityListeners(AuditingEntityListener.class)
@Table(name = "usuarios")
public class UsuarioEntity implements Serializable {

    @Id
    @Column(name = "nombre_usuario")
    private String nombreUsuario;

    @Column(name = "contrasena")
    private String contrasena;

    @Column(name = "nombre")
    private String nombre;

    @Column(name = "apellido")
    private String apellido;

    @Column(name="documento")
    private String documento;

    @Column(name = "celular")
    private String celular;

    @Column(name = "tipo_documento")
    private String tipoDocumento;

    @Column(name = "mail")
    private String email;

    @CreatedDate
    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "fecha_actualizacion")
    private Date fechaActualizacion;

    @Column(name = "activo")
    private String activo;

    public UsuarioEntity(UsuarioDto usuarioDto){

        nombre = usuarioDto.getNombre();
        apellido = usuarioDto.getApellido();
        celular = usuarioDto.getCelular();
        documento = usuarioDto.getDocumento();
        tipoDocumento = usuarioDto.getTipoDocumento();
        email = usuarioDto.getEmail();
        nombreUsuario = usuarioDto.getNombreUsuario();
        activo = usuarioDto.getActivo();
        fechaActualizacion = new Date();
    }

}
