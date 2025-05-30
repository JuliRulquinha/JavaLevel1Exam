package com.API_CRUD.JavaLevel1Exam.client;

import org.springframework.stereotype.Service;

@Service
public class ClientMapper {
    public Client toClient(ClientDto dto){
        var client = new Client();
        client.setEmail(dto.email());
        client.setName(dto.name());
        return client;
    }

    public ClientResponseDto toClientResponseDto(Client client){
        return new ClientResponseDto(client.getName());
    }


}
