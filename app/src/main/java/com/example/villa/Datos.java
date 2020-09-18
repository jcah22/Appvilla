package com.example.villa;

import java.io.Serializable;

public class Datos implements Serializable {

    private int id;
    private String sku;
    private String detalle;
    private int imagen;
    private String pesopromedio;

    public Datos(int id, String sku, String detalle, int imagen, String pesopromedio) {
        this.id = id;
        this.sku = sku;
        this.detalle = detalle;
        this.imagen = imagen;
        this.pesopromedio = pesopromedio;
    }



    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getSku() {
        return sku;
    }

    public void setSku(String sku) {
        this.sku = sku;
    }

    public String getDetalle() {
        return detalle;
    }

    public void setDetalle(String detalle) {
        this.detalle = detalle;
    }

    public int getImagen() {
        return imagen;
    }

    public void setImagen(int imagen) {
        this.imagen = imagen;
    }

    public String getPesopromidio() {
        return pesopromedio;
    }

    public void setPesopromidio(String pesopromedio) {
        this.pesopromedio = pesopromedio;
    }
}
