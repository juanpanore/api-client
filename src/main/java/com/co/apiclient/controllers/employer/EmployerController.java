package com.co.apiclient.controllers.employer;


import com.co.apiclient.domain.employer.Employer;
import com.co.apiclient.service.employer.EmployerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Flux;

import javax.validation.Valid;
import java.util.List;

@RestController
@RequestMapping("/api/v1/rest")
public class EmployerController {

    @Autowired
    private EmployerService employerService;
    @PostMapping("/employers/data")
    public Flux<Employer> getEmployersData(@Valid @RequestBody List<String> emails) {
        return employerService.getEmployersData(emails);
    }
}
