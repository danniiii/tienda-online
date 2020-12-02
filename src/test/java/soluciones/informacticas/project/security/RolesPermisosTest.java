package soluciones.informacticas.project.security;


import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import soluciones.informacticas.project.data.security.entity.RolesPermisosEntity;
import soluciones.informacticas.project.data.security.pk.RolesPermisosPk;
import soluciones.informacticas.project.data.security.repository.UsuariosPermisosRepository;

import static org.junit.Assert.assertTrue;

@RunWith(SpringRunner.class)
@SpringBootTest
public class RolesPermisosTest {

    @Autowired
    private UsuariosPermisosRepository usuariosPermisosRepository;

   /* @Test
    public void asignarPermisoAUsuarioTest(){
        RolesPermisosEntity usuariosPermisosEntity = new RolesPermisosEntity();
        RolesPermisosPk usuPerPK = new RolesPermisosPk();
        usuPerPK.setIdPermiso("BORRAR_PRODUCTO");
        usuPerPK.setIdUsuario("PEPITO2");
        usuariosPermisosEntity.setUsuariosPermisosPk(usuPerPK);

        RolesPermisosEntity usuarioRetorno = usuariosPermisosRepository.save(usuariosPermisosEntity);

        assertTrue(usuarioRetorno.getUsuariosPermisosPk().getIdUsuario().equalsIgnoreCase(usuarioRetorno.getUsuariosPermisosPk().getIdUsuario()));

    }*/
}
