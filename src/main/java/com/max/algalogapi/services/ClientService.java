package com.max.algalogapi.services;

import com.max.algalogapi.entities.Client;
import com.max.algalogapi.repositories.ClientRepository;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@AllArgsConstructor(onConstructor = @__(@Autowired))
public class ClientService {

    private ClientRepository clientRepository;

    @Transactional(readOnly = true)
    public Page<Client> findAllPaged(PageRequest pageRequest) {
        return clientRepository.findAll(pageRequest);
    }
}
