package br.com.projetosonner.springbackendmysql.repository;

import br.com.projetosonner.springbackendmysql.model.NotaFiscal;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Date;
import java.util.List;

@Repository
public interface NotaFiscalRepsitory extends JpaRepository<NotaFiscal, Long> {

    NotaFiscal findById (long id);

    List<NotaFiscal> findByData (Date data);

    List<NotaFiscal> findByDescricao (String descricao);


}
