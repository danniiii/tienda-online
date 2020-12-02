package soluciones.informacticas.project.security;


import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import soluciones.informacticas.project.data.security.entity.UsuariosRolesEntity;
import soluciones.informacticas.project.data.security.pk.UsuariosRolesPk;
import soluciones.informacticas.project.data.security.repository.UsuariosRolesRepository;

import static org.junit.Assert.assertTrue;

@RunWith(SpringRunner.class)
@SpringBootTest
public class UsuariosRolesTest {

    @Autowired
    private UsuariosRolesRepository usuariosRolesRepository;

    @Test
    public void asignarRolAUsuarioTest(){

        UsuariosRolesEntity usuariosRolesEntity = new UsuariosRolesEntity();

        UsuariosRolesPk usuariosRolesPk = new UsuariosRolesPk();
        usuariosRolesPk.setIdRol("USER");
        usuariosRolesPk.setNombreUsuario("PEPITO2");

        usuariosRolesEntity.setUsuariosRolesPk(usuariosRolesPk);

        UsuariosRolesEntity usuRolRetornado = usuariosRolesRepository.save(usuariosRolesEntity);

        assertTrue(usuRolRetornado.getUsuariosRolesPk().getIdRol().equalsIgnoreCase(usuariosRolesEntity.getUsuariosRolesPk().getIdRol()));
    }
}
