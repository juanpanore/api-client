package com.co.apiclient.domain.impuestos;


import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "impuestos_data")
public class Impuesto {

    @Id
    private String id;
    private String nombreImpuesto;
    private Number valorImpuesto;

    public Impuesto(String id, String nombreImpuesto, Number valorImpuesto) {
        this.id = id;
        this.nombreImpuesto = nombreImpuesto;
        this.valorImpuesto = valorImpuesto;
    }


    public String getNombreImpuesto() {
        return nombreImpuesto;
    }

    public void setNombreImpuesto(String nombreImpuesto) {
        this.nombreImpuesto = nombreImpuesto;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Number   getValorImpuesto() {
        return valorImpuesto;
    }

    public void setValorImpuesto(Number valorImpuesto) {
        this.valorImpuesto = valorImpuesto;
    }


}
