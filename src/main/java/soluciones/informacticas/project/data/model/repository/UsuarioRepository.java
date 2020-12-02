package soluciones.informacticas.project.data.model.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import soluciones.informacticas.project.data.model.entity.UsuarioEntity;

import javax.transaction.Transactional;
import java.util.Date;

@Repository
public interface UsuarioRepository extends JpaRepository<UsuarioEntity, Integer> {

    UsuarioEntity findByNombreUsuario(String usuario);

    @Transactional
    @Modifying
    @Query("update UsuarioEntity u set u.nombre=:nombre, u.apellido=:apellido, u.tipoDocumento=:tipoDocumento, u.documento=:documento, u.celular=:celular, u.email=:mail, u.activo=:activo, u.fechaActualizacion=:fechaActualizacion where u.nombreUsuario=:nombreUsuario")
    void saveUser(@Param("nombre") String nombre,
                  @Param("apellido") String apellido,
                  @Param("tipoDocumento") String tipoDocumento,
                  @Param("documento") String documento,
                  @Param("celular") String celular,
                  @Param("mail") String mail,
                  @Param("activo") String activo,
                  @Param("fechaActualizacion") Date fechaActualizacion,
                  @Param("nombreUsuario") String nombreUsuario);

    @Transactional
    @Modifying
    @Query("update UsuarioEntity u set u.activo = 'N' where u.nombreUsuario=:nombreUsuario")
    void inactivaUser(@Param("nombreUsuario") String nombreUsuario);
}
