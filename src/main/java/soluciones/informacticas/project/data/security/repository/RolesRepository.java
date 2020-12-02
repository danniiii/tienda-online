package soluciones.informacticas.project.data.security.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import soluciones.informacticas.project.data.security.entity.RolesEntity;

@Repository
public interface RolesRepository extends JpaRepository<RolesEntity, Integer> {
}
