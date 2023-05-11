package com.chefcompany.apiclient.controllers.impuestos;


import com.chefcompany.apiclient.domain.impuestos.ResultadoImpuestos;
import com.chefcompany.apiclient.service.impuestos.ImpuestosService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/api/v1/rest")
public class ImpuestosController {

    @Autowired
    private ImpuestosService impuestosService;

    @GetMapping("/impuestos")
    public ResultadoImpuestos get(@RequestParam(required = true) Integer cantidad, String[] nombresImpuestos, Integer valor) {

        List<String> listaNombresImpuestos = Arrays.stream(nombresImpuestos).collect(Collectors.toList());
        System.out.println("total impuestos " + listaNombresImpuestos.size() );
        listaNombresImpuestos.forEach(nombre -> System.out.println("nombres de impuestos " + nombre));
        return impuestosService.get(cantidad,listaNombresImpuestos,valor);
    }

}
