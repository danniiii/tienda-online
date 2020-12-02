package soluciones.informacticas.project.data.model.dto;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Column;

@Data
@NoArgsConstructor
@AllArgsConstructor

public class CompraDto {

    private Integer idCompra;

    private Integer montoTotal;

}
