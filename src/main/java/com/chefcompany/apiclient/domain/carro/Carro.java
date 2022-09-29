package com.chefcompany.apiclient.domain.carro;

import com.chefcompany.apiclient.domain.marca.Marca;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "carro_data")
public class Carro {


    @Id
    private String idCarro;
    private String idImagen;
    private String nombre;
    private String descripcion;
    private String nombreMarca;

    public Carro() {
    }

    public String getIdCarro() {
        return idCarro;
    }

    public void setIdCarro(String idCarro) {
        this.idCarro = idCarro;
    }

    public String getIdImagen() {
        return idImagen;
    }

    public void setIdImagen(String idImagen) {
        this.idImagen = idImagen;
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

    public String getNombreMarca() {
        return nombreMarca;
    }

    public void setNombreMarca(String nombreMarca) {
        this.nombreMarca = nombreMarca;
    }

    @Override
    public String toString() {
        return "Carro{" +
                "idCarro='" + idCarro + '\'' +
                ", idImagen='" + idImagen + '\'' +
                ", nombre='" + nombre + '\'' +
                ", descripcion='" + descripcion + '\'' +
                ", nombreMarca='" + nombreMarca + '\'' +
                '}';
    }
}
