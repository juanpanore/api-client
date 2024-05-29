package com.co.apiclient.controllers.jwt;

import com.co.apiclient.domain.reduser.UserType;
import com.co.apiclient.service.jwt.UserTypeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Flux;


@RestController
@RequestMapping("/api/v1/rest")
public class UserTypeController {

    @Autowired
    private UserTypeService userTypeService;

    @GetMapping("/userTypes")
    public Flux<UserType> getAll() {

        return userTypeService.getAll();
    }

}
