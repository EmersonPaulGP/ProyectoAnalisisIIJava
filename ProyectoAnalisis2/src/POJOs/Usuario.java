package POJOs;
// Generated 7/10/2023 10:40:27 AM by Hibernate Tools 4.3.1


import java.util.HashSet;
import java.util.Set;

/**
 * Usuario generated by hbm2java
 */
public class Usuario  implements java.io.Serializable {


     private Integer codigoUsuario;
     private Perfil perfil;
     private boolean estado;
     private String usuario;
     private String contrasenia;
     private Set<DetalleFac> detalleFacsForUsuarioModificacion = new HashSet<DetalleFac>(0);
     private Set<Cliente> clientesForUsuarioIngreso = new HashSet<Cliente>(0);
     private Set<DetalleFac> detalleFacsForUsuarioIngreso = new HashSet<DetalleFac>(0);
     private Set<Producto> productosForUsuarioModificacion = new HashSet<Producto>(0);
     private Set<Cliente> clientesForUsuarioModificacion = new HashSet<Cliente>(0);
     private Set<Producto> productosForUsuarioIngreso = new HashSet<Producto>(0);
     private Set<Empleado> empleadosForUsuarioModificacion = new HashSet<Empleado>(0);
     private Set<DetalleFac> detalleFacsForUsuarioIngreso_1 = new HashSet<DetalleFac>(0);
     private Set<Empleado> empleadosForUsuarioIngreso = new HashSet<Empleado>(0);
     private Set<Proveedores> proveedoresesForUsuarioIngreso = new HashSet<Proveedores>(0);
     private Set<Proveedores> proveedoresesForUsuarioModifica = new HashSet<Proveedores>(0);

    public Usuario() {
    }

	
    public Usuario(boolean estado, String usuario, String contrasenia) {
        this.estado = estado;
        this.usuario = usuario;
        this.contrasenia = contrasenia;
    }
    public Usuario(Perfil perfil, boolean estado, String usuario, String contrasenia, Set<DetalleFac> detalleFacsForUsuarioModificacion, Set<Cliente> clientesForUsuarioIngreso, Set<DetalleFac> detalleFacsForUsuarioIngreso, Set<Producto> productosForUsuarioModificacion, Set<Cliente> clientesForUsuarioModificacion, Set<Producto> productosForUsuarioIngreso, Set<Empleado> empleadosForUsuarioModificacion, Set<DetalleFac> detalleFacsForUsuarioIngreso_1, Set<Empleado> empleadosForUsuarioIngreso, Set<Proveedores> proveedoresesForUsuarioIngreso, Set<Proveedores> proveedoresesForUsuarioModifica) {
       this.perfil = perfil;
       this.estado = estado;
       this.usuario = usuario;
       this.contrasenia = contrasenia;
       this.detalleFacsForUsuarioModificacion = detalleFacsForUsuarioModificacion;
       this.clientesForUsuarioIngreso = clientesForUsuarioIngreso;
       this.detalleFacsForUsuarioIngreso = detalleFacsForUsuarioIngreso;
       this.productosForUsuarioModificacion = productosForUsuarioModificacion;
       this.clientesForUsuarioModificacion = clientesForUsuarioModificacion;
       this.productosForUsuarioIngreso = productosForUsuarioIngreso;
       this.empleadosForUsuarioModificacion = empleadosForUsuarioModificacion;
       this.detalleFacsForUsuarioIngreso_1 = detalleFacsForUsuarioIngreso_1;
       this.empleadosForUsuarioIngreso = empleadosForUsuarioIngreso;
       this.proveedoresesForUsuarioIngreso = proveedoresesForUsuarioIngreso;
       this.proveedoresesForUsuarioModifica = proveedoresesForUsuarioModifica;
    }
   
    public Integer getCodigoUsuario() {
        return this.codigoUsuario;
    }
    
    public void setCodigoUsuario(Integer codigoUsuario) {
        this.codigoUsuario = codigoUsuario;
    }
    public Perfil getPerfil() {
        return this.perfil;
    }
    
    public void setPerfil(Perfil perfil) {
        this.perfil = perfil;
    }
    public boolean isEstado() {
        return this.estado;
    }
    
    public void setEstado(boolean estado) {
        this.estado = estado;
    }
    public String getUsuario() {
        return this.usuario;
    }
    
    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }
    public String getContrasenia() {
        return this.contrasenia;
    }
    
    public void setContrasenia(String contrasenia) {
        this.contrasenia = contrasenia;
    }
    public Set<DetalleFac> getDetalleFacsForUsuarioModificacion() {
        return this.detalleFacsForUsuarioModificacion;
    }
    
    public void setDetalleFacsForUsuarioModificacion(Set<DetalleFac> detalleFacsForUsuarioModificacion) {
        this.detalleFacsForUsuarioModificacion = detalleFacsForUsuarioModificacion;
    }
    public Set<Cliente> getClientesForUsuarioIngreso() {
        return this.clientesForUsuarioIngreso;
    }
    
    public void setClientesForUsuarioIngreso(Set<Cliente> clientesForUsuarioIngreso) {
        this.clientesForUsuarioIngreso = clientesForUsuarioIngreso;
    }
    public Set<DetalleFac> getDetalleFacsForUsuarioIngreso() {
        return this.detalleFacsForUsuarioIngreso;
    }
    
    public void setDetalleFacsForUsuarioIngreso(Set<DetalleFac> detalleFacsForUsuarioIngreso) {
        this.detalleFacsForUsuarioIngreso = detalleFacsForUsuarioIngreso;
    }
    public Set<Producto> getProductosForUsuarioModificacion() {
        return this.productosForUsuarioModificacion;
    }
    
    public void setProductosForUsuarioModificacion(Set<Producto> productosForUsuarioModificacion) {
        this.productosForUsuarioModificacion = productosForUsuarioModificacion;
    }
    public Set<Cliente> getClientesForUsuarioModificacion() {
        return this.clientesForUsuarioModificacion;
    }
    
    public void setClientesForUsuarioModificacion(Set<Cliente> clientesForUsuarioModificacion) {
        this.clientesForUsuarioModificacion = clientesForUsuarioModificacion;
    }
    public Set<Producto> getProductosForUsuarioIngreso() {
        return this.productosForUsuarioIngreso;
    }
    
    public void setProductosForUsuarioIngreso(Set<Producto> productosForUsuarioIngreso) {
        this.productosForUsuarioIngreso = productosForUsuarioIngreso;
    }
    public Set<Empleado> getEmpleadosForUsuarioModificacion() {
        return this.empleadosForUsuarioModificacion;
    }
    
    public void setEmpleadosForUsuarioModificacion(Set<Empleado> empleadosForUsuarioModificacion) {
        this.empleadosForUsuarioModificacion = empleadosForUsuarioModificacion;
    }
    public Set<DetalleFac> getDetalleFacsForUsuarioIngreso_1() {
        return this.detalleFacsForUsuarioIngreso_1;
    }
    
    public void setDetalleFacsForUsuarioIngreso_1(Set<DetalleFac> detalleFacsForUsuarioIngreso_1) {
        this.detalleFacsForUsuarioIngreso_1 = detalleFacsForUsuarioIngreso_1;
    }
    public Set<Empleado> getEmpleadosForUsuarioIngreso() {
        return this.empleadosForUsuarioIngreso;
    }
    
    public void setEmpleadosForUsuarioIngreso(Set<Empleado> empleadosForUsuarioIngreso) {
        this.empleadosForUsuarioIngreso = empleadosForUsuarioIngreso;
    }
    public Set<Proveedores> getProveedoresesForUsuarioIngreso() {
        return this.proveedoresesForUsuarioIngreso;
    }
    
    public void setProveedoresesForUsuarioIngreso(Set<Proveedores> proveedoresesForUsuarioIngreso) {
        this.proveedoresesForUsuarioIngreso = proveedoresesForUsuarioIngreso;
    }
    public Set<Proveedores> getProveedoresesForUsuarioModifica() {
        return this.proveedoresesForUsuarioModifica;
    }
    
    public void setProveedoresesForUsuarioModifica(Set<Proveedores> proveedoresesForUsuarioModifica) {
        this.proveedoresesForUsuarioModifica = proveedoresesForUsuarioModifica;
    }




}


