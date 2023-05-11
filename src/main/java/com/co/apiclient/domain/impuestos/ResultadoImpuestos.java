package com.co.apiclient.domain.impuestos;

import org.springframework.data.annotation.Id;

import java.util.List;

public class ResultadoImpuestos {


    private List<String> tipoImpuesto;
    private Integer resultado;

    public ResultadoImpuestos(List<String> tipoImpuesto, Integer resultado) {
        this.tipoImpuesto = tipoImpuesto;
        this.resultado = resultado;
    }

    public List<String> getTipoImpuesto() {
        return tipoImpuesto;
    }

    public void setTipoImpuesto(List<String> tipoImpuesto) {
        this.tipoImpuesto = tipoImpuesto;
    }

    public Integer getResultado() {
        return resultado;
    }

    public void setResultado(Integer resultado) {
        this.resultado = resultado;
    }
}
