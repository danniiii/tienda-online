package soluciones.informacticas.project.data;


import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.test.context.junit4.SpringRunner;
import soluciones.informacticas.project.data.model.entity.UsuarioEntity;
import soluciones.informacticas.project.data.model.repository.UsuarioRepository;

import static org.junit.Assert.assertTrue;

@RunWith(SpringRunner.class)
@SpringBootTest
public class UsuariosTest {

    @Autowired
    private UsuarioRepository usuarioRepository;

    @Autowired
    private BCryptPasswordEncoder encoder;

    @Test
    public void crearUsuarioTest() {
        UsuarioEntity usuarioEntity = new UsuarioEntity();
        usuarioEntity.setNombreUsuario(new String("dani").toUpperCase());
        usuarioEntity.setContrasena(encoder.encode("123"));
        usuarioEntity.setNombre("dani");
        usuarioEntity.setApellido("borges");
        usuarioEntity.setCelular("0123456789");
        usuarioEntity.setDocumento("12345678");
        usuarioEntity.setEmail("dborg@gmail.com");
        usuarioEntity.setTipoDocumento("DU");
        usuarioEntity.setActivo("S");

        UsuarioEntity usuarioRetornado = usuarioRepository.save(usuarioEntity);

        assertTrue(usuarioRetornado.getNombreUsuario().equalsIgnoreCase(usuarioEntity.getNombreUsuario()));
    }

}
