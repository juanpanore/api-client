package com.co.apiclient.domain.oferta;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "oferta_data")
public class Oferta {

    @Id
    private String id;

    private Integer idProducto;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Integer getIdProducto() {
        return idProducto;
    }

    public void setIdProducto(Integer idProducto) {
        this.idProducto = idProducto;
    }

    public Double getPrecioOferta() {
        return precioOferta;
    }

    public void setPrecioOferta(Double precioOferta) {
        this.precioOferta = precioOferta;
    }

    public Double getPrecioOriginal() {
        return precioOriginal;
    }

    public void setPrecioOriginal(Double precioOriginal) {
        this.precioOriginal = precioOriginal;
    }

    public String getPorcentajeDescuento() {
        return porcentajeDescuento;
    }

    public void setPorcentajeDescuento(String porcentajeDescuento) {
        this.porcentajeDescuento = porcentajeDescuento;
    }

    private Double precioOferta;
    private Double precioOriginal;
    private String porcentajeDescuento;
}
