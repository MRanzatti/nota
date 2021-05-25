package br.com.projetosonner.springbackendmysql.controller;

import br.com.projetosonner.springbackendmysql.model.Cliente;
import br.com.projetosonner.springbackendmysql.repository.ClienteRepository;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/cliente")
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
    public Cliente adicionar(@RequestBody Cliente cliente) {
        return clienteRepository.save(cliente);
    }

    @PutMapping("/")
    public Cliente atualizar(@RequestBody Cliente cliente) {
        return clienteRepository.save(cliente);
    }

    @DeleteMapping("/{id}")
    public void deletar(@PathVariable Long id) {
        try {
            clienteRepository.deleteById(id);
        } catch (EmptyResultDataAccessException ex) {
            System.out.println("Objeto nao existe");
        }

    }

}
