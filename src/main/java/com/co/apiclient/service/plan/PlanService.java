package com.co.apiclient.service.plan;


import com.co.apiclient.domain.plan.Plan;
import com.co.apiclient.repository.plan.IPlanRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@Service

public class PlanService {

    @Autowired
    private IPlanRepository iPlanRepository;

    public Flux<Plan> getAll() {
        return iPlanRepository.findAll();
    }

    public Mono<Plan> get(Integer id) {
        return iPlanRepository.findById(id);
    }
}
