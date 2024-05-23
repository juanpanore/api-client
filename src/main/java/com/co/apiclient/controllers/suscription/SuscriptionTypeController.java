package com.co.apiclient.controllers.suscription;

import com.co.apiclient.domain.suscription.SuscriptionType;
import com.co.apiclient.service.suscription.SuscriptionTypeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Flux;

@RestController
@RequestMapping("/api/v1/rest")
public class SuscriptionTypeController {

    @Autowired
    private SuscriptionTypeService suscriptionTypeService;

    @GetMapping("/suscriptions")
    public Flux<SuscriptionType> getAll() {

        return suscriptionTypeService.getAll();
    }
}
