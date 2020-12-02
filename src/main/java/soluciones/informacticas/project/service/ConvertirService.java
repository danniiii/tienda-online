package soluciones.informacticas.project.service;

import org.springframework.stereotype.Service;
import soluciones.informacticas.project.data.model.dto.ProductoDto;
import soluciones.informacticas.project.data.model.dto.UsuarioDto;
import soluciones.informacticas.project.data.model.entity.ProductoEntity;
import soluciones.informacticas.project.data.model.entity.UsuarioEntity;

import java.util.Date;

@Service
public class ConvertirService {
    
    public UsuarioDto convertirEntidadUsuarioADto(UsuarioEntity usuarioEntity){

        UsuarioDto usuarioDto = new UsuarioDto();
        usuarioDto.setNombre(usuarioEntity.getNombre());
        usuarioDto.setApellido(usuarioEntity.getApellido());
        usuarioDto.setCelular(usuarioEntity.getCelular());
        usuarioDto.setDocumento(usuarioEntity.getDocumento());
        usuarioDto.setTipoDocumento(usuarioEntity.getTipoDocumento());
        usuarioDto.setEmail(usuarioEntity.getEmail());
        usuarioDto.setNombreUsuario(usuarioEntity.getNombreUsuario());
        usuarioDto.setActivo(usuarioEntity.getActivo());
        return usuarioDto;
    }

    public ProductoDto convertirEntidadProductoADto(ProductoEntity productoEntity){

        ProductoDto productoDto = new ProductoDto();
        productoDto.setUriImg(productoEntity.getUriImg());
        productoDto.setCaracteristicas(productoEntity.getCaracteristicas());
        productoDto.setCodigoProducto(productoEntity.getCodigoProducto());
        productoDto.setDescripcion(productoEntity.getDescripcion());
        productoDto.setGarantia(productoEntity.getGarantia());
        productoDto.setIdProducto(productoEntity.getIdProducto());
        productoDto.setMarca(productoEntity.getMarca());
        productoDto.setPrecio(productoEntity.getPrecio());
        productoDto.setStock(productoEntity.getStock());
        productoDto.setTituloProducto(productoEntity.getTituloProducto());

        return productoDto;
    }

/*    public UsuarioEntity convertirDtoAEntity(UsuarioDto usuarioDto){
        UsuarioEntity usuarioEntity = new UsuarioEntity();
        usuarioEntity.setNombreUsuario(usuarioDto.getNombreUsuario());
        usuarioEntity.setNombre(usuarioDto.getNombre());
        usuarioEntity.setApellido(usuarioDto.getApellido());
        usuarioEntity.setTipoDocumento(usuarioDto.getTipoDocumento());
        usuarioEntity.setDocumento(usuarioDto.getDocumento());
        usuarioEntity.setEmail(usuarioDto.getEmail());
        usuarioEntity.setCelular(usuarioDto.getCelular());
        usuarioEntity.setActivo(usuarioDto.getActivo());
        usuarioEntity.setFechaActualizacion(new Date());
        return usuarioEntity;
    }*/

}
