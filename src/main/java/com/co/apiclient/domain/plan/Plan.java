package com.co.apiclient.domain.plan;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "plan_data")
public class Plan {

    @Id
    private String id;
    private Integer idPlan;
    private String name;
    private Integer price;
    private String period;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Integer getIdPlan() {
        return idPlan;
    }

    public void setIdPlan(Integer idPlan) {
        this.idPlan = idPlan;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getPrice() {
        return price;
    }

    public void setPrice(Integer price) {
        this.price = price;
    }

    public String getPeriod() {
        return period;
    }

    public void setPeriod(String period) {
        this.period = period;
    }

    @Override
    public String toString() {
        return "Plan{" +
                "id='" + id + '\'' +
                ", idPlan='" + idPlan + '\'' +
                ", name='" + name + '\'' +
                ", price='" + price + '\'' +
                ", period='" + period + '\'' +
                '}';
    }
}

