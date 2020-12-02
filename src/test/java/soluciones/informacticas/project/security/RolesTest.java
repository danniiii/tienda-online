package soluciones.informacticas.project.security;


import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import soluciones.informacticas.project.data.security.entity.RolesEntity;
import soluciones.informacticas.project.data.security.repository.RolesRepository;

import static org.junit.Assert.assertTrue;

@RunWith(SpringRunner.class)
@SpringBootTest
public class RolesTest {

    @Autowired
    private RolesRepository rolesRepository;

    @Test
    public void crearRolTest(){
        RolesEntity rolesEntity =  new RolesEntity();
        rolesEntity.setIdRol("USER");
        rolesEntity.setDescripcion("rol comun de cualquier usuario que requiera operar sobre la web");

        RolesEntity rolRetornado = rolesRepository.save(rolesEntity);

        assertTrue(rolRetornado.getIdRol().equalsIgnoreCase(rolesEntity.getIdRol()));
    }
}
