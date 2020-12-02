package soluciones.informacticas.project.data.model.repository;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;
import soluciones.informacticas.project.data.model.entity.CategoriaEntity;


@Repository
public interface CategoriaRepository extends JpaRepository<CategoriaEntity, Integer>, PagingAndSortingRepository<CategoriaEntity, Integer> {

    public abstract Page<CategoriaEntity> findAll(Pageable pageable);
}
