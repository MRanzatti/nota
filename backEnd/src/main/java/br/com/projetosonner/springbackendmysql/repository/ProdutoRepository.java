package br.com.projetosonner.springbackendmysql.repository;

import br.com.projetosonner.springbackendmysql.model.Produto;
import org.springframework.stereotype.Repository;
import org.springframework.data.jpa.repository.JpaRepository;

import java.math.BigDecimal;
import java.util.List;
import java.util.Optional;

@Repository
public interface ProdutoRepository extends JpaRepository<Produto, Long> {

    Optional<Produto> findById(Long id);

    List<Produto> findByDescricao(String descricao);

    List<Produto> findByValorUnitario(BigDecimal valorUnitario);

}
