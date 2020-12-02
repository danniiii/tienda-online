package soluciones.informacticas.project.data.model.entity;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;
import soluciones.informacticas.project.data.model.dto.ProductoDto;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

@Data
@NoArgsConstructor
@AllArgsConstructor

@Entity
@EntityListeners(AuditingEntityListener.class)
@Table(name = "productos")
public class ProductoEntity implements Serializable {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_producto", insertable = false, updatable = false)
    private Integer idProducto;

    @Column(name = "uri_img")
    private String uriImg;

    @Column(name = "descripcion")
    private String descripcion;

    @Column(name = "precio")
    private Integer precio;

    @Column(name = "marca")
    private String marca;

    @Column(name = "caracteristicas")
    private String caracteristicas;

    @Column(name = "garantia")
    private String garantia;

    @Column(name = "stock")
    private Integer stock;

    @Column(name = "codigo")
    private String codigoProducto;

    @Column(name = "titulo")
    private String tituloProducto;

    @CreatedDate
    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "fecha_actualizacion")
    private Date fechaActualizacion;

    public ProductoEntity(ProductoDto productoDto) {
        uriImg = productoDto.getUriImg();
        descripcion = productoDto.getDescripcion();
        precio = productoDto.getPrecio();
        marca = productoDto.getMarca();
        caracteristicas = productoDto.getCaracteristicas();
        garantia = productoDto.getGarantia();
        stock = productoDto.getStock();
        codigoProducto = productoDto.getCodigoProducto();
        tituloProducto = productoDto.getTituloProducto();
    }
}
