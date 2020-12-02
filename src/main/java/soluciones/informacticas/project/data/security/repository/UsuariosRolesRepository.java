package soluciones.informacticas.project.data.security.repository;

import org.springframework.data.jpa.repository.JpaRepository;
//import org.springframework.security.core.GrantedAuthority;
import org.springframework.stereotype.Repository;
import soluciones.informacticas.project.data.security.entity.UsuariosRolesEntity;
import soluciones.informacticas.project.data.security.pk.UsuariosRolesPk;


import java.util.List;

@Repository
public interface UsuariosRolesRepository extends JpaRepository<UsuariosRolesEntity, UsuariosRolesPk> {

    List<UsuariosRolesEntity> findByUsuariosRolesPkNombreUsuario(String userName);
}
