package com.chefcompany.apiclient.domain.firma;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.Date;

@Document (collection = "firmas_data")
public class Firma {
    @Id
    private String id;
    private Date fechaIngreso;
    private String link;
    private String correoUsuario;

    public Firma() {
    }

    public String getCorreoUsuario() {
        return correoUsuario;
    }


    public String getId() {
        return id;
    }


    public Date getFechaIngreso() {
        return fechaIngreso;
    }

    public String getLink() {
        return link;
    }


    public void setFechaIngreso(Date fechaIngreso) {
        this.fechaIngreso = fechaIngreso;
    }

    public void setLink(String link) {
        this.link = link;
    }

    public void setCorreoUsuario(String correoUsuario) {
        this.correoUsuario = correoUsuario;
    }
}
