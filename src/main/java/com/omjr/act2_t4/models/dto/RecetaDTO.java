package com.omjr.act2_t4.models.dto;

public class RecetaDTO{
    private String nombre;
    private String categoria;
    private String tiempo;

    public RecetaDTO(String nombre, String categoria, String tiempo) {
        this.nombre = nombre;
        this.categoria = categoria;
        this.tiempo = tiempo;
    }

    public RecetaDTO(){
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public String getTiempo() {
        return tiempo;
    }

    public void setTiempo(String tiempo) {
        this.tiempo = tiempo;
    }    

    
}
