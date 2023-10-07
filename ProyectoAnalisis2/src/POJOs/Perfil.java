package POJOs;
// Generated 7/10/2023 10:40:27 AM by Hibernate Tools 4.3.1


import java.util.HashSet;
import java.util.Set;

/**
 * Perfil generated by hbm2java
 */
public class Perfil  implements java.io.Serializable {


     private Integer codigoPerfil;
     private Boolean estado;
     private String descripcion;
     private Set<Usuario> usuarios = new HashSet<Usuario>(0);

    public Perfil() {
    }

    public Perfil(Boolean estado, String descripcion, Set<Usuario> usuarios) {
       this.estado = estado;
       this.descripcion = descripcion;
       this.usuarios = usuarios;
    }
   
    public Integer getCodigoPerfil() {
        return this.codigoPerfil;
    }
    
    public void setCodigoPerfil(Integer codigoPerfil) {
        this.codigoPerfil = codigoPerfil;
    }
    public Boolean getEstado() {
        return this.estado;
    }
    
    public void setEstado(Boolean estado) {
        this.estado = estado;
    }
    public String getDescripcion() {
        return this.descripcion;
    }
    
    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
    public Set<Usuario> getUsuarios() {
        return this.usuarios;
    }
    
    public void setUsuarios(Set<Usuario> usuarios) {
        this.usuarios = usuarios;
    }




}


