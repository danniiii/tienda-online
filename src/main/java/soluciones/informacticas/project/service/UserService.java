package soluciones.informacticas.project.service;

/*import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;
import soluciones.informacticas.project.data.model.entity.UsuarioEntity;
import soluciones.informacticas.project.data.model.repository.UsuarioRepository;
import soluciones.informacticas.project.data.security.entity.UsuariosRolesEntity;
import soluciones.informacticas.project.data.security.repository.UsuariosRolesRepository;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

@Service
public class UserService implements UserDetailsService {

    @Autowired
    private UsuarioRepository usuarioRepository;
    @Autowired
    private UsuariosRolesRepository usuariosRolesRepository;

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {

        UsuarioEntity usuarioEntity = usuarioRepository.findByNombreUsuario(username.toUpperCase());

       List<UsuariosRolesEntity> roles =  usuariosRolesRepository.findByUsuariosRolesPkNombreUsuario(username.toUpperCase());
       List<GrantedAuthority> roles2 = new ArrayList<>();

        for (UsuariosRolesEntity rol : roles) {
            roles2.add(new SimpleGrantedAuthority("ROLE_" + rol.getUsuariosRolesPk().getIdRol()));
        }

        UserDetails userDetails = new User(usuarioEntity.getNombreUsuario(),
                                            usuarioEntity.getContrasena(),
                                         roles2);
        return userDetails;
    }
}*/
