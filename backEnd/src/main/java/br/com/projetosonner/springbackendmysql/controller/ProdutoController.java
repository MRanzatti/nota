package br.com.projetosonner.springbackendmysql.controller;

import br.com.projetosonner.springbackendmysql.model.Produto;
import br.com.projetosonner.springbackendmysql.repository.ProdutoRepository;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/produto")
public class ProdutoController {


    private final ProdutoRepository produtoRepository;

    public ProdutoController(ProdutoRepository produtoRepository) { this.produtoRepository = produtoRepository; }

    @GetMapping("/{id}")
    public Produto listar(@PathVariable Long id) {
        return produtoRepository.findById(id).get();

    }

    @GetMapping("/tudo")
    public List<Produto> listarTudo() {
        return produtoRepository.findAll();
    }

    @PostMapping("/")
    public void incluir(@RequestBody Produto produto) { produtoRepository.save(produto); }

    @PutMapping("/")
    public void update(@RequestBody Produto produto) { produtoRepository.save(produto); }

    @DeleteMapping("/{id}")
    public void apagar(@PathVariable Long id) {
        try {
            produtoRepository.deleteById(id);
        } catch (EmptyResultDataAccessException ex) {
            System.out.println("Objeto nao existe");
        }

}

}