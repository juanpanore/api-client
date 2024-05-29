package com.co.apiclient.service.employer;

import com.co.apiclient.domain.employer.Employer;
import com.co.apiclient.repository.client.IClientRepository;
import com.co.apiclient.repository.employer.IEmployerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Flux;

import java.util.List;

@Service
public class EmployerService {

    @Autowired
    private IEmployerRepository iemployerRepository;

    public Flux<Employer> getEmployersData(List<String> emails){
        return iemployerRepository.findByEmails(emails);
    }
}
