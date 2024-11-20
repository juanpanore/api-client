package com.co.apiclient.domain.tiposcalificacion;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection ="tipos_calificacion_data")
public class TiposCalificacion {

    @Id
    private String id;
    private Integer idTipoCalificacion;
    private String nombre;
    private String descripcion;
    private String tipoCalificacion;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Integer getIdTipoCalificacion() {
        return idTipoCalificacion;
    }

    public void setIdTipoCalificacion(Integer idTipoCalificacion) {
        this.idTipoCalificacion = idTipoCalificacion;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getTipocalificacion() {
        return tipoCalificacion;
    }

    public void setTipocalificacion(String tipocalificacion) {
        this.tipoCalificacion = tipocalificacion;
    }
}
