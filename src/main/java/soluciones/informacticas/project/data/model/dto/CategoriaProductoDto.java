package soluciones.informacticas.project.data.model.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.Date;


@Data
@NoArgsConstructor
@AllArgsConstructor

public class CategoriaProductoDto {

    private Integer idCategoria;

    private Integer idProducto;

    private Date fechaActualizacion;
}
