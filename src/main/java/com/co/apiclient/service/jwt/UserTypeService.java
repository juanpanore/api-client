package com.co.apiclient.service.jwt;

import com.co.apiclient.domain.reduser.UserType;
import com.co.apiclient.repository.reduser.IUserTypeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Flux;

@Service
public class UserTypeService  {
    @Autowired
    private IUserTypeRepository iUserTypeRepository;

    public Flux<UserType> getAll() {
        return iUserTypeRepository.findAll();
    }


}
