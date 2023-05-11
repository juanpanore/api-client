package com.co.apiclient.controllers.impuestos;


import com.co.apiclient.domain.impuestos.ResultadoImpuestos;
import com.co.apiclient.service.impuestos.ImpuestosService;
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

        return impuestosService.get(cantidad,Arrays.stream(nombresImpuestos).collect(Collectors.toList()),valor);
    }

}
