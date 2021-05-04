package br.com.projetosonner.springbackendmysql.repository;


import br.com.projetosonner.springbackendmysql.model.NotaFiscalItem;
import org.springframework.stereotype.Repository;
import org.springframework.data.jpa.repository.JpaRepository;

import java.math.BigDecimal;
import java.util.List;
import java.util.Optional;

@Repository
public interface NotaFiscalItemRepository extends JpaRepository<NotaFiscalItem, Long> {

    Optional<NotaFiscalItem> findById(Long id);

    List<NotaFiscalItem> findByValorUnitario(BigDecimal valorUnitario);

    List<NotaFiscalItem> findByQuantidade(BigDecimal quantidade);

}

