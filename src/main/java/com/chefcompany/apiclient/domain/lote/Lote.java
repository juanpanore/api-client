package com.chefcompany.apiclient.domain.lote;


import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.Date;

@Document(collection = "lote_data")
public class Lote {

    @Id
    private String id;
    private int idLote;
    private int cantidadHuevos;
    private String nombreActividad;
    private Date fechaIngreso;

    public Lote() {
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public int getIdLote() {
        return idLote;
    }

    public int getCantidadHuevos() {
        return cantidadHuevos;
    }

    public String getNombreActividad() {
        return nombreActividad;
    }

    public Date getFechaIngreso() {
        return fechaIngreso;
    }

    public void setIdLote(int idLote) {
        this.idLote = idLote;
    }

    public void setCantidadHuevos(int cantidadHuevos) {
        this.cantidadHuevos = cantidadHuevos;
    }

    public void setNombreActividad(String nombreActividad) {
        this.nombreActividad = nombreActividad;
    }

    public void setFechaIngreso(Date fechaIngreso) {
        this.fechaIngreso = fechaIngreso;
    }
}
