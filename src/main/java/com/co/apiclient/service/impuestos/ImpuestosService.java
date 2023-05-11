package com.co.apiclient.service.impuestos;

import com.co.apiclient.domain.impuestos.Impuesto;
import com.co.apiclient.domain.impuestos.ResultadoImpuestos;
import com.co.apiclient.repository.impuestos.IImpuestosRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class ImpuestosService {
    @Autowired
    private IImpuestosRepository iimpuestosRepository;

    public ResultadoImpuestos get(Integer cantidad, List<String> nombresImpuestos, Integer valor) {

        ResultadoImpuestos resultadoImpuestos = new ResultadoImpuestos(nombresImpuestos, 0);

        final Integer[] resultado = {0};
        List<String> impuestosCalculado = new ArrayList<>();
        Integer finalValor = valor*cantidad;

        nombresImpuestos.stream().forEach(nombreImpuesto -> {
           Impuesto impuesto = iimpuestosRepository.findByNombreImpuesto(nombreImpuesto).block();
           if (impuesto != null) {
               impuestosCalculado.add(nombreImpuesto);
               resultado[0] = finalValor + (impuesto.getValorImpuesto().intValue() * finalValor / 100);
               if (cantidad > 10 && impuesto.getNombreImpuesto().equals("IVA")) {
                   resultado[0] += (5 * finalValor / 100);
               }
               Integer totalResultado = resultadoImpuestos.getResultado() + resultado[0];
               resultadoImpuestos.setResultado(totalResultado);
           }
        });
        resultadoImpuestos.setTipoImpuesto(impuestosCalculado);
        return resultadoImpuestos;

    }

}
