package soluciones.informacticas.project.data.model.dto;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.Date;

@Data
@NoArgsConstructor
@AllArgsConstructor

public class CategoriaDto {

    private Integer idCategoria;

    private String nombreCategoria;

    private Date fechaActualizacion;

}
