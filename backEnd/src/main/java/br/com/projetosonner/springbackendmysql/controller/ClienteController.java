package br.com.projetosonner.springbackendmysql.controller;

import br.com.projetosonner.springbackendmysql.model.Cliente;
import br.com.projetosonner.springbackendmysql.repository.ClienteRepository;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/api/cliente")
public class ClienteController {


    private final ClienteRepository clienteRepository;

    ClienteController(ClienteRepository clienteRepository) {
        this.clienteRepository = clienteRepository;
    }

    @GetMapping("/{id}")
    public Cliente listar(@PathVariable Long id) {
        return clienteRepository.findById(id).get();

    }

    @GetMapping("/")
    public List<Cliente> listarTudo() {
        return clienteRepository.findAll();
    }

    @PostMapping("/")
    public void incluir(@RequestBody Cliente cliente) {
        clienteRepository.save(cliente);
    }

    @PutMapping("/")
    public void update(@RequestBody Cliente cliente) {
        clienteRepository.save(cliente);
    }

    @DeleteMapping("/{id}")
    public void apagar(@PathVariable Long id) {
        try {
            clienteRepository.deleteById(id);
        } catch (EmptyResultDataAccessException ex) {
            System.out.println("Objeto nao existe");
        }

    }

}
