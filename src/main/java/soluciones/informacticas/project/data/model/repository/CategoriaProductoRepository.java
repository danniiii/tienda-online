package soluciones.informacticas.project.data.model.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import soluciones.informacticas.project.data.model.entity.CategoriaProductoEntity;

@Repository
public interface CategoriaProductoRepository extends JpaRepository<CategoriaProductoEntity, Integer> {
}
