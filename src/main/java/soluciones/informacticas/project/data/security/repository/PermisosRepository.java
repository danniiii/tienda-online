package soluciones.informacticas.project.data.security.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import soluciones.informacticas.project.data.security.entity.PermisosEntity;

@Repository
public interface PermisosRepository extends JpaRepository<PermisosEntity, Integer> {
}
