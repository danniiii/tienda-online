package soluciones.informacticas.project.data.model.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import soluciones.informacticas.project.data.model.entity.DetalleCompraEntity;

@Repository
public interface DetalleCompraRepository extends JpaRepository<DetalleCompraEntity, Integer> {
}
