package com.API_CRUD.JavaLevel1Exam.client;

import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ClientService {
    private final ClientRepository repository;
    private final ClientMapper mapper;

    public ClientService(ClientRepository repository, ClientMapper mapper) {
        this.repository = repository;
        this.mapper = mapper;
    }

    public ClientDto saveClient(ClientDto dto){
        var client = mapper.toClient(dto);
        repository.save(client);
        return dto;
    }

    public List<Client> getAllClients(){
        return repository.findAll();
    }

    public ClientResponseDto getClientById(Integer id){
        return repository.findById(id)
                .map(mapper::toClientResponseDto)
                .orElse(null);
    }

    public void deleteClientById(Integer id){
        repository.deleteById(id);
    }
}
