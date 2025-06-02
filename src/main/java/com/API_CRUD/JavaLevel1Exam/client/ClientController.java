package com.API_CRUD.JavaLevel1Exam.client;

import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class ClientController {

    private final ClientService clientService;


    public ClientController(ClientService clientService) {
        this.clientService = clientService;
    }

    @PostMapping("/clients")
    public ClientDto save(
            @RequestBody ClientDto dto
    ){
        return clientService.saveClient(dto);
    }

    @GetMapping("/clients")
    public List<ClientDto> getAll(){
        return clientService.getAllClients();
    }

    @PutMapping("/clients/{id}")
    public ClientUpdateDto updateById(
            @PathVariable Integer id,
            @RequestBody ClientUpdateDto dto
    ){
        return clientService.updateClientById(id, dto);
    }

    @DeleteMapping("/clients/{id}")
    public void deleteClientById(
            @PathVariable Integer id
    ){
        clientService.deleteClientById(id);
    }
}
