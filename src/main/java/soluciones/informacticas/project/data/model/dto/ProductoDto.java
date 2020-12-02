package soluciones.informacticas.project.data.model.dto;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.NotBlank;
import java.util.ArrayList;

@Data
@NoArgsConstructor
@AllArgsConstructor

public class ProductoDto {

    private Integer idProducto;

    @NotBlank
    private String uriImg;

    @NotBlank
    private String descripcion;

    @NotBlank
    private Integer precio;

    private String marca;

    private String caracteristicas;

    private String garantia;

    @NotBlank
    private Integer stock;

    private String codigoProducto;

    @NotBlank
    private String tituloProducto;

    @NotBlank
    private Integer idCategoria;

}
