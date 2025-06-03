package com.API_CRUD.JavaLevel1Exam.client;

import com.API_CRUD.JavaLevel1Exam.category.CategoryDto;
import com.API_CRUD.JavaLevel1Exam.category.CategoryUpdateDto;
import jakarta.persistence.EntityNotFoundException;
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

    public List<ClientDto> getAllClients(){

        var clientList = repository.findAll();
        return mapper.toClientDtoList(clientList);
    }

    public ClientResponseDto getClientById(Integer id){
        return repository.findById(id)
                .map(mapper::toClientResponseDto)
                .orElse(null);
    }

    public ClientUpdateDto updateClientById(Integer id, ClientUpdateDto updateDto){

        var client = repository.findById(id)
                .orElseThrow(() -> new EntityNotFoundException("Client not found with id: " + id));

        client.setName(updateDto.name());
        client.setEmail(updateDto.email());

        var updatedClient = repository.save(client);
        return mapper.toClientUpdateDto(updatedClient);
    }

    public void deleteClientById(Integer id){
        repository.deleteById(id);
    }
}
