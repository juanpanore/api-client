package com.co.apiclient.repository.plan;


import com.co.apiclient.domain.lote.Lote;
import com.co.apiclient.domain.plan.Plan;
import org.springframework.data.mongodb.repository.Query;
import org.springframework.data.repository.reactive.ReactiveCrudRepository;
import reactor.core.publisher.Mono;

public interface IPlanRepository extends ReactiveCrudRepository<Plan, String> {
    @Query("{'idPlan':?0}")
    Mono<Plan> findById(Integer idPlan);
}
