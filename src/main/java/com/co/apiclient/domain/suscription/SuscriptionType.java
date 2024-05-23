package com.co.apiclient.domain.suscription;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "suscription_data")
public class SuscriptionType {
    @Id
    private String id;
    private Integer idSuscription;
    private String name;
    private String description;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Integer getIdSuscription() {
        return idSuscription;
    }

    public void setIdSuscription(Integer idSuscription) {
        this.idSuscription = idSuscription;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
