package com.co.apiclient.domain.interes;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "intereses_data")
public class Interes {

    @Id
    private String id;
    private String interes;
    private String categoria;

    public Interes(String id, String interes, String categoria) {
        this.id = id;
        this.interes = interes;
        this.categoria = categoria;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getInteres() {
        return interes;
    }

    public void setInteres(String interes) {
        this.interes = interes;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }
}
