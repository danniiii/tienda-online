package soluciones.informacticas.project.data.model.dto;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;



@Data
@NoArgsConstructor
@AllArgsConstructor

public class DetalleCompraDto {

    private Integer idCompra;

    private Integer idProducto;

    private Integer precio;

    private String tituloProducto;
}
