package soluciones.informacticas.project.security;


import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import soluciones.informacticas.project.data.security.entity.PermisosEntity;
import soluciones.informacticas.project.data.security.repository.PermisosRepository;

import static org.junit.Assert.assertTrue;


@RunWith(SpringRunner.class)
@SpringBootTest
public class PermisosTest {

    @Autowired
    private PermisosRepository permisosRepository;

    @Test
    public void crearPermisoTest(){
        PermisosEntity permisosEntity =  new PermisosEntity();

        permisosEntity.setIdPermiso("BORRAR_PRODUCTO");

        PermisosEntity permisoRetorno = permisosRepository.save(permisosEntity);

        assertTrue(permisoRetorno.getIdPermiso().equalsIgnoreCase(permisosEntity.getIdPermiso()));

    }
}
