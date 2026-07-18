package com.omjr.act2_t4.models;

public class Receta {
    private int id;
    private String nombre;
    private String descripcion;
    private String imagen;
    private String categoria;
    private String dificultad;

    public Receta(int id, String nombre, String descripcion, String imagen, String categoria, String dificultad) {
        this.id = id;
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.imagen = imagen;
        this.categoria = categoria;
        this.dificultad = dificultad;
    }

    public Receta() {
    }

    public int getId() {
        return id;
    }

    public String getNombre() {
        return nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public String getImagen() {
        return imagen;
    }

    public String getCategoria() {
        return categoria;
    }

    public String getDificultad() {
        return dificultad;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public void setImagen(String imagen) {
        this.imagen = imagen;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public void setDificultad(String dificultad) {
        this.dificultad = dificultad;
    }

    
}
