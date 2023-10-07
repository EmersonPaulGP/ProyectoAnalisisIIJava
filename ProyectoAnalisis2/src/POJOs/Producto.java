package POJOs;
// Generated 7/10/2023 10:40:27 AM by Hibernate Tools 4.3.1


import java.math.BigDecimal;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;

/**
 * Producto generated by hbm2java
 */
public class Producto  implements java.io.Serializable {


     private Integer codigoProducto;
     private Usuario usuarioByUsuarioModificacion;
     private Usuario usuarioByUsuarioIngreso;
     private boolean estado;
     private String nombreProducto;
     private String descripcionProducto;
     private int cantidadProducto;
     private BigDecimal precioProducto;
     private Date fechaIngreso;
     private Date fechaModificacion;
     private Set<DetalleFac> detalleFacs = new HashSet<DetalleFac>(0);

    public Producto() {
    }

	
    public Producto(boolean estado, String nombreProducto, String descripcionProducto, int cantidadProducto, BigDecimal precioProducto) {
        this.estado = estado;
        this.nombreProducto = nombreProducto;
        this.descripcionProducto = descripcionProducto;
        this.cantidadProducto = cantidadProducto;
        this.precioProducto = precioProducto;
    }
    public Producto(Usuario usuarioByUsuarioModificacion, Usuario usuarioByUsuarioIngreso, boolean estado, String nombreProducto, String descripcionProducto, int cantidadProducto, BigDecimal precioProducto, Date fechaIngreso, Date fechaModificacion, Set<DetalleFac> detalleFacs) {
       this.usuarioByUsuarioModificacion = usuarioByUsuarioModificacion;
       this.usuarioByUsuarioIngreso = usuarioByUsuarioIngreso;
       this.estado = estado;
       this.nombreProducto = nombreProducto;
       this.descripcionProducto = descripcionProducto;
       this.cantidadProducto = cantidadProducto;
       this.precioProducto = precioProducto;
       this.fechaIngreso = fechaIngreso;
       this.fechaModificacion = fechaModificacion;
       this.detalleFacs = detalleFacs;
    }
   
    public Integer getCodigoProducto() {
        return this.codigoProducto;
    }
    
    public void setCodigoProducto(Integer codigoProducto) {
        this.codigoProducto = codigoProducto;
    }
    public Usuario getUsuarioByUsuarioModificacion() {
        return this.usuarioByUsuarioModificacion;
    }
    
    public void setUsuarioByUsuarioModificacion(Usuario usuarioByUsuarioModificacion) {
        this.usuarioByUsuarioModificacion = usuarioByUsuarioModificacion;
    }
    public Usuario getUsuarioByUsuarioIngreso() {
        return this.usuarioByUsuarioIngreso;
    }
    
    public void setUsuarioByUsuarioIngreso(Usuario usuarioByUsuarioIngreso) {
        this.usuarioByUsuarioIngreso = usuarioByUsuarioIngreso;
    }
    public boolean isEstado() {
        return this.estado;
    }
    
    public void setEstado(boolean estado) {
        this.estado = estado;
    }
    public String getNombreProducto() {
        return this.nombreProducto;
    }
    
    public void setNombreProducto(String nombreProducto) {
        this.nombreProducto = nombreProducto;
    }
    public String getDescripcionProducto() {
        return this.descripcionProducto;
    }
    
    public void setDescripcionProducto(String descripcionProducto) {
        this.descripcionProducto = descripcionProducto;
    }
    public int getCantidadProducto() {
        return this.cantidadProducto;
    }
    
    public void setCantidadProducto(int cantidadProducto) {
        this.cantidadProducto = cantidadProducto;
    }
    public BigDecimal getPrecioProducto() {
        return this.precioProducto;
    }
    
    public void setPrecioProducto(BigDecimal precioProducto) {
        this.precioProducto = precioProducto;
    }
    public Date getFechaIngreso() {
        return this.fechaIngreso;
    }
    
    public void setFechaIngreso(Date fechaIngreso) {
        this.fechaIngreso = fechaIngreso;
    }
    public Date getFechaModificacion() {
        return this.fechaModificacion;
    }
    
    public void setFechaModificacion(Date fechaModificacion) {
        this.fechaModificacion = fechaModificacion;
    }
    public Set<DetalleFac> getDetalleFacs() {
        return this.detalleFacs;
    }
    
    public void setDetalleFacs(Set<DetalleFac> detalleFacs) {
        this.detalleFacs = detalleFacs;
    }




}


