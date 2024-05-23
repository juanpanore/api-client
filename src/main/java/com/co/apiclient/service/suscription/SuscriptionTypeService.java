package com.co.apiclient.service.suscription;


import com.co.apiclient.domain.suscription.SuscriptionType;
import com.co.apiclient.repository.suscription.ISuscriptionTypeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Flux;

@Service
public class SuscriptionTypeService {

    @Autowired
    private ISuscriptionTypeRepository iSuscriptionTypeRepository;

    public Flux<SuscriptionType> getAll() {
        return iSuscriptionTypeRepository.findAll();
    }

}
