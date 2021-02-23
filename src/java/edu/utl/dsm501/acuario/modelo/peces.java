package edu.utl.dsm501.acuario.modelo;


public class peces {
    private Integer IdPeces;
    private String nombre;
    private String especie;
    private float precio;
    private float calificacion;
    private String foto;
    
    public peces() {
        
    }

    public peces(Integer IdPeces, String nombre, String especie, float precio, float calificacion, String foto) {
        this.IdPeces = IdPeces;
        this.nombre = nombre;
        this.especie = especie;
        this.precio = precio;
        this.calificacion = calificacion;
        this.foto = foto;
    }

    public Integer getIdPeces() {
        return IdPeces;
    }

    public void setIdPeces(Integer IdPeces) {
        this.IdPeces = IdPeces;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getEspecie() {
        return especie;
    }

    public void setEspecie(String especie) {
        this.especie = especie;
    }

    public float getPrecio() {
        return precio;
    }

    public void setPrecio(float precio) {
        this.precio = precio;
    }

    public float getCalificacion() {
        return calificacion;
    }

    public void setCalificacion(float calificacion) {
        this.calificacion = calificacion;
    }

    public String getFoto() {
        return foto;
    }

    public void setFoto(String foto) {
        this.foto = foto;
    }

    @Override
    public String toString() {
        return "peces{" + "IdPeces=" + IdPeces + ", nombre=" + nombre + ", especie=" + especie + 
               ", precio=" + precio + ", calificacion=" + calificacion + ", foto=" + foto + '}';
    }

    
}
