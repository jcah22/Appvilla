package com.example.villa;

public class Enamoro {

    private String codigo;
    private String descripcion;
    private String peso;
    private int foto;

    public Enamoro(String codigo, String descripcion, String peso, int foto) {
        this.codigo = codigo;
        this.descripcion = descripcion;
        this.peso = peso;
        this.foto = foto;
    }

    public Enamoro(String cl1101, String descripcion, String peso, String s) {
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getPeso() {
        return peso;
    }

    public void setPeso(String peso) {
        this.peso = peso;
    }

    public int getFoto() {
        return foto;
    }

    public void setFoto(int foto) {
        this.foto = foto;
    }
}
