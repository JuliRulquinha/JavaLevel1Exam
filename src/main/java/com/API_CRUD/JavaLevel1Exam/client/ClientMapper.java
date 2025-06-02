package com.API_CRUD.JavaLevel1Exam.client;

import com.API_CRUD.JavaLevel1Exam.category.Category;
import com.API_CRUD.JavaLevel1Exam.category.CategoryDto;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class ClientMapper {
    public Client toClient(ClientDto dto){
        var client = new Client();
        client.setEmail(dto.email());
        client.setName(dto.name());
        return client;
    }

    public ClientDto toClientDto(Client client){ return new ClientDto(client.getName(), client.getEmail());}

    public ClientResponseDto toClientResponseDto(Client client){
        return new ClientResponseDto(client.getName());
    }

    public List<ClientDto> toClientDtoList(List<Client> categories){
        List<ClientDto> clientList = new ArrayList<ClientDto>();
        for(var client : categories){
            clientList.add(new ClientDto(client.getName(), client.getEmail()));
        }

        return clientList;
    }
}
