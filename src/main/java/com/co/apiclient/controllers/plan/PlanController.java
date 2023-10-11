package com.co.apiclient.controllers.plan;

import com.co.apiclient.domain.carro.Carro;
import com.co.apiclient.domain.lote.Lote;
import com.co.apiclient.domain.plan.Plan;
import com.co.apiclient.service.lote.LoteService;
import com.co.apiclient.service.plan.PlanService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

import javax.validation.Valid;

@RestController
@RequestMapping("/api/v1/rest")
public class PlanController {

    @Autowired
    private PlanService planService;

    @GetMapping("/plans")
    public Flux<Plan> getAll() {

        return planService.getAll();
    }

    @GetMapping("/plans/{idPlan}")
    public Mono<Plan> create(@PathVariable Integer idPlan) {
        return planService.get(idPlan);

    }

}
