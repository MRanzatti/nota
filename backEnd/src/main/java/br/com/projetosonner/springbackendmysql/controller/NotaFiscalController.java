package br.com.projetosonner.springbackendmysql.controller;

import br.com.projetosonner.springbackendmysql.model.Cliente;
import br.com.projetosonner.springbackendmysql.model.NotaFiscal;
import br.com.projetosonner.springbackendmysql.repository.NotaFiscalRepsitory;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/notaFiscal")
public class NotaFiscalController {


    private final NotaFiscalRepsitory notaFiscalRepsitory;

    NotaFiscalController(NotaFiscalRepsitory notaFiscalRepsitory) {
        this.notaFiscalRepsitory = notaFiscalRepsitory;
    }

    @GetMapping("/{id}")
    public NotaFiscal listar(@PathVariable Long id) {
        return notaFiscalRepsitory.findById(id.longValue());
    }

    @GetMapping("/tudo")
    public List<NotaFiscal> listarTudo() {
        return notaFiscalRepsitory.findAll();
    }

    @PostMapping("/")
    public void incluir(@RequestBody NotaFiscal notaFiscal) {
        notaFiscalRepsitory.save(notaFiscal);
    }

    @PutMapping("/")
    public void update(@RequestBody NotaFiscal notaFiscal ) {notaFiscalRepsitory.save(notaFiscal);}

    @DeleteMapping("/{id}")
    public void apagar(@PathVariable Long id) {
        try {
            notaFiscalRepsitory.deleteById(id);
        } catch (EmptyResultDataAccessException ex) {
            System.out.println("Objeto nao existe");
        }

    }

}


